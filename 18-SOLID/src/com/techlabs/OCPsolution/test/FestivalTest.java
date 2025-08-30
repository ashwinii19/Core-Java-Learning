package com.techlabs.OCPsolution.test;

import java.util.Scanner;

import com.techlabs.OCPsolution.model.DiwaliInterest;
import com.techlabs.OCPsolution.model.FixedDeposit;
import com.techlabs.OCPsolution.model.HoliInterest;
import com.techlabs.OCPsolution.model.IFestivalInterest;
import com.techlabs.OCPsolution.model.NewYearInterest;
import com.techlabs.OCPsolution.model.OtherInterest;

public class FestivalTest {

    private static IFestivalInterest interest;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Duration (in years): ");
        int duration = scanner.nextInt();

        System.out.println("Select Festival Type:");
        System.out.println("1. Diwali");
        System.out.println("2. Holi");
        System.out.println("3. New Year");
        System.out.println("4. Others");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Fest fest = new Fest();

        switch (choice) {
            case 1:
                interest = new DiwaliInterest();
                break;
            case 2:
                interest = new HoliInterest();
                break;
            case 3:
                interest = new NewYearInterest();
                break;
            case 4:
                interest = new OtherInterest();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Other.");
                interest = new OtherInterest();
        }

        System.out.println("Selected Festival Interest Rate: " + fest.festType(interest));

        FixedDeposit fd = new FixedDeposit(accountNumber, name, principal, duration, interest);
        double interestAmount = fd.calculateSimpleInterest();

        System.out.println("Simple Interest: " + interestAmount);
    }
}