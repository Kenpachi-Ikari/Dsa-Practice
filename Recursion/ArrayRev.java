package Recursion;
import java.util.*;
public class ArrayRev {
    static int[] revRecur(int[] arr,int i,int n)
    {
        int temp=1;
        if(i>=n/2)
            return arr;
        temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        revRecur(arr,i+1,n);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] arr2= revRecur(arr,0,n);
        System.out.println("The reversed array is:");
        for(int j=0;j<n;j++)
            System.out.print(arr2[j] );
    }
}
