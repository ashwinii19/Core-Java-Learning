package com.techlabs.servlet.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hehehe")
public class CourseCatalog extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String course = req.getParameter("Coursedrop");
        resp.setContentType("text/html");

        PrintWriter pw = resp.getWriter();

        pw.write("<html><body>");
        pw.write("<h2>Subjects for Selected Course</h2>");
        pw.write("<ul>");

        if (course.equals("cs")) {
            pw.write("<li>SQL</li>");
            pw.write("<li>PHYS</li>");
            pw.write("<li>CHEM</li>");
        } else if (course.equals("ee")) {
            pw.write("<li>Electrical Circuits</li>");
            pw.write("<li>Signals</li>");
            pw.write("<li>Electromagnetics</li>");
        } else if (course.equals("me")) {
            pw.write("<li>Thermodynamics</li>");
            pw.write("<li>Mechanics</li>");
            pw.write("<li>Materials</li>");
        } else if (course.equals("ds")) {
            pw.write("<li>Machine Learning</li>");
            pw.write("<li>Data Mining</li>");
            pw.write("<li>Statistics</li>");
        } else {
            pw.write("<li>No course selected or invalid option.</li>");
        }

        pw.write("<form action='/22-Servlet/CourseCatalog.html' method='get'>");
        pw.write("<input type='submit' value='Go Back'/>");
        pw.write("</form>");

        pw.write("</body></html>");
    }
}
