import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF A :");
        int a = sc.nextInt();
        System.out.print("ENTER THE VALUE OF B : ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("THE VALUE AFTER THE SWAP");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

}
