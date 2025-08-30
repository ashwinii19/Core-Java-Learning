package com.techlabs.DesignPatternCreational.model;
// Builder Interface – defines steps to build a house
public interface IHouseBuilder {

	void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    BuilderPatternHouse getHouse();
}
