package com.sjw.springcloud.consumerFeign.filter;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@RestController
@Configuration
public class Filter extends OncePerRequestFilter {


	// 不过滤的URI
	private final String[] notFilter = new String[] {"/login.html", "/admin/login","/admin/checkcode","/admin/safecheck", ".js", ".css", ".png", ".jpg"};

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

		// 请求的URI
		String uri = request.getRequestURI();
		// 是否过滤
		boolean doFilter = true;
		for (String s : notFilter) {
			if (uri.indexOf(s) != -1) {
				// 如果URI中包含不过滤的URI,则不进行过滤
				doFilter = false;
				break;
			}
		}
		// 防止重入.
		request.setAttribute(getClass().getName(), Boolean.TRUE);
		if (doFilter) {
			// 执行过滤
			// 从session中获取登录者实体
			Object accessToken = request.getParameter("accessToken");
			if (accessToken == null) {
				// 如果session中不存在登录者实体,则弹出框提示重新登录
				// 设置request和response的字符集,防止乱码
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				response.sendRedirect(request.getContextPath() + "/login.html");
			} else {
				// 如果session中存在登录者实体,则继续
//				 session.setMaxInactiveInterval(sessionExpire);
                 filterChain.doFilter(request, response);
			}
		} else {
			// 如果不执行过滤，则继续
			filterChain.doFilter(request, response);
		}
	}
}
