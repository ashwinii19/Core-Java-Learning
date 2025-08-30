package com.techlabs.Guitar.model;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS;

	@Override
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}

	public static Builder getEnum(String value) {
		for (Builder b : Builder.values()) {
			if (b.name().equalsIgnoreCase(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException(
				"❌ Invalid enum value in file: No enum constant Builder." + value.toUpperCase());
	}
}
