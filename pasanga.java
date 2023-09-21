package perambalur;
public class pasanga extends AmmaAppa
{
public pasanga()
{
System.out.println("pasanga no arg - const");
}
public pasanga(int no)
{
super();
System.out.println("pasanga one args - const");
}
public static void main (String[] args)
{

pasanga pp = new pasanga();
pp.meetRelatives();
}
 
 
 }