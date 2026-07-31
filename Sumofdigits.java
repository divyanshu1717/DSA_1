import java.util.Scanner;
public class Sumofdigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("enter the number : ");
        int n = sc.nextInt();
        int sum=0; 
        int rev = 0;
        int r = 0;
        while(n > 0) {
            r = n % 10;
            sum+=r;
         // rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("sum of digit is = " + sum);
    }
}
