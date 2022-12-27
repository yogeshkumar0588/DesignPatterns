package com.abstarct_factory.design.pattern;

public class ProfessionAbstractFactory extends AbstractFactory{

	@Override
	Profession getProfession(String typeOfProfession) {
		
		if(typeOfProfession == null) {
			return null;
		}
		else if(typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}
		else if(typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}
		else if(typeOfProfession.equalsIgnoreCase("Doctor")) {
			return new Doctor();
		}
		return null;
	}
}
