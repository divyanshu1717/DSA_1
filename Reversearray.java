import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER ARRAY SIZE ");
        int n = sc.nextInt();
        int j =0;
        int ans[]=new int[n];
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        System.out.println(ans);
    }
}
