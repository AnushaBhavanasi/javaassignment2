import java.util.Scanner;

public class EvenNum {
    public static boolean isEven(int number){
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        System.out.println(isEven(n));
    }
}
