import java.util.Scanner;

/**
 Class to handle the I/O for the project and manage the functionalities and flow of the other
 classes. Will issue add/remove and print commands to be carried out by other classes. Will
 create the objects, based on input, that tasks will be carried out on.
 */
public class TuitionManager {
    private StudentList students;
    Scanner stdin;


    /**
     method that will be called to run the project.
     */
    public void run(){
        //initiate scanner and studentlist objects
        students = new StudentList();
        stdin = new Scanner(System.in);

        //loop to accept inputs and do appropriate procedures
        String command;
        while(true){
            command = stdin.next();
            if(command.length()!=1){
                handleBadCommands();
            }
            switch (command.charAt(0)){
                //cases based on required inputs:
                case 'I': addNewInstateStudent();
                break;
                case 'O': addNewOutstateStudent();
                break;
                case 'N': addNewInternationalStudent();
                break;
                case 'R': removeStudent();
                break;
                case 'P': printCommand();
                break;
                case 'Q': System.out.println("Program Terminated");
                break;
                default : handleBadCommands();
            }
        }

    }


    /**
     Adds new Instate student to the running list in this class.
     Corresponds to command 'I'.

     @author Rizwan Chowdhury
     @author Tin Fung
     */
    private void addNewInstateStudent(){

    }


    /**
     Adds new Outstate student to the running list in this class.
     Corresponds to command 'O'
     @author Rizwan Chowdhury
     */
    private void addNewOutstateStudent(){

    }


    /**
     Adds new International student to the running list in this class.
     Corresponds to command 'N'
     @author Rizwan Chowdhury
     */
    private void addNewInternationalStudent(){

    }


    /**
     Removes given student from the running list in this class

     @author Rizwan Chowdhury
     @author Tin Fung
     */
    private void removeStudent(){

    }


    /**
     Handles bad commands inputted into the command line.
     */
    private void handleBadCommands(){

    }


    /**
     * Prints a list of Students and the tuition amount due for each
     */
    private void printCommand(){

    }
}
