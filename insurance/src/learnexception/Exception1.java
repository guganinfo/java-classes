package learnexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number;");
		
		int no1=0;
		  int no2=0;
		  try {
		   no1 = sc.nextInt();
		   no2 = sc.nextInt();
		   System.out.println(no1/no2);
		   int[] ar = new int[5];
		   ar[6]=67;
		   }finally {
			   System.out.println("finally block");
		   }
		/*  catch(ArithmeticException ae)
		  {
		   System.out.println("Check numbers");
		  }
		  catch(InputMismatchException ime) {
		   System.out.println("Check input");
		  }catch(ArrayIndexOutOfBoundsException ai) {
		   System.out.println("Check index");
		  }catch(Exception ee) {
		   
		  }*/
		  System.out.println(no1+no2);
		  System.out.println(no1-no2);
		  
		  System.out.println(no1*no2);
		  
	}	  
	}
		  
		  
		  
		  