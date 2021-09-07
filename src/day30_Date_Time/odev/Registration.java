package day30_Date_Time.odev;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Registration {
    List<User>users=new ArrayList<>();
    /*
     * TODO Bu uygulama kulanÄ±cÄ±larÄ±n bir ArrayListe kayÄ±t zamanÄ±nÄ± da alarak
     * ekleyen ve sonrasÄ±nda her dakikanÄ±n ilk 10 saniyesinde kaydolmuÅŸ olanlarÄ±
     * ÅŸanslÄ± kullanÄ±cÄ± olarak ekrana yazdÄ±ran bir uygulamadÄ±r.Bunun iÃ§in;
     * 1- Bir
     * user class oluÅŸturun fields: name , registerDate (LocalDateTime cinsinden)
     * 2-
     * Registration isminde bir class oluÅŸturun ve register isminde bir metod
     * ekleyerek KullanÄ±cÄ±dan user ismini alarak ArrayList e ekleyin ve bu list i
     * return edin. 3- Registration classÄ± na aynÄ± zamanda kendine verilen
     * ArrayListteki userlardan her dakikanÄ±n ilk 10 saniyesinde kaydolmuÅŸlarÄ±
     * yazdÄ±ran printHappyUsers isminde bir metod daha ekleyiniz. Ä°pucu Ã‡alÄ±ÅŸacak
     * main metodu aÅŸaÄŸÄ±daki gibi olmalÄ±dÄ±r. public static void main(String[] args)
     * { Registration userReg = new Registration(); ArrayList<User> register =
     * userReg.register(); userReg.printHappyUsers(register);
     *
     */
    public Registration() {
        // TODO Auto-generated constructor stub
    }

    public List<User> register(){
        Scanner scan =new Scanner(System.in);
        System.out.println("LÃ¼tfen adinizi giriniz");
        String isim=scan.nextLine();
        User user=new User(isim, LocalDateTime.now());
        users.add(user);
        return users;
    }

    public void listele(List<User>users) {
        for (User each : users) {
            System.out.println("Adi: "+each.name+" kayit zamani "+each.registerDate);
        }
    }
    public void printHappyUsers(List<User> users) {
        for (User each : users) {
            if (each.registerDate.getSecond()<10) {
                System.out.println("Å�anslÄ± kiÅŸisiniz "+each.name+" 5 kilo bal kazandiniz");
            }
        }

    }

}
