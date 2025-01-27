import java.util.Scanner;
class Demo022{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=scanner.nextInt();
        if(year % 4==0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
}