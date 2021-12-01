package lab3.task4;

public class FactorialTread extends  Thread{
    @Override
    public void run() {
        Factorial factorial = new Factorial();
        factorial.calculate();
    }
}
