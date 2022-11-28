import java.util.Scanner;

public class MainMenu {

    void mainMenu(){
        System.out.println("====================================================\n" +
                        "OGRENCI VE OGRETMEN YONETIM PANELI\n" +
                        "=====================================================\n" +
                        "1- OGRENCI ISLEMLERI\n" +
                        "2- OGRETMEN ISLEMLERI\n" +
                        "Q- CIKIS\n" +
                        "SECIMINIZ: ");

        Scanner scan = new Scanner(System.in);


        while(true){
            char secim = scan.next().toUpperCase().charAt(0);

            switch (secim){
                case '1':{
                    StudentMenu student = new StudentMenu();
                    student.studMenu();
                }case '2':{

                }case 'Q':{

                }
                default:{
                    System.out.println("Gecerli deger giriniz");
                    mainMenu();
                }

            }
        }
    }

}