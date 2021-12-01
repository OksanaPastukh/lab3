package lab3.task1;

public class task1 {
    public static void main(String[] args) {

        Address address = new Address("Ukraine","Lviv","Shevchenko",20,5);
        User user = new User("Ivanov", "Ivan", "Ivanovich", 20, address);
        user.out();
        ValidateException.check(user);
    }
}