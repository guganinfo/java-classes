package java_8features;
@FunctionalInterface
public interface Functional_interfacedemo
{
public abstract void add(int no1,int no2);
default void divide() 
{
System.out.println("45");
	
}
static void mu1()
{
	System.out.println("gugan");
}
}