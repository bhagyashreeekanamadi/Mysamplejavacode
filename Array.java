import java.util.Scanner;
public class Array1D{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
         System.out.println("enter size of array: ");
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<a.length;i++)
         {
             System.out.println("enter marks of student "+i+1+" :");
             a[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++)
         System.out.println("student "+i+" has marks "+a[i]);
    }
    
}
