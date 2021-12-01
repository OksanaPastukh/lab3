package lab3.task4;

public class Logarithm {

    public void naturalLogarithm()
    {
        double result =0;
        for (int i = 1; i <= 5; i++) {
           result = Math.log(i);
            System.out.println("Natural logarithm of "+(i)+" is "+ result);
            try {
                Thread.sleep(275);
            }catch (InterruptedException e){}
        }
    }
}
