package learnlooping;

public class Learncontbreakloop {

		public static void main(String[] args) {
			int start=1;
			while(start<=5)
			{
				if(start==2)
				{
					start++;
					continue;
					}
				System.out.print(start+ " ");
			    start++;
			//if(start==5){
				//break;
			}
			start++;
			}
		}


