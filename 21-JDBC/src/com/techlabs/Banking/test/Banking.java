package com.techlabs.Banking.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.techlabs.Banking.model.Account;
import com.techlabs.Banking.model.AccountManager;

public class Banking {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		AccountManager accountManager = new AccountManager();

		System.out.println("========== Welcome to Banking System ==========");
		boolean exit = false;

		while (!exit) {
			System.out.println("--------------------------------------------------");
			System.out.println("Hello, please choose an account to proceed:");
			System.out.println("1. Add New Account");
			System.out.println("2. Check balance");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Transfer Money");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			try {
				if (scanner.hasNext()) {
					int choice = scanner.nextInt();
					scanner.nextLine();

					switch (choice) {
					case 1:
						System.out.println("--- Let's create a new account. ---");

						String name;
						while (true) {
							System.out.println("Enter the user's name:");
							name = scanner.nextLine();
							if (Pattern.matches("^[a-zA-Z ]+$", name)) {
								break;
							} else {
								System.out.println("Invalid name. Please enter only letters and spaces.");
							}
						}

						double initialbalance = 0.0;
						while (true) {
							System.out.println("Enter the initial deposit amount:");
							if (scanner.hasNextDouble()) {
								initialbalance = scanner.nextDouble();
								scanner.nextLine();
								if (initialbalance < 0) {
									System.out.println("Amount cannot be negative. Try again.");
									continue;
								}
								break;
							} else {
								System.out.println("Invalid input. Please enter a number.");
								scanner.nextLine();
							}
						}

						accountManager.addAccount(name, initialbalance);
						break;

					case 2:
						System.out.println("--- Checking Account Balance ---");
						int checkaccountId;

						while (true) {
							System.out.println("Please enter the Account ID: ");
							if (scanner.hasNextInt()) {
								checkaccountId = scanner.nextInt();
								scanner.nextLine();
								if (accountManager.accountExists(checkaccountId)) {
									accountManager.checkBalance(checkaccountId);
									break;
								} else {
									System.out.println("Account not found. Try again.");
								}
							} else {
								System.out.println("Invalid input. Please enter a number.");
								scanner.nextLine();
							}
						}
						break;

					case 3:
						System.out.println("--- Deposit Money ---");
						int depositaccount;

						while (true) {
							System.out.println("Please enter the Account ID: ");
							if (scanner.hasNextInt()) {
								depositaccount = scanner.nextInt();
								scanner.nextLine();

								if (accountManager.accountExists(depositaccount)) {
									while (true) {
										System.out.println("Please enter the amount to deposit: ");
										if (scanner.hasNextDouble()) {
											double depositamount = scanner.nextDouble();
											scanner.nextLine();

											if (depositamount > 0) {
												accountManager.depositTo(depositaccount, depositamount);
												break;
											} else {
												System.out.println("Amount must be Greater than 0. Try again.");
											}
										} else {
											System.out.println("Invalid input. Please enter a valid amount.");
											scanner.nextLine();
										}
									}
									break;
								} else {
									System.out.println("Account not found. Try again.");
								}

							} else {
								System.out.println("Invalid input. Please enter a number.");
								scanner.nextLine();
							}
						}
						break;

					case 4:
						System.out.println("--- Withdraw Money ---");
						int withdrawaccount;

						while (true) {
							System.out.println("Please enter the Account ID: ");
							if (scanner.hasNextInt()) {
								withdrawaccount = scanner.nextInt();
								scanner.nextLine();

								if (accountManager.accountExists(withdrawaccount)) {
									while (true) {
										System.out.println("Please enter the amount to withdraw: ");
										if (scanner.hasNextDouble()) {
											double withdrawamount = scanner.nextDouble();
											scanner.nextLine();

											if (withdrawamount <= 0) {
												System.out.println("Amount must be greater than 0.");
												continue;
											}
											try {
												accountManager.withdrawFrom(withdrawaccount, withdrawamount);
												System.out.println("Withdrawal Successful.");
												break;
											} catch (Exception e) {
												System.out.println("Error: " + e.getMessage());
												break;
											}
										} else {
											System.out.println("Invalid input. Please enter a number.");
											scanner.nextLine();
										}
									}
									break;
								} else {
									System.out.println("Account not found. Try again.");
								}
							} else {
								System.out.println("Invalid input. Please enter a number.");
								scanner.nextLine();
							}
						}
						break;

					case 5:
						System.out.println("--- Transfer Money ---");
						int fromId;
						boolean transferDone = false;

						while (!transferDone) {
							System.out.println("Please enter the Account ID of sender: ");
							if (scanner.hasNextInt()) {
								fromId = scanner.nextInt();
								scanner.nextLine();

								int toId;
								if (accountManager.accountExists(fromId)) {
									while (true) {
										System.out.println("Please enter the Account ID of receiver: ");
										if (scanner.hasNextInt()) {
											toId = scanner.nextInt();
											scanner.nextLine();

											if (accountManager.accountExists(toId)) {
												while (true) {
													System.out.println("Please enter the amount to transfer: ");
													if (scanner.hasNextDouble()) {
														double transferamount = scanner.nextDouble();
														scanner.nextLine();

														if (transferamount <= 0) {
															System.out.println("Amount must be greater than 0.");
															continue;
														}

														try {
															accountManager.transfer(fromId, toId, transferamount);
															System.out.println("Transfer Successful.");
															transferDone = true;
															break;
														} catch (Exception e) {
															System.out.println("Error: " + e.getMessage());
															break;
														}
													} else {
														System.out.println("Invalid input. Please enter a number.");
														scanner.nextLine();
													}
												}
												break;
											} else {
												System.out.println("Receiver Account not found. Try again.");
											}
										} else {
											System.out.println("Invalid input. Please enter a number.");
											scanner.nextLine();
										}
									}
									break;
								} else {
									System.out.println("Sender Account not found. Try again.");
								}
							} else {
								System.out.println("Invalid input. Please enter a number.");
								scanner.nextLine();
							}

						}
						break;

					case 6:
						System.out.println("\nThank you, Exiting... ");
						exit = true;
						break;

					default:
						System.out.println("Invalid choice. Please try again.");

					}

				} else {
					System.out.println("Please enter a valid number.");
					scanner.next();
				}
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine();
			}

		}
		scanner.close();
	}
}
