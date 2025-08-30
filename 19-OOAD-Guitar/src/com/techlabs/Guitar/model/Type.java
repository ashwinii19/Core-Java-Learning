package com.techlabs.Guitar.model;

public enum Type {
	ACOUSTIC, ELECTRIC;

	@Override
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}

	public static Type getEnum(String value) {
		for (Type t : Type.values()) {
			if (t.name().equalsIgnoreCase(value)) {
				return t;
			}
		}
		throw new IllegalArgumentException(
				"❌ Invalid enum value in file: No enum constant Type." + value.toUpperCase());
	}
}
