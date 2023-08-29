package com.abs;

public class Abst1 extends Abst {

	@Override
	public void ALBusBody() {
		System.out.println("AshokLeyland Symbol in front body");
		
	}
	public void Company() {
		System.out.println("ASHOK LEYLAND");
	}
	public void Abst() {
		System.out.println("Abstarct Method");
	}

	public static void main(String[] args) {
		Abst1 A = new Abst1();
		A.Company();
		A.ALBusBody();
		A.Abst();
		A.ALBusSeats();
		
		
	}
	

}
