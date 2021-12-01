package lab3.task4;

import java.math.BigInteger;

public class Factorial {

    public void calculate()
    {
        int result = 1;
        for(int i = 1; i <= 5;i++)
        {
            result *= i;
            System.out.println("Factorial of "+(i)+" is "+ result);
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){}
        }
    }
}
