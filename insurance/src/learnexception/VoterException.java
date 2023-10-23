package learnexception;

public class VoterException extends RuntimeException{

	public void vote(int age) {
		if (age<18) {
			VoterException ve = new VoterException();
			throw ve;
		}else {
			System.out.println("caste your vote");
		}
	}

}
