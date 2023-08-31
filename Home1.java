public class Home1
{

    static String name = "gugan";
   static int doorNo =22;
	
    String name1;
	int age1;
	float weight;
	boolean student;
	char lastname;
	
	
	
public static void main(String[] args)
{
	System.out.println(Home1.name);
	System.out.println(Home1.doorNo);

Home1 person1 = new Home1();
    System.out.println("person1.name1 ="+person1.name1);
	System.out.println(person1.age1);
    System.out.println(person1.weight);
	System.out.println(person1.student);
	System.out.println(person1.lastname);
	
	
Home1 person2 = new Home1();
	System.out.println(person2.name1);
	System.out.println(person2.age1);
	
Home1 person3 = new Home1();
     System.out.println(person3.name1);
	System.out.println(person3.age1);
}
	
	
	
	
}