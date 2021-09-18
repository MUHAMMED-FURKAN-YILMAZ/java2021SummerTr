package projec_GameGuess;

import java.util.Scanner;

public class Main {
    /*
        Main methodunda
     İlk olarak randomGenerator method undan random sayıyı alın
     Sonra LetsGuess method unu çağırın. randomGenerator(num)
     LetsGuess method unun parametresidir
     */
     /*
     Projects_05.GameGuess paketinde
     GuessGame classi olusturunuz...
     /*
        randomGenerator ()  methodunu olusturalim.
        Bu method 0 ile 100 arasinda random bir sayi olusturmali.
        Bu method random sayiyi return etmeli.
        Return tipi int olmali
     */
        /*
         LetsGuess ()  methodunu olusturalim
         Bu method parametre olarak bir int almali.
        Return tipi void olsun.
         Tahmin girisiminiz maksimum 5'tir.
        Bu method da, dogru sayıyı tahmin edene kadar sayıları
        tahmin etmeye devam etmelisiniz.
        Numaraniz random sayÄ±dan kucukse
         "Your number is too low" yazdÄ±ralÄ±m.
        Numaraniz random sayidan buyukse
         "Your number is too high" yazdiralim.
        Tahmin numaraniz  random sayiya esit oldugunda
         "You got it !!" yazdiralim
        Ve execution durdurun.
        Eger tahmininiz  5'e ulasırsa "Anlamadim dostum !!!"
        Not:
         1) Sayilari tahmin ederken Scanner Class kullanmaniz gerekir.
         2) Bu methodlarin her ikisi de statik bir method degildir
 */
    public static void main(String[] args) {
        GuessGame guess = new GuessGame();
        int sayi = guess.randomGenerator();
        guess.LetsGuess(sayi);
        System.out.println(sayi);
    }
}


class GuessGame {
    public void LetsGuess(int sayi) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Tahmin girisiminiz maksimum 5'tir.");
        int tahmin = 0;
        for (int i = 0; i < 5; i++) {
            tahmin = scan.nextInt();
            if (tahmin > sayi) {
                System.out.println("Your number is too high");
            } else if (tahmin < sayi) {
                System.out.println("Your number is too low");
            } else if (tahmin == sayi) {
                System.out.println("You got it !!");
                break;
            }
        }
        if (tahmin != sayi) {
            System.out.println("Anlamadim dostum !!!");
        }
    }
    public int randomGenerator() {
        int rsayi = (int) (Math.random() * ((100 - 0) + 1)) + 0;
        return rsayi;
    }
}