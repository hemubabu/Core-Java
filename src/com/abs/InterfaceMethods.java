package com.abs;

public class InterfaceMethods implements Inter,DindugalBriyani{
	

	@Override
	public void BusName() {
		System.out.println("AshokLeyland");
		
	}

	@Override
	public void BusSymbol() {
		System.out.println("AL");
		
	}

	@Override
	public void ruralArea() {
		System.out.println("8 chair");
		
	}

	@Override
	public void urbanArea() {
		System.out.println("4 chair");
		
	}
	public void method() {
		System.out.println("Interface methods");
	}
	public static void main(String[] args) {
//		InterfaceMethods I = new InterfaceMethods();
//		I.BusName();
//		I.BusSymbol();
//		I.urbanArea();
//		I.ruralArea();
		Inter IN = new InterfaceMethods();
		IN.BusName();
		IN.BusSymbol();
		
		
		
	}
	
	

}
