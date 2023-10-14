package string_concept;

public class Program2 {

	public static void main(String[] args) {
		String name = "guganbharathi";
		  String name2 = "A";
		  //System.out.println(name.charAt(0));
		  //System.out.println(name.length());
		 // System.out.println(name.compareTo(name2));
		  System.out.println(name.compareToIgnoreCase(name2));
		  name = name.concat(name2);
		  System.out.println(name);
		  System.out.println(name.contains("gu"));
		  System.out.println(name.endsWith("bharathiA"));
		  System.out.println();
		  
          System.out.println(name.hashCode());
          System.out.println(name2.hashCode());
	}

}
