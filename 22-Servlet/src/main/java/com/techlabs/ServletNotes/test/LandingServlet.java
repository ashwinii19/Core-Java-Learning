package com.techlabs.ServletNotes.test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet("/welcome")
public class LandingServlet extends HttpServlet {
    public void init() {
        ServletContext context = getServletContext();
        context.setAttribute("totalVisitors", 0);
        context.setAttribute("fictionCount", 0);
        context.setAttribute("techCount", 0);
        context.setAttribute("scienceCount", 0);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletContext context = getServletContext();
        int total = (int) context.getAttribute("totalVisitors");
        context.setAttribute("totalVisitors", ++total);

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<html><head><style>");
        out.println("body { font-family: 'Segoe UI', sans-serif; padding: 30px; background-color: #f9f9f9; }");
        out.println("h2 { color: #4a90e2; } li, p { font-size: 16px; } a { color: #007bff; text-decoration: none; }");
        out.println("</style></head><body>");
        out.println("<h2>Welcome to BookVerse!</h2>");
        out.println("<p><strong>Total Visitors So Far:</strong> " + total + "</p>");
        out.println("<p><strong>Select a Category:</strong></p>");
        out.println("<ul>");
        out.println("<li><a href='category?name=fiction'>1. Fiction</a></li>");
        out.println("<li><a href='category?name=science'>2. Science</a></li>");
        out.println("<li><a href='category?name=technology'>3. Technology</a></li>");
        out.println("</ul>");
        out.println("<br><a href='admin'>Go to Admin Panel</a>");
        out.println("</body></html>");
    }
}