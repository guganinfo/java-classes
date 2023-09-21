public class Parent extends GrandParent
{

public static void main(String[] args)
{
	Parent pp = new Parent();
	pp.rest();
	//pp.play();
	pp.visit();
}
public void rest()
{
	System.out.println("rest");
}

}