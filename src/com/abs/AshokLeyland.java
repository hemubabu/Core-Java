package com.abs;

public class AshokLeyland implements Inter{

	@Override
	public void BusName() {
		System.out.println("ALBUS");
		
	}

	@Override
	public void BusSymbol() {
		System.out.println("AL");
		// TODO Auto-generated method stub
		
	}
	public void Normal() {
		System.out.println("Normal");
	}
	public static void main(String[] args) {
		AshokLeyland A = new AshokLeyland();
		A.BusName();
		A.BusSymbol();
		A.Normal();
		// create object for interface methods
		Inter I = new AshokLeyland();
		I.BusName();
		I.BusSymbol();
		
		
	}

	
		

}
