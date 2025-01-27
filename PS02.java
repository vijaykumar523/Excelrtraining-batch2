import java.util.Scanner;
class ps02{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int multiple=((num/100)+1)*100;
        System.out.println("The  nearest multiple of given num is:"+multiple);
    }
}