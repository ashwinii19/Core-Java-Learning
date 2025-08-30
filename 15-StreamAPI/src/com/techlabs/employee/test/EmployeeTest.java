package com.techlabs.employee.test;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.techlabs.employee.model.Employee;

public class EmployeeTest {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.print("Enter the Number of Employees: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("\n----------------------------------");
            System.out.print("Enter the Name of the Employee: ");
            String name = scanner.nextLine();

            System.out.print("Enter the Salary of the Employee: ");
            double salary = Double.parseDouble(scanner.nextLine());

            System.out.print("Gender (Male/Female or M/F): ");
            String genderInput = scanner.nextLine().trim().toLowerCase();
            String gender;
            if (genderInput.equals("male") || genderInput.equals("m")) {
                gender = "Male";
            } else if (genderInput.equals("female") || genderInput.equals("f")) {
                gender = "Female";
            } else {
                gender = "Other";
            }

            System.out.print("Enter the Joining Date of the Employee (dd-MM-yyyy): ");
            System.out.println();
            String date = scanner.nextLine();
            Date joiningDate = simpleDateFormat.parse(date);

            employees.add(new Employee(name, salary, joiningDate, gender));
        }

        // 1. Max salary
        Employee maxSalaryEmp = employees.stream().max(Comparator.comparingDouble(e -> e.salary)).orElse(null);
        System.out.println("\n1. Employee with Max Salary: " + maxSalaryEmp);

        // 2. Second highest salary
        List<Employee> sortedBySalary = employees.stream().sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed()).collect(Collectors.toList());
        Employee secondHighest = sortedBySalary.size() > 1 ? sortedBySalary.get(1) : null;
        System.out.println("\n2. Employee with Second Highest Salary: " + secondHighest);

        // 3. Most senior employee
        Employee seniorEmp = employees.stream().min(Comparator.comparing(Employee::getJoiningDate)).orElse(null);
        System.out.println("\n3. Most Senior Employee: " + seniorEmp);

        // 4. Count by gender
        Map<String, Long> genderCount = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        
        System.out.println("\n4. Employee Count by Gender:");
        genderCount.forEach((g, c) -> System.out.println(g + ": " + c));

        scanner.close();
    }
}