import java.util.Scanner;
class Demo023{
    int isPalindrome(int num){
        if(num<=0){
            return -1;
        }
       if (num == Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())){
        return 1;//1: 0;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=scanner.nextInt();
        Demo023 demo=new Demo023();
        System.out.println(demo.isPalindrome(num));
    }

}