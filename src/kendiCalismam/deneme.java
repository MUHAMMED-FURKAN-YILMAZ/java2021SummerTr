package kendiCalismam;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("mail adresinizi girin: ");
        String mail=scan.next();
        int son = mail.indexOf("@gmail.com", mail.length()-10); 
        
        if (mail.contains("@gmail.com") && son !=-1) {
            System.out.println("mailiniz kaydedildi");
        } else {
            System.out.println("geçerli gmail adresi girin: ");
        }
        System.out.println(mail);
scan.close();


	}

}
