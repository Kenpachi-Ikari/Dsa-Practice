package Recursion;
import java.util.*;
public class Basics {
    static void rec(int i, int n)
    {
        if(i<1)
            return;
        System.out.println(i);
        rec(i-1,n);
    }
    public static void main(String[] args) {
        //Code to print from N to 1 using recursion
        int n;
        System.out.println("Enter the Total no of elements:");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        rec(n,n);

    }
}
