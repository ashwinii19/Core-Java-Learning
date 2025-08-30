package com.techlabs.Guitar.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.techlabs.Guitar.model.Builder;
import com.techlabs.Guitar.model.Guitar;
import com.techlabs.Guitar.model.GuitarSpec;
import com.techlabs.Guitar.model.Inventory;
import com.techlabs.Guitar.model.Type;
import com.techlabs.Guitar.model.Wood;

public class FindGuitarTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n🎸 GUITAR INVENTORY MENU");
            System.out.println("1. Add Guitar");
            System.out.println("2. Search Guitar");
            System.out.println("3. View All Guitars");
            System.out.println("4. Delete Guitar");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a number from 1 to 5.");
                continue;
            }

            switch (choice) {
                case 1:
                	String serial;
                	while (true) {
                	    System.out.print("Enter Serial Number (digits only): ");
                	    serial = sc.nextLine();
                	    if (serial.matches("\\d+")) {
                	        break;
                	    } else {
                	        System.out.println("❌ Invalid serial number. Digits only.");
                	    }
                	}
                	
                	double price;
                	while (true) {
                	    System.out.print("Enter Price: ");
                	    String priceInput = sc.nextLine();
                	    try {
                	        price = Double.parseDouble(priceInput);
                	        if (price >= 0) break;
                	        System.out.println("❌ Price must be non-negative.");
                	    } catch (NumberFormatException e) {
                	        System.out.println("❌ Invalid price. Enter a valid number.");
                	    }
                	}
                	
                    Builder builder = Builder.valueOf(promptEnum(sc, "Builder", Builder.values()));
                    System.out.print("Enter Model: ");
                    String model = sc.nextLine();

                    Type type = Type.valueOf(promptEnum(sc, "Type", Type.values()));

                    System.out.print("Enter Number of Strings: ");
                    int numStrings = Integer.parseInt(sc.nextLine());

                    Wood backWood = Wood.valueOf(promptEnum(sc, "Back Wood", Wood.values()));
                    Wood topWood = Wood.valueOf(promptEnum(sc, "Top Wood", Wood.values()));

                    inventory.addGuitar(serial, price, builder, model, type, numStrings, backWood, topWood);
                    System.out.println("✅ Guitar added successfully.");
                    break;

                case 2:
                    List<Guitar> searchResults = inventory.getAllGuitars();
                    Scanner scanner = new Scanner(System.in);
                    Set<Integer> appliedFilters = new HashSet<>();

                    while (true) {
                        System.out.println("\n🔍 What do you want to filter by?");
                        int optionNumber = 1;
                        Map<Integer, String> optionsMap = new HashMap<>();

                        if (!appliedFilters.contains(1)) optionsMap.put(optionNumber++, "Builder");
                        if (!appliedFilters.contains(2)) optionsMap.put(optionNumber++, "Model");
                        if (!appliedFilters.contains(3)) optionsMap.put(optionNumber++, "Type");
                        if (!appliedFilters.contains(4)) optionsMap.put(optionNumber++, "Strings");
                        if (!appliedFilters.contains(5)) optionsMap.put(optionNumber++, "BackWood");
                        if (!appliedFilters.contains(6)) optionsMap.put(optionNumber++, "TopWood");
                        if (!appliedFilters.contains(7)) optionsMap.put(optionNumber++, "Price");

                        for (Map.Entry<Integer, String> entry : optionsMap.entrySet()) {
                            System.out.println(entry.getKey() + ". " + entry.getValue());
                        }

                        System.out.print("Enter choice: ");
                        String filterChoiceInput = scanner.nextLine().trim();
                        int filterChoice;
                        try {
                            filterChoice = Integer.parseInt(filterChoiceInput);
                        } catch (NumberFormatException e) {
                            System.out.println("❌ Invalid input. Try again.");
                            continue;
                        }

                        String selectedFilter = optionsMap.get(filterChoice);
                        if (selectedFilter == null) {
                            System.out.println("❌ Invalid choice. Try again.");
                            continue;
                        }

                        switch (selectedFilter) {
                            case "Builder":
                                while (true) {
                                    Set<Builder> availableBuilders = searchResults.stream()
                                            .map(g -> g.getSpec().getBuilder())
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                                    if (availableBuilders.isEmpty()) {
                                        System.out.println("❌ No available builders to filter.");
                                        break;
                                    }

                                    Map<Integer, Builder> builderMap = new HashMap<>();
                                    int index = 1;
                                    System.out.print("Available Builders: ");
                                    for (Builder b : availableBuilders) {
                                        System.out.print("[" + index + ". " + b + "] ");
                                        builderMap.put(index++, b);
                                    }
                                    System.out.println("\nEnter Builder: ");
                                    String input1 = scanner.nextLine().trim();
                                    try {
                                        int selected = Integer.parseInt(input1);
                                        if (!builderMap.containsKey(selected)) throw new Exception();
                                        Builder builderFilter = builderMap.get(selected);
                                        searchResults = searchResults.stream()
                                                .filter(g -> g.getSpec().getBuilder().equals(builderFilter))
                                                .collect(Collectors.toList());
                                        appliedFilters.add(1);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("❌ Invalid builder. Try again.");
                                    }
                                }
                                break;

                            case "Model":
                                System.out.print("Enter Model: ");
                                String modelInput = scanner.nextLine().toLowerCase();
                                searchResults = searchResults.stream()
                                        .filter(g -> g.getSpec().getModel().toLowerCase().equals(modelInput))
                                        .collect(Collectors.toList());
                                appliedFilters.add(2);
                                break;

                            case "Type":
                                while (true) {
                                    Set<Type> availableTypes = searchResults.stream()
                                            .map(g -> g.getSpec().getType())
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                                    if (availableTypes.isEmpty()) {
                                        System.out.println("❌ No available types to filter.");
                                        break;
                                    }

                                    Map<Integer, Type> typeMap = new HashMap<>();
                                    int i = 1;
                                    System.out.print("Available Types: ");
                                    for (Type t : availableTypes) {
                                        System.out.print("[" + i + ". " + t + "] ");
                                        typeMap.put(i++, t);
                                    }
                                    System.out.println("\nEnter Type: ");
                                    String input1 = scanner.nextLine().trim();
                                    try {
                                        int selected = Integer.parseInt(input1);
                                        if (!typeMap.containsKey(selected)) throw new Exception();
                                        Type typeFilter = typeMap.get(selected);
                                        searchResults = searchResults.stream()
                                                .filter(g -> g.getSpec().getType().equals(typeFilter))
                                                .collect(Collectors.toList());
                                        appliedFilters.add(3);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("❌ Invalid type. Try again.");
                                    }
                                }
                                break;

                            case "Strings":
                                while (true) {
                                    Set<Integer> availableStrings = searchResults.stream()
                                            .map(g -> g.getSpec().getNumStrings())
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                                    System.out.print("Available Strings: " + availableStrings + "\nEnter number of strings: ");
                                    String input1 = scanner.nextLine().trim();
                                    try {
                                        int strings = Integer.parseInt(input1);
                                        if (!availableStrings.contains(strings)) throw new Exception();
                                        searchResults = searchResults.stream()
                                                .filter(g -> g.getSpec().getNumStrings() == strings)
                                                .collect(Collectors.toList());
                                        appliedFilters.add(4);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("❌ Invalid number. Try again.");
                                    }
                                }
                                break;

                            case "BackWood":
                                while (true) {
                                    Set<Wood> availableBackWoods = searchResults.stream()
                                            .map(g -> g.getSpec().getBackWood())
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                                    if (availableBackWoods.isEmpty()) {
                                        System.out.println("❌ No available backwoods.");
                                        break;
                                    }

                                    Map<Integer, Wood> backWoodMap = new HashMap<>();
                                    int j = 1;
                                    System.out.print("Available BackWoods: ");
                                    for (Wood w : availableBackWoods) {
                                        System.out.print("[" + j + ". " + w + "] ");
                                        backWoodMap.put(j++, w);
                                    }
                                    System.out.println("\nEnter BackWood: ");
                                    String input1 = scanner.nextLine().trim();
                                    try {
                                        int selected = Integer.parseInt(input1);
                                        if (!backWoodMap.containsKey(selected)) throw new Exception();
                                        Wood selectedWood = backWoodMap.get(selected);
                                        searchResults = searchResults.stream()
                                                .filter(g -> g.getSpec().getBackWood().equals(selectedWood))
                                                .collect(Collectors.toList());
                                        appliedFilters.add(5);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("❌ Invalid backwood. Try again.");
                                    }
                                }
                                break;

                            case "TopWood":
                                while (true) {
                                    Set<Wood> availableTopWoods = searchResults.stream()
                                            .map(g -> g.getSpec().getTopWood())
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                                    if (availableTopWoods.isEmpty()) {
                                        System.out.println("❌ No available topwoods.");
                                        break;
                                    }

                                    Map<Integer, Wood> topWoodMap = new HashMap<>();
                                    int k = 1;
                                    System.out.print("Available TopWoods: ");
                                    for (Wood w : availableTopWoods) {
                                        System.out.print("[" + k + ". " + w + "] ");
                                        topWoodMap.put(k++, w);
                                    }
                                    System.out.println("\nEnter TopWood: ");
                                    String input1 = scanner.nextLine().trim();
                                    try {
                                        int selected = Integer.parseInt(input1);
                                        if (!topWoodMap.containsKey(selected)) throw new Exception();
                                        Wood selectedWood = topWoodMap.get(selected);
                                        searchResults = searchResults.stream()
                                                .filter(g -> g.getSpec().getTopWood().equals(selectedWood))
                                                .collect(Collectors.toList());
                                        appliedFilters.add(6);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("❌ Invalid topwood. Try again.");
                                    }
                                }
                                break;

                            case "Price":
                                while (true) {
                                    System.out.print("Enter max price: ");
                                    String input1 = scanner.nextLine().trim();
                                    try {
                                        double price1 = Double.parseDouble(input1);
                                        searchResults = searchResults.stream()
                                                .filter(g -> g.getPrice() <= price1)
                                                .collect(Collectors.toList());
                                        appliedFilters.add(7);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("❌ Invalid price. Try again.");
                                    }
                                }
                                break;
                        }

                        System.out.print("Do you want to apply another filter? (yes/no): ");
                        String next = scanner.nextLine().trim().toLowerCase();
                        if (!next.equals("yes")) break;
                    }

                    if (searchResults.isEmpty()) {
                        System.out.println("No guitars found matching the search.");
                    } else {
                        printGuitars(searchResults);
                    }
                    break;

                	
                case 3:
                    List<Guitar> allGuitars = inventory.getAllGuitars();
                    if (allGuitars.isEmpty()) {
                        System.out.println("No guitars in inventory.");
                    } else {
                        printGuitars(allGuitars);
                    }
                    break;

                case 4:
                    System.out.print("Enter Serial Number to Delete: ");
                    String delSerial = sc.nextLine();
                    boolean removed = inventory.removeGuitar(delSerial);
                    if (removed) {
                        System.out.println("✅ Guitar deleted successfully.");
                    } else {
                        System.out.println("❌ No such serial number found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }

    private static String promptEnum(Scanner sc, String label, Enum<?>[] values) {
        System.out.println("Select " + label + ":");
        for (int i = 0; i < values.length; i++) {
            System.out.println((i + 1) + ". " + values[i]);
        }

        while (true) {
            System.out.print("Enter choice (1-" + values.length + "): ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= values.length) {
                    return values[choice - 1].name();
                }
            } catch (NumberFormatException ignored) {}
            System.out.println("Invalid " + label + " choice. Try again.");
        }
    }

    private static void printGuitars(List<Guitar> guitars) {
        System.out.println("+------------+--------+--------+-------------+----------+------------+--------------------+--------------------+");
        System.out.printf("| %-10s | %-6s | %-6s | %-11s | %-8s | %-10s | %-18s | %-18s |\n",
                "Serial No.", "Price", "Builder", "Model", "Type", "Strings", "Back Wood", "Top Wood");
        System.out.println("+------------+--------+--------+-------------+----------+------------+--------------------+--------------------+");
        for (Guitar g : guitars) {
            GuitarSpec s = g.getSpec();
            System.out.printf("| %-10s | %-6.0f | %-6s | %-11s | %-8s | %-10d | %-18s | %-18s |\n",
                    g.getSerialNumber(), g.getPrice(), s.getBuilder(), s.getModel(), s.getType(),
                    s.getNumStrings(), s.getBackWood(), s.getTopWood());
        }
        System.out.println("+------------+--------+--------+-------------+----------+------------+--------------------+--------------------+");
    }
}