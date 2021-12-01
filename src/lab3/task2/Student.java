package lab3.task2;

import lab3.task1.ValidateException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student implements AutoCloseable{
    private long id;
    private String firstname;
    private String lastname;

    public Student() {}

    public Student(long id,String firstname, String lastname)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
       isValidFirstName ();
       isValidLastName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {this.lastname = lastname;}

   public  boolean  isValidFirstName() {
       final String regex = "^[A-Z][a-z]\\w*";
       final Pattern p = Pattern.compile(regex);
       final Matcher firstNameMatcher = p.matcher(this.firstname);
       if (firstNameMatcher.matches()) {
           return true;
       } else {
           throw new ValidateException(ValidateException.http.ERROR_400.httpStatusCode);}
   }
   public boolean isValidLastName(){
       final String lastNameRegex = "^[A-Z][a-z]\\w*";
       final Pattern pattern = Pattern.compile(lastNameRegex);
       if (pattern.matcher (this.lastname).matches ()){
           return true;
       }
       else{ throw new ValidateException(ValidateException.http.ERROR_400.httpStatusCode);}
   }


    @Override
    public void close() throws Exception {
        System.exit (1);
    }
    @Override
    public String toString() {
        return "Student:" + '\n'+
                "ID =" + id + ", "
                + "First Name: " + firstname + ", "
                + "Last Name: " + lastname;
    }
}
