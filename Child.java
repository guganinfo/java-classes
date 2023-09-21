public class Child extends Parent
{
public static void main(String[] args)
{
//Parent pp = new Parent();
	//pp.rest();
Child ch = new Child();
	ch.play();
	ch.rest();
	//An object of one class acting as asn object of an another class.
}
public void play()
{
	System.out.println("playing");	
}
}

