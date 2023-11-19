package Recursion;
import java.util.*;
public class Parameterised {
    static void para(int i, int sum){
        if(i<0)
        {
            System.out.println(sum);
            return;
        }
        para(i-1,sum+i);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int sum=0;
        para(n,sum);
    }
}
