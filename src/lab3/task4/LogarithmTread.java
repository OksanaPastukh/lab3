package lab3.task4;

public class LogarithmTread extends Thread{
    @Override
    public void run() {
        Logarithm logarithm = new Logarithm();
        logarithm.naturalLogarithm();
    }
}
