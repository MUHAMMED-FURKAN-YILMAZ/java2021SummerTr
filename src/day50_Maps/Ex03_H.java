package day50_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03_H {
     /*
  --1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
  --2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin
     saveInfo() method olusturun:
  3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
  4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
  5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
  getInfo() method olusturun:
  1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
  2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
  removeInfo() method olusturun:
  1)Kimlik numarasini girerek data silin.
  2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
  3)Collection bos ise kullaniciya hata mesaji verin.
  selectOption() method olusturun:
  1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
               */

     static Scanner scan=new Scanner(System.in);

     public static void main(String[] args) {

          System.out.println("kimlik numaranizi giriniz");
          int kimlikNo=scan.nextInt();

          System.out.println("Tam isminizi girin");
          String isim=scan.nextLine();

          System.out.println("adresinizi girin");
          String adres=scan.nextLine();

          System.out.println("Telefonunuzu girin");
          String tel=scan.nextLine();

          saveInfo(kimlikNo,isim,adres,tel);







     }

     public static void saveInfo( int kimlikNo,String isim, String adres,String tel) {
          HashMap<Integer, String> m1=new HashMap<>();
          m1.put(kimlikNo,isim+"  "+adres+"   "+tel);

     }



}
