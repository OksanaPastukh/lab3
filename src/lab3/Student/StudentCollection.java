package lab3.Student;

import lab3.task3.StudentSimple;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentCollection {
    private List<Student> students;

    public StudentCollection()
    {
        students = new ArrayList<Student>();
    }

    public void AddStudents(final Student student){
        students.add(student);
    }

    public void addSubjectToAll(final String subject_name){
        for(final Student student: students){
            student.AddSubject(subject_name);
        }
    }

    public  void printAllStudents(){
        for(final Student student : students){
            System.out.println(student.toString());
        }
    }

    public Map<Integer,List<Mark>> map(final String subject_name)
    {
        final Map<Integer,List<Mark>> result = new HashMap<>();
        Subject subject = null;
        for (final Student student : students) {
            subject = student.findSubject(subject_name);
            if(subject!= null) {
                result.put(student.getId(),subject.getMarks());
            }
        }
        return result;
    }

    public void modifiedList()
    {
        List<Student> result = new ArrayList<Student>();
        result= students.stream()
                .filter(student -> student.averageValueAllSubject() > 3 )
                .toList();
        students = result;

    }
    public List<String> englishValue ()
    {
        List<String> result = new ArrayList<String>();
        result = students.stream()
                .filter(student -> student.findSubject("English") != null)
                .map(student -> student.getName() + " " + student.getSurname() + " "
                        + "English" + " "
                        + student.findSubject("English").distrinctMarks().toString())
                .toList();
        return result;
    }
    public List<Student> sortedStudent()
    {
        List<Student> result =new ArrayList<Student>();
        result = students.stream()
                .sorted((student1,student2) -> student1.getSurname() != student2.getSurname()
                        ? student1.getSurname().compareTo(student2.getSurname()):
                        student1.getName() != student2.getName()
                        ? student1.getName().compareTo(student2.getName()):
                        student1.getMiddleName().compareTo(student2.getMiddleName()))
                .collect(Collectors.toList());
        return result;
    }
    public Student findStudent()
    {
        Student result;
       result =  students.stream()
                .max(Comparator.comparing(Student::averageValueAllSubject))
                .get();
        return result;
    }
    public String hyphenSurname()
    {
        return students.stream()
              .map(Student::getSurname)
            .reduce((surname1,surname2) -> surname1 + "-" + surname2).orElse("No");

    }
    public List<StudentSimple> getList()
    {
        List<StudentSimple> result = students.stream()
                .map(student ->
                        new StudentSimple(student.getName(),student.getSurname(),student.getMiddleName()))
                .toList();
        return result;
        
    }


}