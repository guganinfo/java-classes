public class Shop
{
  String name;
	int price;
public static void main(String[] args)	

{
	
	
    Shop  product1 = new Shop();
	         product1.name = "laze";
	         product1.price = 20;
	
	Shop  product2 = new Shop();
	         product2.name = "dairymilk";
	         product2.price = 200;
	
	Shop  product3 = new Shop();
		     product3.name = "kinderJoy";
	         product3.price = 250;

	System.out.println(product1.name);
	System.out.println(product2.name);
	System.out.println(product3.price);

       product1.buy();
       product1.shell(); 
}

public void buy()
{
  System.out.println("Buying products"); 
}
public void shell() 
{
 System.out.println("selling products"); 
}
 

}
