import java.util.Scanner;
class Demo06{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Username:");
        String username=scanner.next();
        System.out.println("Password:");
        String password=scanner.next();
        while(username.equals("Aryan")&& password.equals("Aryan@123")){
        System.out.println("Hello Aryan");
        break;
        }
        if((username != "Aryan")&&(password != "Aryan@123")){
            System.out.println("invalid");
        }
    }
}