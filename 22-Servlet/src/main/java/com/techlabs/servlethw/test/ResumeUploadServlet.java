package com.techlabs.servlethw.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/resume")
public class ResumeUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String skillsInput = request.getParameter("skills");
        String resume = request.getParameter("resume");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        boolean isValid = true;
        String message = "";

        if (name == null || name.length() < 3) {
            isValid = false;
            message += "Name must be at least 3 characters long.<br>";
        }

        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            isValid = false;
            message += "Invalid email format.<br>";
        }

        String[] skills = (skillsInput != null) ? skillsInput.split(",") : new String[0];
        if (skills.length == 0 || (skills.length == 1 && skills[0].trim().isEmpty())) {
            isValid = false;
            message += "At least one skill is required.<br>";
        }

        out.println("<html><body>");

        if (isValid) {
            out.println("<h2 style='color:green;'>Resume Submitted Successfully!</h2>");
            out.println("<h3>Preview:</h3>");
            out.println("<p><strong>Name:</strong> " + name + "</p>");
            out.println("<p><strong>Email:</strong> " + email + "</p>");
            out.println("<p><strong>Skills:</strong><ul>");
            for (String skill : skills) {
                out.println("<li>" + skill.trim() + "</li>");
            }
            out.println("</ul></p>");
            if (resume != null && !resume.trim().isEmpty()) {
                out.println("<p><strong>Resume Summary:</strong><br><pre>" + resume.trim() + "</pre></p>");
            } else {
                out.println("<p><strong>Resume Summary:</strong> Not provided</p>");
            }
        } else {
            out.println("<h2 style='color:red;'>Submission Failed!</h2>");
            out.println("<p>" + message + "</p>");
        }

        out.println("</body></html>");
    }
}