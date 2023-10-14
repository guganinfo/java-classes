package string_concept;

public class Task2 {

	public static void main(String[] args) {
		   
		        String str = "   gugan bharathi   ";
		        String result = "";
		        for (int i = 0; i < str.length(); i++) {
		            if (str.charAt(i) != ' ') {
		                result += str.charAt(i);
		            }
		        }
		        System.out.println(result);
		    }
		

	}


