package com.techlabs.bankingdomain.test;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.techlabs.bankingdomain.model.CurrentAccount;
import com.techlabs.bankingdomain.model.LoanAccount;
import com.techlabs.bankingdomain.model.SavingsAccount;

public class BankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String lastAccountUsed = "None";

        double totalDeposited = 0;
        double totalWithdrawn = 0;
        double totalLoanTaken = 0;
        double totalLoanRepaid = 0;

        System.out.println("========== Welcome to TechLabs Banking Portal ==========");

        String name;
        while (true) {
            System.out.print("Please enter your full name: ");
            name = scanner.nextLine();
            if (Pattern.matches("^[a-zA-Z ]+$", name)) {
                break;
            } else {
                System.out.println("Invalid name. Please use only letters and spaces.");
            }
        }

        int age = 0;
        while (true) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine();
                if (age > 0) {
                    break;
                } else {
                    System.out.println("Age must be a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        String mobile;
        while (true) {
            System.out.print("Enter your 10-digit mobile number: ");
            mobile = scanner.nextLine();
            if (Pattern.matches("\\d{10}", mobile)) {
                break;
            } else {
                System.out.println("Invalid mobile number. Please enter exactly 10 digits.");
            }
        }

        System.out.println("\nThank you, " + name + "! Your details have been recorded.");
        System.out.println("You are now entering the banking system...\n");

        // Banking system loop
        while (!exit) {
            System.out.println("--------------------------------------------------");
            System.out.println("Hello " + name + ", please choose an account to proceed:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Loan Account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        lastAccountUsed = "Savings Account";
                        SavingsAccount sa = new SavingsAccount();
                        boolean back1 = false;
                        System.out.println("\n--- Welcome to your Savings Account ---");
                        while (!back1) {
                            System.out.println("\n1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Back to Main Menu");
                            System.out.print("Enter your choice: ");

                            if (scanner.hasNextInt()) {
                                int op = scanner.nextInt();
                                scanner.nextLine();

                                if (op == 1) {
                                    System.out.print("Enter deposit amount: ");
                                    if (scanner.hasNextDouble()) {
                                        double amount = scanner.nextDouble();
                                        scanner.nextLine();
                                        sa.deposit(amount);
                                        totalDeposited += amount;
                                    } else {
                                        System.out.println("Invalid amount!");
                                        scanner.next();
                                    }
                                } else if (op == 2) {
                                    System.out.print("Enter withdrawal amount: ");
                                    if (scanner.hasNextDouble()) {
                                        double amount = scanner.nextDouble();
                                        scanner.nextLine();
                                        sa.withdraw(amount);
                                        totalWithdrawn += amount;
                                    } else {
                                        System.out.println("Invalid amount!");
                                        scanner.next();
                                    }
                                } else if (op == 3) {
                                    sa.checkbalance();
                                } else if (op == 4) {
                                    back1 = true;
                                    System.out.println("Returning to main menu...");
                                } else {
                                    System.out.println("Invalid option.");
                                }
                            } else {
                                System.out.println("Please enter a number.");
                                scanner.next();
                            }
                        }
                        break;

                    case 2:
                        lastAccountUsed = "Current Account";
                        CurrentAccount ca = new CurrentAccount();
                        boolean back2 = false;
                        System.out.println("\n--- Welcome to your Current Account ---");
                        while (!back2) {
                            System.out.println("\n1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Back to Main Menu");
                            System.out.print("Enter your choice: ");

                            if (scanner.hasNextInt()) {
                                int op = scanner.nextInt();
                                scanner.nextLine();

                                if (op == 1) {
                                    System.out.print("Enter deposit amount: ");
                                    if (scanner.hasNextDouble()) {
                                        double amount = scanner.nextDouble();
                                        scanner.nextLine();
                                        ca.deposit(amount);
                                        totalDeposited += amount;
                                    } else {
                                        System.out.println("Invalid amount!");
                                        scanner.next();
                                    }
                                } else if (op == 2) {
                                    System.out.print("Enter withdrawal amount: ");
                                    if (scanner.hasNextDouble()) {
                                        double amount = scanner.nextDouble();
                                        scanner.nextLine();
                                        ca.withdraw(amount);
                                        totalWithdrawn += amount;
                                    } else {
                                        System.out.println("Invalid amount!");
                                        scanner.next();
                                    }
                                } else if (op == 3) {
                                    ca.checkbalance();
                                } else if (op == 4) {
                                    back2 = true;
                                    System.out.println("Returning to main menu...");
                                } else {
                                    System.out.println("Invalid option.");
                                }
                            } else {
                                System.out.println("Please enter a number.");
                                scanner.next();
                            }
                        }
                        break;

                    case 3:
                        lastAccountUsed = "Loan Account";
                        LoanAccount la = new LoanAccount();
                        boolean back3 = false;
                        System.out.println("\n--- Welcome to your Loan Account ---");
                        while (!back3) {
                            System.out.println("\n1. Take Loan");
                            System.out.println("2. Repay Loan");
                            System.out.println("3. Check Outstanding Loan");
                            System.out.println("4. Back to Main Menu");
                            System.out.print("Enter your choice: ");

                            if (scanner.hasNextInt()) {
                                int op = scanner.nextInt();
                                scanner.nextLine();

                                if (op == 1) {
                                    System.out.print("Enter loan amount: ");
                                    if (scanner.hasNextDouble()) {
                                        double amount = scanner.nextDouble();
                                        scanner.nextLine();
                                        la.takeLoan(amount);
                                        totalLoanTaken += amount;
                                    } else {
                                        System.out.println("Invalid amount!");
                                        scanner.next();
                                    }
                                } else if (op == 2) {
                                    System.out.print("Enter repayment amount: ");
                                    if (scanner.hasNextDouble()) {
                                        double amount = scanner.nextDouble();
                                        scanner.nextLine();
                                        la.withdraw(amount);
                                        totalLoanRepaid += amount;
                                    } else {
                                        System.out.println("Invalid amount!");
                                        scanner.next();
                                    }
                                } else if (op == 3) {
                                    la.checkbalance();
                                } else if (op == 4) {
                                    back3 = true;
                                    System.out.println("Returning to main menu...");
                                } else {
                                    System.out.println("Invalid option.");
                                }
                            } else {
                                System.out.println("Please enter a number.");
                                scanner.next();
                            }
                        }
                        break;

                    case 4:
                        System.out.println("\nThank you for banking with us, " + name + "!");
                        System.out.println("=========== SESSION SUMMARY ===========");
                        System.out.println("Name               : " + name);
                        System.out.println("Age                : " + age);
                        System.out.println("Mobile Number      : " + mobile);
                        System.out.println("----------- Account Summary -----------");
                        System.out.println("Total Deposited    : ₹" + totalDeposited);
                        System.out.println("Total Withdrawn    : ₹" + totalWithdrawn);
                        System.out.println("Loan Taken         : ₹" + totalLoanTaken);
                        System.out.println("Loan Repaid        : ₹" + totalLoanRepaid);
                        System.out.println("========================================");
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}