package com.techlabs.Guitar.model;

import java.io.*;
import java.util.*;

public class Inventory {
	private List<Guitar> guitars = new ArrayList<>();
	private static final String FILE_NAME = "guitars.txt";

	public Inventory() {
		loadGuitarsFromFile();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, int numStrings,
			Wood backWood, Wood topWood) {
		GuitarSpec spec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
		saveToFile();
	}

	public boolean removeGuitar(String serialNumber) {
		Iterator<Guitar> it = guitars.iterator();
		while (it.hasNext()) {
			Guitar guitar = it.next();
			if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				it.remove();
				saveToFile();
				return true;
			}
		}
		return false;
	}

	public List<Guitar> getAllGuitars() {
		return guitars;
	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		for (Guitar guitar : guitars) {
			if (guitar.getSpec().matches(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}

	private void saveToFile() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
			for (Guitar g : guitars) {
				GuitarSpec s = g.getSpec();
				writer.write(String.join(",", g.getSerialNumber(), String.valueOf(g.getPrice()), s.getBuilder().name(),
						s.getModel(), s.getType().name(), String.valueOf(s.getNumStrings()), s.getBackWood().name(),
						s.getTopWood().name()));
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error saving to file.");
		}
	}

	private void loadGuitarsFromFile() {
		File file = new File(FILE_NAME);
		if (!file.exists())
			return;

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length != 8)
					continue;

				String serial = data[0];
				double price = Double.parseDouble(data[1]);
				Builder builder = Builder.valueOf(data[2].toUpperCase());
				String model = data[3];
				Type type = Type.valueOf(data[4].toUpperCase());
				int strings = Integer.parseInt(data[5]);
				Wood back = Wood.valueOf(data[6].toUpperCase());
				Wood top = Wood.valueOf(data[7].toUpperCase());

				GuitarSpec spec = new GuitarSpec(builder, model, type, strings, back, top);
				Guitar guitar = new Guitar(serial, price, spec);
				guitars.add(guitar);
			}
		} catch (Exception e) {
			System.out.println("Error loading from file.");
		}
	}
}
