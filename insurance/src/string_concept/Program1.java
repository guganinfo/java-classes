package string_concept;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
	 String name = "guganbharathi";
	 Scanner sc =new Scanner(System.in);
	 
	 System.out.println("enter any words: ");
	 String input =sc.next();
	 char ch = input.charAt(0);
	 int count =0;
	for(int i=0;i<name.length();i++) {
		if(ch==name.charAt(i)) {
	System.out.print(name.charAt(i));
		count++;
	}
	
}
System.out.println(count);
}
}