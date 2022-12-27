package com.builder.design.pattern;

public class FloodResistantBuilder implements Builder {

	private Home floodResistantHome = new Home();
	
	@Override
	public void buildFloor() {
		floodResistantHome.floor = "10 feet Above ground level floor";
	}

	@Override
	public void buildWalls() {
		floodResistantHome.walls = "Water resistant walls";
	}

	@Override
	public void buildTerrace() {
		floodResistantHome.terrace = "Water leackage resistant terrace";
	}

	@Override
	public Home getComplexHomeOfObject() {
		return this.floodResistantHome;
	}

}
