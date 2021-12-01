package lab3.task3;

import lab3.Student.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentSimple {
    private String name;
    private String surname;
    private String middleName;

    public StudentSimple(final String surname, final String name,final String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName =middleName;

    }

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getMiddleName() {return middleName;}
}
