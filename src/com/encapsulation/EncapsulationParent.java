package com.encapsulation;

public class EncapsulationParent {

	public static void main(String[] args) {
		EncapsulationConcept E = new EncapsulationConcept();
		E.setRegNO(3023);
		E.setStudentName("Hemanth");
		System.out.println(E.getRegNo());
		System.out.println(E.getStudentName());

	}

}
