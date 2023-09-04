public class Trainer
{
 String dept ="java";
 String institute = "payilagam";
public void training()
 {
	 System.out.println("trainerkumar");
	 }
public static void main (String[] args)
{
  Trainer trainerkumar= new Trainer();
  float result =  trainerkumar.add();
  trainerkumar.divide(result);
}
	
public float add()
	{
		return 200+50.5f;
	}
	
public void  divide(float re)
{
	System.out.println(re-10);
}
	


}
