package day30_Date_Time.odev;



import java.util.ArrayList;
import java.util.Scanner;

public class MainRegister {
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        Scanner scan = new Scanner(System.in);
        String islem;
        Registration userReg = new Registration();
        ArrayList<User> register = null;
        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("Lutfen Ekleme icin 1\nListeleme icin 2\nsansli kisi bulma icin  3\ncikis icin 4\ngiriniz : ");
            islem = scan.nextLine();
            switch (islem) {
                case "1":
                    register = (ArrayList<User>) userReg.register();
                    break;
                case "2":
                    userReg.listele(register);
                    break;
                case "3":
                    userReg.printHappyUsers(register);
                    break;
                case "4":
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz");
                    break;
            }
        }
    }
}
