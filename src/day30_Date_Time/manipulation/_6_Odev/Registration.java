package day30_Date_Time.manipulation._6_Odev;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    ArrayList<User> users = new ArrayList<>();

    ArrayList<User> register() {
        Scanner sc = new Scanner(System.in);
        String userName;
        do {
            System.out.print("Kullanici Adini Giriniz : ");
            userName = sc.nextLine();
            User user = new User(userName, LocalDateTime.now());
            if (userName.length() > 2) users.add(user);
        } while (userName.length() > 2);

        return users;
    }

    void printHappyUsers(ArrayList<User> users) {
        String formatStr = "%-20si-10sin";
        System.out.println("Sansli Kullanicilar : ");
        System.out.printf(formatStr, "Username", "Registation Second");
        ;
        for (User user : users) {
            if (user.registerDate.getSecond() <= 10)
                System.out.printf(formatStr, user.name, user.registerDate.getSecond());
        }
    }
}