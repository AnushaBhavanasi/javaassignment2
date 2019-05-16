import java.util.Scanner;

/*public class Factorial {
   static int factorial(int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("the factorial of "+i+"is \t"+factorial(i));
        }
    }
}*/
public class Factorial {

    public static void main(String[] args)
    {
        Factorial aFactorialInt = new Factorial();

        System.out.println("Int factorials:");
        aFactorialInt.printIntFactorials();

        System.out.println("Long factorials:");
        aFactorialInt.printLongFactorials();
    }

    private void printIntFactorials()
    {
        int i  = 1;
        int fn = 1;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Integer.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }

    }

    private void printLongFactorials()
    {
        long i  = 1L;
        long fn = 1L;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Long.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }

    }
}
