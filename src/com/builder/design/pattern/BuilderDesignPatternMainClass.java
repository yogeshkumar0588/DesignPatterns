package com.builder.design.pattern;

public class BuilderDesignPatternMainClass {
	
	public static void main(String[] args) {
		
		// create object of required homebuilder
		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		FloodResistantBuilder floodResistantBuilder = new FloodResistantBuilder();
		
		// create object of director that will keep an eye on your builder
		Director director = new Director(earthQuakeResistantBuilder);
		Director director1 = new Director(floodResistantBuilder);
		
		director.manageRequiredHomeConstruction();
		Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
		
		director1.manageRequiredHomeConstruction();
		Home homeConstructedAtTheEnda = director1.getComplexObjectOfHome();
		
		System.out.println(homeConstructedAtTheEnd);
		System.out.println(homeConstructedAtTheEnd.floor);
		
		System.out.println(homeConstructedAtTheEnda);
		System.out.println(homeConstructedAtTheEnda.floor);
		
		
		
	}
	
}
