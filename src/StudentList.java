/**
 Container class to hold students registered for school, holds Student and its subclasses
 Uses an array to hold the objects.

 @author Rizwan Chowdhury
 @author Tin Fung
 */
public class StudentList {
    private Student[] studentList;
    private int numberOfStudents;

    /**
     Constructor for the StudentList class object. It will instantiate object by
     instantiating the array holding students and the number of students.

     @author Rizwan Chowdhury
     */
    public StudentList(){
        studentList = new Student[0];
        numberOfStudents = 0;
    }


    /**
     Adds Student object provided through argument into this container.
     @param s Student object to be added
     @author Rizwan Chowdhury
     @author Tin Fung
     */
    public void add(Student s){

    }


    /**
     Removes the Student given through the argument from the container
     @param s Student object to be removed
     @return true if student successfully removed, false otherwise
     @author Rizwan Chowdhury
     @author Tin Fung
     */
    public boolean remove(Student s){

    }


    /**
     Prints out the contents of this container; all of the Student objects and their
     properties.
     @author Rizwan Chowdhury
     @author Tin Fung
     */
    public void print(){

    }
}
