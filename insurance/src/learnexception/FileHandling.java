package learnexception;

import java.io.File;
import java.io.IOException;

public class FileHandling {



	
	 public static void main(String[] args) {
	  
	 FileHandling fh=new FileHandling();
	 fh.file_Checked_Demo(); 
	 fh.mathematical_method(100,0);

	}

	 public void mathematical_method(int n1,int n2) throws ArithmeticException {
	   System.out.println(n1/n2); 
	   //System.out.println("rem");
	 }

	 private void file_Checked_Demo() {
	  File f=new File("/home/azeem/Documents/JAVA/java/Java_Payilagam/Java_Payilagam/src/ExceptionHandling"); 
	  
	  try {
	   f.createNewFile();
	  } catch (IOException e) {
	   e.printStackTrace();
	  } 
	 }

	
}

