public class Employee extends Indianemp implements Rules
{
public static void main(String[] args)
{
 Employee emp = new Employee();
 emp.getSalary();
 emp.hardwork();
 //emp.noOfLeaves = 20;
 System.out.println(emp.noOfLeaves);
 System.out.println(Rules.noOfLeaves);
 System.out.println(Employee.noOfLeaves);
 //emp.leisure();
 emp.takeLeave();
}
public void leisure()
{
System.out.println("chatting");
}
public void getSalary()
{
System.out.println("on 1st every month");
}
public void takeLeave(){
System.out.println("will inform");
}
public void comeOnTIme(){
System.out.println("9 am");
}
}