import java.util.Scanner;

public class Power {
    static int powerOfFour(int n)
    {
        if(n == 0)
            return 0;
        while(n != 1)
        {
            if(n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }
    public static void main(String[] args)
    {

        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(powerOfFour(n) == 1)
            System.out.println(n + " is a power of 4");
        else
            System.out.println(n + "is not a power of 4");
    }
}
