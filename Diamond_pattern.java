public class Diamond_pattern {
    public static void main(String[] args) {
        int n=5, i=1, j=1, k=1;
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>0;j--)//space printing
                System.out.print(" ");
            for(k=1;k<=(2*i)-1;k++)//upper half star printing
                System.out.print("*");
            System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
            for(j=1;j<=n-i;j++)//space printing
                System.out.print(" ");
            for(k=(2*i)-1;k>0;k--)
                System.out.print("*");//lower half star printing
            System.out.println();
        }
    }
}





