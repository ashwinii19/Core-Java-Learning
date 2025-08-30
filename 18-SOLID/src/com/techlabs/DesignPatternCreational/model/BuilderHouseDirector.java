package com.techlabs.DesignPatternCreational.model;
//Director – the one who decides the order of building 
public class BuilderHouseDirector {

	    private IHouseBuilder builder;

	    public BuilderHouseDirector(IHouseBuilder builder) {
	        this.builder = builder;
	    }

	    public BuilderPatternHouse constructHouse() {     //Ek ek karke banana chalu karunge
	        builder.buildFoundation();   // step 1
	        builder.buildStructure();    // step 2
	        builder.buildRoof();         // step 3
	        builder.paintHouse();        // step 4
	        return builder.getHouse();   // final house ready
	    }
}
