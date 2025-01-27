import java.util.Scanner;
class Demo05{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Username:");
        String username=scanner.next();
        System.out.println("Password:");
        String password=scanner.next();
        while(username.equals("user001")&& password.equals("user_001")){
        System.out.println("Hello happy new year 2025");
        break;
        }
    }
}