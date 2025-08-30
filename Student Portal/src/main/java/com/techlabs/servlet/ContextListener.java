package com.techlabs.servlet;

import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.*;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

@WebListener
public class ContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.setAttribute("portalMotto", "Learn. Grow. Succeed.");

        context.setAttribute("loggedInUsers", new ConcurrentHashMap<String, HttpSession>());

        System.out.println("[ContextListener] Portal Initialized Successfully.");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[ContextListener] Portal Shut Down.");
    }
}
