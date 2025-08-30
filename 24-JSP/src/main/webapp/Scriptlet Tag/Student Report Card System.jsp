<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Report Card</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f4f8;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 700px;
            margin: auto;
            background-color: #ffffff;
            padding: 25px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color: #2c3e50;
        }

        h3 {
            color: #34495e;
            margin-top: 30px;
            border-bottom: 1px solid #ccc;
            padding-bottom: 5px;
        }

        p {
            font-size: 16px;
            line-height: 1.6;
        }

        strong {
            color: #2c3e50;
        }
    </style>
</head>
<body>

	<h1>Student Report Card</h1>

	<%!public double calculateTotal(double math, double science, double english) {
		return math + science + english;
	}

	public double calculateAverage(double total) {
		return total / 3;
	}

	public String getGrade(double average) {
		if (average >= 90) {
			return "A+";
		} else if (average >= 80) {
			return "A";
		} else if (average >= 70) {
			return "B";
		} else if (average >= 60) {
			return "C";
		} else {
			return "Fail";
		}
	}

	public String getStatus(String grade) {
		if (grade.equals("A+") || grade.equals("A") || grade.equals("B") || grade.equals("C")) {
			return "Pass";
		} else {
			return "Fail";
		}
	}%>

	<%
	String studentName = "Amit Tiwari";
	String rollNumber = "101";
	double mathMarks = 85;
	double scienceMarks = 76;
	double englishMarks = 92;

	double totalMarks = calculateTotal(mathMarks, scienceMarks, englishMarks);
	double averageMarks = calculateAverage(totalMarks);
	String grade = getGrade(averageMarks);
	String status = getStatus(grade);
	%>

	<h3>Student Details</h3>
    <p><strong>Name:</strong> <%= studentName %></p>
    <p><strong>Roll Number:</strong> <%= rollNumber %></p>

    <h3>Marks</h3>
    <p><strong>Math:</strong> <%= mathMarks %></p>
    <p><strong>Science:</strong> <%= scienceMarks %></p>
    <p><strong>English:</strong> <%= englishMarks %></p>

    <h3>Results</h3>
    <p><strong>Total Marks:</strong> <%= totalMarks %></p>
    <p><strong>Average Marks:</strong> <%= averageMarks %></p>
    <p><strong>Grade:</strong> <%= grade %></p>
    <p><strong>Status:</strong> <%= status %></p>
</body>
</html>