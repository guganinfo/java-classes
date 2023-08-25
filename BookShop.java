public class BookShop
{

	static String name = "gugan";
	static int doorNo = 40;
    String bookName = "abc";	
	 int price =40;
	
	String bookName2 = "bcd";
	int price2 = 55;
	
public static void main(String[] args)
{
  System.out.println(BookShop.name);
					 
  System.out.println(BookShop.doorNo);
  BookShop harris1 = new BookShop();
  System.out.println(harris1.bookName);
	System.out.println(harris1.price);
	
	BookShop harris2 = new BookShop();
	System.out.println(harris2.bookName2);
	System.out.println(harris2.price2);
}
  
  
}