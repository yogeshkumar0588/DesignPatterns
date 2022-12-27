package com.factory.design.pattern;

public class FactoryDesignPatternMainClass {

	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession profession = professionFactory.getProfession("Teacher");
		profession.print();

	}

}
