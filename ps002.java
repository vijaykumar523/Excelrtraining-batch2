import java.util.Scanner;
class Ps001{
    Scanner scanner=new Scanner(System.in);
    int id;
    String firstName;
    String lastname;
    String address;
    int hoursworked;
    int amountperhour;
public Ps001(){
System.out.println("Enter the id:");
this.id=scanner.nextInt();
System.out.println("Enter the first_name: ");
this.firstName=scanner.next();
System.out.println("Enter the last_name:");
this.lastname=scanner.next();
System.out.println("Enter the address: ");
this.address=scanner.next();
System.out.println("Enter the hours worked:");
this.hoursworked=scanner.nextInt();
System.out.println("Enter the amount per hour:");
this.amountperhour=scanner.nextInt();
}
public Ps001(String lastname,String address){
    this.lastname=lastname;
    this.address=address;
}
String getFullName(){
return this.firstName+" "+this.lastname;
}
int computesal(){
return this.hoursworked*this.amountperhour;
    }
void showdetails(){
     System.out.println("Hours Worked: " + this.hoursworked);
        System.out.println("Amount Per Hour: " + this.amountperhour);
        System.out.println("Salary: " + computesal());
}
class parttimeemployee extends Ps001{
public parttimeemployee() {
        super();
    }

public parttimeemployee(int hoursWorked, int amountPerHour) {
        this.hoursworked=hoursWorked;
        this.amountperhour=amountPerHour;
    }
}
}
public class ps002{ 
public static void main(String[] args){
    Ps001 employee=new Ps001();
   
   System.out.println(employee.getFullName());
   employee.showdetails();
}
}