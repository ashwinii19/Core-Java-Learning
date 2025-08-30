package com.techlabs.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter({ "/dashboard", "/assignments" })
public class ActivityTrackerFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession(false);

		if (session != null) {
			List<String> visitedPages = (List<String>) session.getAttribute("visitedPages");
			if (visitedPages == null) {
				visitedPages = new ArrayList<>();
			}

			String uri = req.getRequestURI();
			if (!visitedPages.contains(uri)) {
				visitedPages.add(uri);
			}

			session.setAttribute("visitedPages", visitedPages);
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
	}

	public void destroy() {
	}
}
