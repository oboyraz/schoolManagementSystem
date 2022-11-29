import java.util.Scanner;

public class MainMenu {

    static void mainMenu(){
        System.out.println("====================================================\n" +
                        "STUDENT AND TEACHER ADMINISTRATION PANEL\n" +
                        "=====================================================\n" +
                        "1- STUDENT OPERATIONS\n" +
                        "2- TEACHER OPERATIONS\n" +
                        "Q- QUIT\n" +
                        "YOUR CHOICE: ");

        Scanner scan = new Scanner(System.in);


        while(true){
            char secim = scan.next().toUpperCase().charAt(0);

            switch (secim){
                case '1':{
                    StudentMenu student = new StudentMenu();
                    student.studMenu();
                }case '2':{
                    TeacherMenu teacher = new TeacherMenu();
                    teacher.teacMenu();
                }case 'Q':{
                    System.out.print("You have logged out of the system...");
                    System.exit(0);
                }
                default:{
                    System.out.print("Enter a valid value.");
                    mainMenu();
                }

            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }

}