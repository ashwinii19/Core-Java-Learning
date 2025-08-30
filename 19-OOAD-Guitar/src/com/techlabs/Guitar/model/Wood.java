package com.techlabs.Guitar.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

	@Override
	public String toString() {
		return name().replace('_', ' ').charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
	}

	public static Wood getEnum(String value) {
		for (Wood w : Wood.values()) {
			if (w.name().equalsIgnoreCase(value)) {
				return w;
			}
		}
		throw new IllegalArgumentException(
				"❌ Invalid enum value in file: No enum constant Wood." + value.toUpperCase());
	}
}
