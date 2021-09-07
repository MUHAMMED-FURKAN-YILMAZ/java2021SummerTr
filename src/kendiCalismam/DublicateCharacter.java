package kendiCalismam;

import java.util.Scanner;

public class DublicateCharacter {
  public static void main(String[] args) {
	 
	Scanner scan=new Scanner(System.in);
	System.out.println("string giriniz");
	String str=scan.next();
	
	System.out.println(duplicateCount(str));
}
  public static int duplicateCount(String str) {
      int count = 0;
      String sonuc="";
      
  for (int i = 0; i < str.length(); i++){
      int firstOcc = str.indexOf(str.charAt(i));
      int lastOcc = str.lastIndexOf(str.charAt(i));
      if (firstOcc != lastOcc) {      
    	  if (!sonuc.contains(Character.toString(str.charAt(i)))) {
			sonuc+=str.charAt(i);
			  count++;
    	  }
        
      }
  }
  return count;
  /*
	  int count = 0;
      for (int i = 0; i < str.length(); i++){
          int firstOcc = str.indexOf(str.charAt(i));
          int lastOcc = str.lastIndexOf(str.charAt(i));
          if (firstOcc != lastOcc) {
//            Removing repeated characters.
              str = str.replaceAll("" + str.charAt(i), "");
              count++;
          }
      }
      return count;
      */
}
  }