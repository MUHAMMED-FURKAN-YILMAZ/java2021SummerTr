package replit;

public class Method_Array03_02 {

	public static void main(String[] args) {
	
		String str = "ade1r4d3";
    int toplam = 0;
    for (int i = 0; i < str.length(); i++) {
        if (((int) (str.charAt(i)) >= 48 && ((int) (str.charAt(i)) <= 57))) {
            toplam += Integer.valueOf(Character.toString(str.charAt(i)));
        }
    }
    System.out.println(toplam);
}
}
