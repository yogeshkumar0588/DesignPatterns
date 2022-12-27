package com.builder.design.pattern;

public interface Builder {
	
	public void buildFloor();
	
	public void buildWalls();
	
	public void buildTerrace();
	
	public Home getComplexHomeOfObject();

}
