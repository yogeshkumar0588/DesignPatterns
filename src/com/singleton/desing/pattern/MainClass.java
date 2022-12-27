package com.singleton.desing.pattern;

import com.factory.design.pattern.Teacher;

public class MainClass {

	public static void main(String[] args) {
		SingletonClass singletonObect = SingletonClass.getInstance();
		singletonObect.simpleMethod();
		
		SingletonClass singletonObect2 = SingletonClass.getInstance();
		singletonObect2.simpleMethod();
		
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		
		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);
	}
}
