package lab3.task3;

import lab3.Student.Student;
import lab3.Student.StudentCollection;

public class task3 {
    public static void main(final String[] args){
        final StudentCollection collection = new StudentCollection();
        final Student s1 = new Student("Petrov", "Tim", "Petrovich");
        final Student s2 = new Student("Bike", "Jhon","Ivanov");
        final Student s3 = new Student("April", "Tom", "Viktorovich");

        s1.AddMarks("Math",4);
        s1.AddMarks("Math",3);
        s1.AddMarks("English",3);
        s1.AddMarks("English",4);
        s1.AddMarks("English",4);
        s1.AddMarks("English",5);
        s2.AddMarks("Math",2);
        s2.AddMarks("English",4);
        s2.AddMarks("English",3);
        s3.AddMarks("Math",5);


        collection.AddStudents(s1);
        collection.AddStudents(s2);
        collection.AddStudents(s3);
       // System.out.print(collection.hyphenSurname());
        System.out.print(collection.findStudent());
        //System.out.print(collection.englishValue());
       // System.out.print(collection.sortedStudent());
       // collection.modifiedList();
       // collection.printAllStudents();
        //   System.out.println();

    }
}
