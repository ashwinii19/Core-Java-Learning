package com.techlabs.servlet;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		String name = (String) session.getAttribute("studentName");

		if (name != null) {
			ServletContext context = session.getServletContext();
			Object obj = context.getAttribute("loggedInUsers");

			if (obj != null && obj instanceof Map) {
				Map<String, HttpSession> loggedInUsers = (Map<String, HttpSession>) obj;
				loggedInUsers.remove(name);
				System.out.println("Session destroyed for: " + name);
			}
		}
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session created: " + se.getSession().getId());
	}
}
