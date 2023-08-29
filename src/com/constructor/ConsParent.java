package com.constructor;

public class ConsParent {
	public ConsParent() {
		System.out.println("Parent default costructor");
	}
	public ConsParent(int id) {
		this();
		System.out.println("Parent integer constructor"+id);
	}

}
