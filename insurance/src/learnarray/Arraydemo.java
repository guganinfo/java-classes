package learnarray;

public class Arraydemo {

	public static void main(String[] args) 
	{
		int[] marks = {78,98,79,80,35};
		
		Arraydemo.array_iteration(marks);
		Arraydemo. loopingevenstatement(marks);
		Arraydemo.evenposition(marks);
		Arraydemo.tasksum(marks);
		Arraydemo.check_marks(marks);
	}
		//int i=0;
		//while(i<=4)
		{
	//int[] marks = {78,98,79,80,35};
	           //  0  1  2  3  4
	//System.out.println(marks[i]);
//	i++;

	}



public static void array_iteration(int marks[])
{
	
	
/*	for(int i=0;i<=4;i++)
	{
	
	//System.out.println(marks[i]);
	
	}*/
}

public static void loopingevenstatement(int marks[])
{
	for(int i=0;i<=marks.length-1;i++)
	{
	if(marks[i]%2==0)
	{
	//System.out.println(marks[i]);
		
    }
	
}
}

public static void evenposition(int marks[])
{
	for(int i=0;i<=marks.length-1;i+=2) 
	{
		//System.out.println(marks[i]);
	}
}



public static void tasksum(int marks[]) {
int sum=0;int avg=0;
for(int i=0;i<marks.length;i++) {
	sum=sum+marks[i];
	avg=sum/marks.length;
}
System.out.print(sum);
System.out.println();
System.out.println(avg);

}

public static void check_marks(int marks[]) 
{
	
	for(int i=0;i<marks.length;i++) {
		if(marks[i]<=100 && marks[i]>35) {
			System.out.println(marks[i]+  " pass ");
		}
		else
			System.out.println(marks[i]+ "  fail ");
	}
	
	
}
}















