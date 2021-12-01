package lab3.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int countStudents = 0;

    private  int id=0;
    private String name;
    private String surname;
    private String middleName;
    private List<Subject> subjects;


    public Student(final String surname, final String name,final String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName =middleName;
        subjects = new ArrayList<Subject>();
        id = ++countStudents;

    }

    public String getMiddleName() {return middleName;}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void AddSubject(final String subject_name)
    {
        AddSubject(new Subject(subject_name));
    }
    public void AddSubject(final Subject subject)
    {
        subjects.add(subject);
    }
    public void AddMarks(final String subject_name, final int value)
    {
        Subject needed_subject = findSubject(subject_name);
        if(needed_subject  == null)
        {
            needed_subject = new Subject(subject_name);
            AddSubject(needed_subject);
        }

        needed_subject.AddMarks(value);

    }

    public Subject findSubject(final String subject_name)
    {
        Subject result ;
        result = subjects.stream()
                .filter(subject -> subject.getSubject_name().equals(subject_name))
                .findFirst().orElse(null);
        return  result;
    }

    public double averageValueAllSubject()
    {
        double result;
       result = subjects.stream()
               .mapToDouble((subject)->subject.averageValue())
               .average()
               .getAsDouble();
        return result;
    }
    @Override
    public String toString() {
        return surname + " "+ name + " "+ middleName+ " " + id + '\n'+
                subjects.toString()+ '\n' ;
    }

}