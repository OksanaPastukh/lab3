package lab3.task1;

public class Address {
    private final String country;
    private final String city;
    private final String street;
    private final int house;
    private final int flat;

    public Address(String country, String city, String street, int house, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }
    public String out() {
        return
                country + ", " +
                city + ", " +
                street + ", " +
                house + ", " +
                flat + ". ";
    }
}

