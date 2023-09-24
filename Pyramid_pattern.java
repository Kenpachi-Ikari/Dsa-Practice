import java.util.Scanner;
public class Pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)//space printing
                System.out.print(" ");
            for(int k=1;k<=(i*2)-1;k++)// star printing
                System.out.print("*");
            System.out.println();
        }
    }
}
