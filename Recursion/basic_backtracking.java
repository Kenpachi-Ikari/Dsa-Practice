package Recursion;
import java.util.*;
//Backtracking program to print all elements from i to N but cant use increment operator
public class basic_backtracking {
    static void rec(int i, int N){
        if(i<1)
            return;
        rec(i-1,N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println("Enter the maximum value:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        rec(n,n);
    }
}
