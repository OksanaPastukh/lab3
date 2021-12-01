package lab3.Student;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String subject_name;
    private List<Mark> marks;
    public Subject(final String subject_name)
    {
        this.subject_name = subject_name;
        marks = new ArrayList<Mark>();
    }
    public List<Mark> getMarks(){return marks;}

    public String getSubject_name() {
        return subject_name;
    }
    public void AddMarks(final int value)
    {
        marks.add(new Mark(value));
    }

    public double averageValue()
    {
        double result;
        result = marks.stream()
                .mapToInt(Mark::getValue)
                .average()
                .getAsDouble();
        return result;
    }
    @Override
    public String toString() {
        return  subject_name + marks.toString() ;
    }

    public List<Mark> distrinctMarks ()
    {
        List<Mark> result = new ArrayList<Mark>();
        result = marks.stream()
                .distinct()
                .toList();
        return result;
    }
}
