import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMenu implements IProcesses{
    List<Student> studentList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    void studMenu(){
        System.out.print("================ OPERATIONS ===============\n" +
                            "1- ADDING\n" +
                            "2- SEARCHING\n" +
                            "3- LISTING\n" +
                            "4- DELETION\n" +
                            "Q- EXIT\n" +
                            "YOUR CHOICE: ");


        while (true){
            char secim = scan.next().toUpperCase().charAt(0);

            switch (secim){
                case '1':
                {
                    add();
                }case '2':
                {
                    search();
                }case '3':
                {
                    listing();
                }case '4':
                {
                    deletion();
                }case 'Q':
                {
                    quit();
                }
            }
        }
    }
    @Override
    public void add() {
        System.out.print("Enter Name:");
        scan.nextLine();
        String name =scan.nextLine();
        System.out.print("Enter Surname:");
        String surName =scan.nextLine();
        System.out.print("Enter Tc Number:");
        String tcNo =scan.nextLine();
        System.out.print("Enter Age:");
        int age =scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Class:");
        String classInfo =scan.nextLine();
        System.out.print("Enter Student Number:");
        int studNo =scan.nextInt();

        Student student = new Student(name,surName,tcNo,age,classInfo,studNo);
        studentList.add(student);
        studMenu();
    }

    @Override
    public void search() {
        if (!studentList.isEmpty()){
            System.out.print("Enter the TR Number to be searched: ");
            String searchTc = scan.next();
            for (Student each : studentList) {
                if (each.getTcNo().equals(searchTc)){
                    System.out.println(each.toString());
                    studMenu();
                }
                else {
                    System.out.println(searchTc + " The information of the entered Tc number could not be found.");
                    studMenu();
                }
            }
        }else{
            System.out.print("Student List is empty!\n");
            studMenu();
        }

    }

    @Override
    public void listing() {
        if (!studentList.isEmpty()){
            for (Student each: studentList) {
                System.out.println(each.toString());
            }
            studMenu();
        }
        else{
            System.out.print("Student List is empty!\n");
            studMenu();
        }
    }

    @Override
    public void deletion() {
        if (!studentList.isEmpty()){
            System.out.print("Enter the Tc Number you want to delete from the list: ");
            String searchTc = scan.next();
            for (int i = 0; i <studentList.size() ; i++) {
                if (searchTc.equals(studentList.get(i).getTcNo())){
                    studentList.remove(i);
                    System.out.println("The person with" + searchTc + "TC number has been removed from the list.");

                    studMenu();
                }
            }

        }else{
            System.out.print("Student List is empty!\n");
            studMenu();
        }

    }

    @Override
    public void quit() {
    MainMenu mainMenu = new MainMenu();
    mainMenu.mainMenu();
    }
}
