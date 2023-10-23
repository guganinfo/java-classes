package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Learnfile {

	public static void main(String[] args) throws IOException {
		
	File ff= new File("/home/guganbharathi/Documents/fullstack/java/filehandling.txt");
 
	try {
		System.out.println(ff.createNewFile());
	} catch (IOException e) {
				e.printStackTrace();
	}	
	
	
	if(ff.canWrite()) {
		FileWriter pen =new FileWriter(ff,false);
		pen.write("g");
		pen.write("u");
		pen.write("g");
		pen.write("a");
		pen.write("n");
		pen.write('2');
		pen.flush();
		pen.close();
	}
     if(ff.canRead()) {
    	 
    	 FileReader reader =new FileReader(ff);
    	 int ch=reader.read();
    	 while(ch!=-1) {
    		 System.out.print((char)ch);
    		 ch=reader.read();
    	 }
    	 
     }
	
	/*	File ff= new File("/home/guganbharathi/Documents/fullstack/java");
		File[] ar =ff.listFiles();
        for(int i=0;i<=ar.length;i++)
        {
        	if(ar[i].isFile())
        		System.out.println(ar[i].getName());
        }*/
		
	}
}