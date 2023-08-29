package org.collections;


public class ArrayData {
	public static void main(String[] args) {
		String[] cars = {"Volvo","Ford","Maruti","Hyundai"};
		System.out.println(cars[1]);
		int i[] = new int[5];
		i[0] = 21;
		i[1] = 22;
		i[2] = 23;
		i[3] = 24;
		i[4] = 25;
		for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
		}
		for(String k:cars) {
			System.out.println(k);
			
		}

		 	}

}
