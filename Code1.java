import java.util.Scanner;
public class Code1{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. : ");
        int n=sc.nextInt();
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1;j++)                                  //B
            {
                if(j==0 || i==0 ||i==n/2 || i==n-1 || j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            for(int j=0;j<=n-1;j++)
            {                                                     //H
                if(j==0||j==n-1||i==n/2)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            for(int j=0;j<=n-1;j++)
            {
                if(j==0||j==n-1||i==n/2||i==0)                   //A
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            for(int j=0;j<=n-1;j++)
            {
                if((i==0 &&j<n/2)||(j==0 && i<n/2)||(i==n/2 && j<n/2)||(j==n/2 && i>=n/2)||(i==n/4+1 &&j>=n/4 && j<=n/2)||(i>n/4+1 && j==n/2))                   //G
                System.out.print("*");
                else
                System.out.print(" ");

            }

            
            System.out.print(" ");
            for(int j=0;j<=n-1;j++)
            {
                if((i==j && i<=n/2)||(i+j==n-1 && j>=n/2)||(j==n/2 &&i>n/2))                   //Y
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            for(int j=0;j<=n-1;j++)
            {
                if(j==0||j==n-1||i==n/2||i==0)                   //A
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");
            
            for(int j=0;j<=n-1;j++)
            {
                if(i==0 || i==n/2 || i==n-1 ||(j==0 && i<=n/2)||(j==n-1 && i>=n/2))                   //S
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            for(int j=0;j<=n-1;j++)
            {                                                     //H
                if(j==0||j==n-1||i==n/2)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            for(int j=0;j<=n-1;j++)
            {                                                     //R
                if(j==0||(i==0 && j<=n/2) || (j==n/2 && i<=n/2)||(i==n/2 && j<=n/2)||(i-j==n/2))
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");


            for(int j=0;j<=n-1;j++)
            {                                                     //E
                if(j==0 || i==0 ||i==n/2 ||i==n-1)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            for(int j=0;j<=n-1;j++)
            {                                                     //E
                if(j==0 || i==0 ||i==n/2 ||i==n-1)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.print(" ");

            
            System.out.println();
        }
    }
}