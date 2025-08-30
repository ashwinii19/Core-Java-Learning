package com.techlabs.servlethw.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class StudentRegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String ageStr = request.getParameter("age");
        String course = request.getParameter("course");

        StringBuilder errors = new StringBuilder();
        int age = 0;

        if (name == null || name.trim().isEmpty()) {
            errors.append("Name is required.<br/>");
        }
        if (email == null || email.trim().isEmpty()) {
            errors.append("Email is required.<br/>");
        }
        if (ageStr == null || ageStr.trim().isEmpty()) {
            errors.append("Age is required.<br/>");
        } else {
            try {
                age = Integer.parseInt(ageStr);
                if (age < 18) {
                    errors.append("Age must be 18 or above.<br/>");
                }
            } catch (NumberFormatException e) {
                errors.append("Age must be a valid number.<br/>");
            }
        }

        if (course == null || course.trim().isEmpty()) {
            errors.append("Please select a course.<br/>");
        }

        out.println("<html><body>");
        if (errors.length() > 0) {
            out.println("<h3 style='color:red;'>Validation Errors:</h3>");
            out.println("<p>" + errors.toString() + "</p>");
            out.println("<a href='student_form.jsp'>Go Back to Form</a>");
        } else {
            out.println("<h3 style='color:green;'>Registration Successful!</h3>");
            out.println("<p><strong>Name:</strong> " + name + "</p>");
            out.println("<p><strong>Email:</strong> " + email + "</p>");
            out.println("<p><strong>Age:</strong> " + age + "</p>");
            out.println("<p><strong>Course:</strong> " + course + "</p>");
        }
        out.println("</body></html>");
    }
}