import java.util.Scanner;
class nigger
{
    static int a(int n)
    {
        boolean c = false;

        while(n != 0)
        {
            int d = n % 10;
            int ld = (n / 10) % 10;
            n = n / 10;
            if(ld < d)
            {
                break;
            }
            else if(ld > d)
            {
                c = true;
            }

        }

        int x = 0;
        if(c)
        {
            while(n != 0)
            {
                int d = n % 10;
                n = n /10;
                x = x + d;
            }
        }
        else
        {
            while(n != 0)
            {
                int d = n % 10;
                n = n /10;
                x = x + d;
            }
            x = x - 2;
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean c = false;


        System.out.print(nigger.a(n));
    }
}