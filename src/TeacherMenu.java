import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherMenu implements IProcesses{
    Scanner scan = new Scanner(System.in);
    List<Teacher> teacherList = new ArrayList<>();
    void teacMenu(){
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
        System.out.print("Enter Department:");
        String department =scan.nextLine();
        System.out.print("Enter the Personnel Registration number: ");
        int regNum =scan.nextInt();

        Teacher teacher = new Teacher(name,surName,tcNo,age,department,regNum);
        teacherList.add(teacher);
    }

    @Override
    public void search() {
        if (!teacherList.isEmpty()){
            System.out.println("Enter the TR Number to be searched:");
            String searchTc =scan.nextLine();
            for (Teacher each:teacherList) {
                if (searchTc.equals(each.getTcNo())){
                    System.out.println(each.toString());
                    teacMenu();
                }
                else{
                    System.out.println(searchTc + " The information of the entered Tc number could not be found.");
                    teacMenu();
                }
            }

        }else {
            System.out.println("Teacher List is empty!\n");
            teacMenu();
        }
    }

    @Override
    public void listing() {
        if (!teacherList.isEmpty()){
            for (Teacher each: teacherList) {
                System.out.println(each.toString());
            }
            teacMenu();
        }else {
            System.out.println("Teacher List is empty!\n");
            teacMenu();
        }

    }

    @Override
    public void deletion() {
        if (!teacherList.isEmpty()){
            System.out.println("nter the Tc Number you want to delete from the list: ");
            String searchTc = scan.nextLine();
            for (int i = 0; i <teacherList.size() ; i++) {
                if (searchTc.equals(teacherList.get(i).getTcNo())){
                    teacherList.remove(i);
                    System.out.println("The person with" + searchTc + "TC number has been removed from the list.");
                    teacMenu();
                }
            }

        }else {
            System.out.println("Teacher List is empty!\n");
            teacMenu();
        }

    }

    @Override
    public void quit() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();

    }
}
