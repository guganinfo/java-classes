public class Condition
{
public static void main(String[] args)
{
int person1=3;
int person2=12;
int person3=9;
	if (person1>person2)
	{
		if(person1>person3)
		{
			System.out.println("Person1 is Greater");
		}
		else if (person3>person1)
		{
			System.out.println("Person3 is Greater");
		}
		else
		{
			System.out.println("Person1,Person3 is same");
		}
	}
	else if(person2>person1)
	{
		if (person2>person3)
		{
			System.out.println("Person2 is Greater");
		}
		else if(person3>person2)
		{
			System.out.println("Person3 is Greater");
		}
		else
		{
			System.out.println("Person3,Person2 is same");
		}
		
	}
	else 
	{
		if (person2>person3 || person1>person3 )
		{
			System.out.println("Person1,Person2 is same");
		}
		else if(person3>person2 || person1<person3)
		{
			System.out.println("Person3 is Greater");
		}
		else
		{
			System.out.println("Person1,Person2,Person3 is same");
		}
	}
}
}