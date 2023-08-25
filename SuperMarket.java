public class SuperMarket
{

  static  String name ="gugan";
  static int doorNo =41;
	
  String productname1 ="gooday";
  
	int price1 =30;
  
	String productname2 ="happyhappy";
	int price2 =20;
	String productname3 ="hideandseek";
	int price3 =35;
	
  public static void main(String[] args)
  
  {
    
	System.out.println(SuperMarket.name);
	System.out.println(SuperMarket.doorNo);
	  
	 SuperMarket productname1 = new SuperMarket();
	 System.out.println(productname1.productname1);
	  System.out.println(productname1.price1);
	  
		  SuperMarket productname2= new SuperMarket();
	  System.out.println(productname2.productname2);
		  System.out.println(productname2.price2);
	  
		  SuperMarket productname3= new SuperMarket();
		  System.out.println(productname3.productname3);
		  	  System.out.println(productname3.price3);
		  
	}
	}
  