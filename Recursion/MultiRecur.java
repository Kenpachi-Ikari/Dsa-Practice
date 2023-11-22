package Recursion;
import java.util.*;
//Fibonacci number code
public class MultiRecur {
    static int fibo(int n){
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term for which fibonacci has to be found");
        int n= sc.nextInt();
        System.out.println(fibo(n));
    }
}
