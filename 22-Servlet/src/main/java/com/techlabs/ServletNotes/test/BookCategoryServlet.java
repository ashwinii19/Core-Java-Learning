package com.techlabs.ServletNotes.test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet("/category")
public class BookCategoryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletContext context = getServletContext();
        String category = req.getParameter("name");
        String version = "1.2.3";

        int total = (int) context.getAttribute("totalVisitors");
        switch (category.toLowerCase()) {
            case "fiction":
                context.setAttribute("fictionCount", (int) context.getAttribute("fictionCount") + 1);
                break;
            case "science":
                context.setAttribute("scienceCount", (int) context.getAttribute("scienceCount") + 1);
                break;
            case "technology":
                context.setAttribute("techCount", (int) context.getAttribute("techCount") + 1);
                break;
        }

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<html><head><style>");
        out.println("body { font-family: 'Segoe UI', sans-serif; padding: 30px; background-color: #f1faff; }");
        out.println("h2 { color: #28a745; } p { font-size: 16px; } a { color: #007bff; text-decoration: none; }");
        out.println("</style></head><body>");
        out.println("<h2>" + capitalize(category) + " Category Servlet Output:</h2>");
        out.println("<p>Book Category: " + capitalize(category) + "</p>");
        out.println("<p>Store: BookVerse</p>");
        out.println("<p>Admin Email: admin@bookverse.com</p>");
        out.println("<p>Fiction Books Visited: " + context.getAttribute("fictionCount") + "</p>");
        out.println("<p>Science Books Visited: " + context.getAttribute("scienceCount") + "</p>");
        out.println("<p>Technology Books Visited: " + context.getAttribute("techCount") + "</p>");
        out.println("<p>Total Visitors: " + total + "</p>");
        out.println("<p>App Version: " + version + "</p>");
        out.println("<br><a href='welcome'>Back to Home</a>");
        out.println("</body></html>");
    }

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) return "";
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}