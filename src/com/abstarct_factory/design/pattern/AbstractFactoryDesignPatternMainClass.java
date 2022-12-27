package com.abstarct_factory.design.pattern;

public class AbstractFactoryDesignPatternMainClass {

	public static void main(String[] args) {
		
		// First get the Factory instance from factory of factory class, if you want trainee
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
		
		Profession enggieer = abstractFactory.getProfession("Engineer");
		enggieer.print();
		
		Profession doctor = abstractFactory.getProfession("Doctor");
		doctor.print();
		
		Profession teacher = abstractFactory.getProfession("Teacher");
		teacher.print();
	}
}
