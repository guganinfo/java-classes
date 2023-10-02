package learnlooping;

public class Task {

	public static void main(String[] args) {
	 int start =1; int count =20;
		while(true)
	 {
		 if(start%3==0 || start%5==0)
		 {
			 System.out.print(start+" ");
			count++;
		 }
		 start++;
		 if(count==30) {
			 break;
		 }
		 
	 }
	}

}
