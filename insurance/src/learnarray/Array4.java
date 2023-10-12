package learnarray;

public class Array4 
{

	public static void main(String[] args) {
		int[][] marks = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int row =0;row<marks.length;row++)
		{
		 for(int co1=0;co1<marks[row].length;co1++) 
		 {
          if(row==co1)
          {
        	  System.out.println(marks[row][co1]);;
          }
		

}
}
	}
	}	