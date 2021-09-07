package replit;

public class bos {
	public static int search_digit(String s) {
    
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))== true) {
                             
                return i + 1;
            }
        }
      
        return 0;
    }
  
    public static void main(String[] args) {
    
  
     
        String[] arr = { "ABC4DEF", "QWERTY" };
    
        int index = 0;
  
        for (String x : arr) {
            index = search_digit(x);
            if (index != 0) {
                System.out.println(
                    "Digit found at : "
                    + (index)
                    + "th position.");
            }
            else {
                System.out.println(
                    "Digit not present.");
            }
        }
    }
}
