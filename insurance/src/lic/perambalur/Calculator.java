package lic.perambalur;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal =new Calculator();
		
		cal.add();
		cal.add(5);
	}

	public  int add(int i) {
		System.out.println("hi");
		return 10;
		
	}

	public  int add() {
		return 0;
		
	}

}
