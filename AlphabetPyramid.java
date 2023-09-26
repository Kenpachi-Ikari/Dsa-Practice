public class AlphabetPyramid {
    public static void main(String[] args) {
        int i=1,j=1,k=1,l=1,n=5;
        for(i=1;i<=n;i++)
        { char ch='A';
            for(j=n;j>i;j--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
            {
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(l=i-1;l>0;l--) {
                ch--;
                System.out.print(ch);
            }
            System.out.println();

        }
    }
}
