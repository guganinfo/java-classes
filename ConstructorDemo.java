public class ConstructorDemo
{
public ConstructorDemo()
{
System.out.println("Hi i am zero args constructor");
}
public ConstructorDemo(String s)
{
System.out.println("Hi i am default args constructor");
	System.out.println(s);
}	
public ConstructorDemo(float fl)
{
System.out.println("Hi i am default args constructor");
System.out.println(fl);	
}
public ConstructorDemo(float fl,boolean b)
{
System.out.println("Hi i am 2 args constructor");
	
	System.out.println(fl);
	System.out.println(b);
}
public static void main (String[] args)
{

ConstructorDemo cd = new ConstructorDemo("abc");
ConstructorDemo cd2 = new ConstructorDemo();
ConstructorDemo cd3 = new ConstructorDemo(50.5f);
ConstructorDemo cd4 = new ConstructorDemo(50.5f,true);

}





}