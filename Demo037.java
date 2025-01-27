import java.util.Scanner;
public class Demo037{
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num : " );
        int num1=scanner.nextInt();
        System.out.println("Enter second num : " );
        int num2=scanner.nextInt();
        System.out.println("Enter third num : " );
        int num3=scanner.nextInt();
        System.out.println("Enter fourth num : " );
        int num4=scanner.nextInt();
        if(num1>=num2 && num1>=num3 && num1>=num4){
            System.out.println("big num is: "+num1);
        }
        else if(num2>=num1 && num2>=num3 && num2>=num4){
            System.out.println("big num is: "+num2);
        }
        else if(num3>=num1 && num3>=num2 && num3>=num4){
            System.out.println("big num is: "+num2);
        }else{
            System.out.println(num4);
        }
}}