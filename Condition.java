import java.util.Scanner;

public class Condition {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    for(int i =5;i<=10;i++){
        for(int j=1;j<i;j++){
            if(j%5==0){
                break;
            }
            if(j%3==0){
                continue;
            }
            System.out.println(j);
        }
        System.out.println(i);
    }

    
    }
}
