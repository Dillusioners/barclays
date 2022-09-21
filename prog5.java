import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int k = sc.nextInt();
        
        
        for(int i = 1;i <= k;i++)
        {
            for(int space = k - i;space >= 1;space--)
            {
                System.out.print(" ");
            }
            for(int j = 0;j < i;j++)
            {
                if(j == 0 || j == i-1)
                System.out.print("*");
                else
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = k;i > 0;i--)
        {
            for(int space = 0;space <= k - i;space++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j < i - 1;j++)
            {
                if(j == 0 || j == i-2)
                System.out.print("*");
                else
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}