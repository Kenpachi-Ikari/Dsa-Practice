public class PatternNumInvSpace {
    public static void main(String[] args) {
    int i=1,j=1,k=1,l=1,n=6;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
            System.out.print(j);
        for(k=n*2;k>(i*2);k--)
            System.out.print(" ");
        for(l=i;l>0;l--)
            System.out.print(l);

            System.out.println();
    }
    }
}
