package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

    public void init() {
        ServletContext context = getServletContext();
        if (context.getAttribute("portalMotto") == null) {
            context.setAttribute("portalMotto", "Learn. Grow. Succeed.");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("studentName") == null) {
            response.sendRedirect("index.html?error=1");
            return;
        }

        String name = (String) session.getAttribute("studentName");
        Date loginTime = new Date(session.getCreationTime());

        String lastLogin = (String) session.getAttribute("lastLoginTime");
        if (lastLogin == null || lastLogin.equals("First time login")) {
            lastLogin = "This is your first login";
        } else {
            try {
                long millis = Long.parseLong(lastLogin);
                lastLogin = new Date(millis).toString();
            } catch (Exception e) {
                lastLogin = "Unknown";
            }
        }

        ServletContext context = getServletContext();
        Map<String, HttpSession> loggedInUsers = (Map<String, HttpSession>) context.getAttribute("loggedInUsers");
        int onlineCount = (loggedInUsers != null) ? loggedInUsers.size() : 0;

        String motto = (String) context.getAttribute("portalMotto");
        String instructor = getServletConfig().getInitParameter("instructor");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Dashboard</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");

        out.println("<script>");
        out.println("let timeLeft = 600;");
        out.println("setInterval(function() {");
        out.println("  if (timeLeft <= 0) window.location.href = 'logout';");
        out.println("  document.getElementById('timer').innerText = 'Session expires in: ' + timeLeft + ' seconds';");
        out.println("  timeLeft--; }, 1000);");
        out.println("</script>");

        out.println("</head><body class='login-body'>");
        out.println("<div class='login-box'>");

        out.println("<h2>Welcome, " + name + "</h2>");
        out.println("<p>Last Login: " + lastLogin + "</p>");
        out.println("<p>Now Login Time: " + loginTime + "</p>");
        out.println("<p>Instructor: Prof. Amit</p>");
        out.println("<p>Motto: " + motto + "</p>");
        out.println("<p>Currently Online Users: " + onlineCount + "</p>");
        out.println("<p id='timer'></p>");

        out.println("<form action='assignments' method='get'>");
        out.println("<button type='submit' class='btn'>View Assignments</button>");
        out.println("</form>");

        out.println("<form action='logout' method='get'>");
        out.println("<button type='submit' class='btn'>Logout</button>");
        out.println("</form>");

        out.println("</div></body></html>");
    }
}
