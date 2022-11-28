import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMenu implements IProcesses{
    List<Student> studentList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    void studMenu(){
        System.out.print("================ ISLEMLER ===============\n" +
                            "1- EKLEME\n" +
                            "2- ARAMA\n" +
                            "3- LISTELEME\n" +
                            "4- SILME\n" +
                            "Q- CIKIS\n" +
                            "SECIMINIZ: ");


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
        System.out.println("Isım giriniz:");
        String name =scan.nextLine();
        System.out.println("Soyisım giriniz:");
        String surName =scan.nextLine();
        System.out.println("Tc No giriniz:");
        String tcNo =scan.nextLine();
        System.out.println("Yas giriniz:");
        int age =scan.nextInt();
        System.out.println("Sınıf giriniz:");
        String classInfo =scan.nextLine();
        System.out.println("Ogrenci No giriniz:");
        int studNo =scan.nextInt();

        Student student = new Student(name,surName,tcNo,age,classInfo,studNo);
        studentList.add(student);
        studMenu();
    }

    @Override
    public void search() {
        if (!studentList.isEmpty()){
            System.out.print("Arama yapilacak Tc No'yu giriniz: ");
            String searchTc = scan.next();
            for (Student each : studentList) {
                if (each.getTcNo().equals(searchTc)){
                    System.out.println(each.toString());
                    studMenu();
                }
                else {
                    System.out.println(searchTc + " Tc no ya ait bilgi bulunamadi.");
                    studMenu();
                }
            }

        }else{
            System.out.print("Ogrenci Listesi Bos");
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
            System.out.print("Ogrenci Listesi Bos");
            studMenu();
        }

    }

    @Override
    public void deletion() {
        if (!studentList.isEmpty()){
            System.out.print("Silme yapilacak Tc No'yu giriniz: ");
            String searchTc = scan.next();
            for (int i = 0; i <studentList.size() ; i++) {
                if (searchTc.equals(studentList.get(i).getTcNo())){
                    studentList.remove(i);
                    studMenu();
                }
            }

        }else{
            System.out.print("Ogrenci Listesi Bos");
            studMenu();
        }

    }

    @Override
    public void quit() {
    MainMenu mainMenu = new MainMenu();
    mainMenu.mainMenu();
    }
}
