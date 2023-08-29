package com.constructor;

public class Conss {
	public Conss() {
		System.out.println("Default Constructor");
	}
	public Conss(int i) {
		this();
		System.out.println("Parametrized Constructor");
	}
	public static void main(String[] args) {
		Conss C = new Conss(85);
	}
}
