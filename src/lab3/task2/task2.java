package lab3.task2;

public class task2 {
    public static void main(final String[] args) throws Exception {
        Student student =null;
        try {
            student = new Student(1,"Petro","Petrovich");

            System.out.println(student);
        } catch (final Exception e) {
            System.out.println(e.getMessage ());
        }finally {
            if (student==null ){
                student.close ();
            }
        }
    }

}