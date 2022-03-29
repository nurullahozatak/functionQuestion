import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        boolean b =true;
        while(b)
        {
            double x;
            double result;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the value");
            x = keyboard.nextDouble();

            if (x < 0)
            {
                result = (2*(Math.abs(x-1)))/3;
            }
            else if (x == 0)
            {
                result = Math.sqrt(2)/Math.sqrt(3);
            }
            else
            {
                result = (2*(Math.abs(x+1)))/3;
            }
            System.out.println("Result of function  :" + result);

            System.out.println("To continue press 1");
            int a = keyboard.nextInt();
            b = a == 1;
        }
        System.out.println("GoodBye");


    }
}
