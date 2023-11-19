package Recursion;
import java.util.*;
public class Functional {
    static int func(int i) {
        if (i == 0)
            return 0;
        return i + func(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last value:");
        int n= sc.nextInt();
        n=func(n);
        System.out.println("The Sum of the Numbers is:");
        System.out.println(n);
    }
}