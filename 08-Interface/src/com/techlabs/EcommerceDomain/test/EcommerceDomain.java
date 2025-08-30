package com.techlabs.EcommerceDomain.test;

import java.util.Scanner;
import com.techlabs.EcommerceDomain.model.*;

public class EcommerceDomain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to SmartPay");
        System.out.println("Let's get started with your payment.\n");

        String userName = "";
        while (true) {
            System.out.print("Enter your name: ");
            userName = scanner.nextLine().trim();
            if (userName.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please use only alphabets and spaces.");
            }
        }

        String recipient = "";
        while (true) {
            System.out.print("Whom are you paying to? ");
            recipient = scanner.nextLine().trim();
            if (recipient.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid recipient name. Only letters and spaces are allowed.");
            }
        }

        double balance = 10000.0;
        Checkout checkout = null;

        while (running) {
            IPaymentGateway gateway = null;

            while (gateway == null) {
                System.out.println("\nSelect Payment Method:");
                System.out.println("1. Credit Card");
                System.out.println("2. UPI");
                System.out.println("3. NetBanking");
                System.out.println("4. Exit");
                System.out.print("Enter choice (1-4): ");

                if (scanner.hasNextInt()) {
                    int methodChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    switch (methodChoice) {
                        case 1: 
                        	gateway = new CreditCard(); 
                        	break;
                        case 2: 
                        	gateway = new UPI(); 
                        	break;
                        case 3: 
                        	gateway = new NetBanking(); 
                        	break;
                        case 4:
                            System.out.println("Thank you for using SmartPay. Goodbye.");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Invalid choice. Please enter 1 to 4.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            }

            checkout = new Checkout(gateway, balance);
            boolean inTransaction = true;

            while (inTransaction) {
                System.out.println("\nHi " + userName + ", what would you like to do?");
                System.out.println("1. Pay");
                System.out.println("2. Refund");
                System.out.println("3. Exit to main menu");
                System.out.print("Enter choice (1-3): ");

                if (scanner.hasNextInt()) {
                    int action = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (action) {
                        case 1:
                            boolean retryPayment = true;
                            while (retryPayment) {
                                System.out.print("Enter amount to PAY to " + recipient + ": ₹");
                                if (scanner.hasNextDouble()) {
                                    double amount = scanner.nextDouble();
                                    scanner.nextLine(); 

                                    if (amount <= 0) {
                                        System.out.println("Amount must be greater than zero.");
                                        continue;
                                    }

                                    if (amount > checkout.getBalance()) {
                                        System.out.println("Insufficient balance. You can only pay ₹" + checkout.getBalance() + " or less.");
                                        System.out.println("Payment cancelled.");

                                        printSummary(userName, recipient, amount, "Payment Cancelled", checkout.getBalance());

                                        String retry;
                                        while (true) {
                                            System.out.print("Do you want to try paying again? (yes/no): ");
                                            retry = scanner.nextLine().trim().toLowerCase();
                                            if (retry.equals("yes") || retry.equals("y")) {
                                                break; 
                                            } else if (retry.equals("no") || retry.equals("n")) {
                                                retryPayment = false;
                                                break;
                                            } else {
                                                System.out.println("Invalid input. Please enter only yes or no.");
                                            }
                                        }
                                    } else {
                                        gateway.pay(amount);
                                        checkout.completePayment(amount);
                                        printSummary(userName, recipient, amount, "Payment Successful", checkout.getBalance());
                                        retryPayment = false;
                                    }

                                } else {
                                    System.out.println("Invalid amount.");
                                    scanner.nextLine(); 
                                }
                            }
                            break;

                        case 2:
                            String confirmRefund;
                            while (true) {
                                System.out.print(recipient + ", Do you want to refund the amount to " + userName + "? (yes/no): ");
                                confirmRefund = scanner.nextLine().trim().toLowerCase();
                                if (confirmRefund.equals("yes") || confirmRefund.equals("y") || confirmRefund.equals("no") || confirmRefund.equals("n")) {
                                    break;
                                } else {
                                    System.out.println("Invalid input. Please enter only yes or no.");
                                }
                            }

                            if (confirmRefund.equals("yes") || confirmRefund.equals("y")) {
                                System.out.print("Enter amount to REFUND to " + userName + ": ₹");
                                if (scanner.hasNextDouble()) {
                                    double amount = scanner.nextDouble();
                                    scanner.nextLine(); 

                                    if (amount <= 0) {
                                        System.out.println("Amount must be greater than zero.");
                                        break;
                                    }

                                    gateway.refund(amount);
                                    checkout.processRefund(amount);
                                    System.out.println("Refund done to " + userName + ".");
                                } else {
                                    System.out.println("Invalid amount.");
                                    scanner.nextLine(); 
                                }
                            } else {
                                System.out.println("Refund cancelled by " + recipient + ".");
                            }
                            break;

                        case 3:
                            balance = checkout.getBalance();
                            System.out.println("Returning to main menu...");
                            inTransaction = false;
                            break;

                        default:
                            System.out.println("Invalid option. Please enter 1, 2, or 3.");
                    }

                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); 
                }
            }
        }
    }

    public static void printSummary(String user, String recipient, double amount, String status, double remainingBalance) {
        System.out.println("\n===== Transaction Summary =====");
        System.out.println("Payer     : " + user);
        System.out.println("Payee     : " + recipient);
        System.out.println("Amount    : ₹" + amount);
        System.out.println("Status    : " + status);
        System.out.println("Balance   : ₹" + remainingBalance);
        System.out.println("================================\n");
    }
}