package com.builder.design.pattern;

public class Director {
	
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Home getComplexObjectOfHome() {
		return this.builder.getComplexHomeOfObject();
	}
	
	public void manageRequiredHomeConstruction() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}

}
