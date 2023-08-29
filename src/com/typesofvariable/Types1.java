package com.typesofvariable;


final class Types1 {
	final int j=7;
	static int i=78;
	int id=20;
  public void variable() {
	  i=68;
	  System.out.println(i);
	  System.out.println(id);
	  System.out.println(j);
  }
  public static void main(String[] args) {
	  int k=45;
	  Types1 T = new Types1();
	  System.out.println(i);
	  T.variable();
	  System.out.println(k);
	  
	
}

}
