package lab3.task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class task4 {
    public static void main(final String[] args){
        //Низькорівнева
        //FactorialTread factorialTread =new FactorialTread();
      //  factorialTread.start();
     //  LogarithmTread logarithmTread = new LogarithmTread();
     //  logarithmTread.start();
        //Високорівнева
        Factorial factorial =new Factorial();
        Logarithm logarithm = new Logarithm();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(()-> factorial.calculate());
        executor.submit(()->logarithm.naturalLogarithm());
        try{
            executor.shutdown();
        } catch (Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }

    }
}
