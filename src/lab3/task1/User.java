package lab3.task1;

public class User {
    public final String surName;
    public final String fistName;
    public final String middleName;
    public final int age;
    public final Address address;

    public User(String surName, String fistName, String middleName, int age, Address address) {
        this.surName = surName;
        this.fistName = fistName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
    }
    public void out() {
        System.out.println(surName + "," + fistName + "," + middleName + '\n'
                + "Age: " + age + '\n'
                + "Address: " + address.out());
    }
}

