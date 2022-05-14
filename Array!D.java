import java.util.Scanner;
public class Array1D{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter size of array: ");
         int n=sc.nextInt();
         String a[][][]=new String[2][2][2];
         for(int i=0;i<a.length;i++)
         {
            for(int j=0;j<a[i].length;j++)
{
    for(int k=0;k<a[i][j].length;k++)
    a[i][j][k]=sc.next();
}    
         }
         for(int i=0;i<a.length;i++)
         {
            for(int j=0;j<a[i].length;j++)
{
    for(int k=0;k<a[i][j].length;k++)
    System.out.println(a[i][j][k]);


        }
    }
}
}
