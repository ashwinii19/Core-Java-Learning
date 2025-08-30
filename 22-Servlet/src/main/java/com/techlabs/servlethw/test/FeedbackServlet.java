package com.techlabs.servlethw.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

    private static final List<String> feedbackList = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String productId = request.getParameter("productId");
        String ratingStr = request.getParameter("rating");
        String review = request.getParameter("review");

        int rating = 0;
        StringBuilder errors = new StringBuilder();

        try {
            rating = Integer.parseInt(ratingStr);
            if (rating < 1 || rating > 5) {
                errors.append("Rating must be between 1 and 5.<br/>");
            }
        } catch (NumberFormatException e) {
            errors.append("Invalid rating.<br/>");
        }

        if (review == null || review.trim().isEmpty()) {
            errors.append("Review cannot be empty.<br/>");
        }

        if (errors.length() > 0) {
            out.println("<h3 style='color:red;'>Validation Errors:</h3>");
            out.println("<p>" + errors.toString() + "</p>");
            out.println("<a href='feedback_form.jsp'>Go Back</a>");
        } else {
            String feedbackEntry = "Product ID: " + productId + ", Rating: " + rating + ", Review: " + review;
            feedbackList.add(feedbackEntry);

            out.println("<html><body>");
            out.println("<h2 style='color:green;'>Thank you for your feedback!</h2>");
            out.println("<p><strong>Product ID:</strong> " + productId + "</p>");
            out.println("<p><strong>Rating:</strong> " + rating + "</p>");
            out.println("</body></html>");
        }
    }
}