package replit;

public class DublicateCharsInStringCozum2_InterviewQue {

	public static void main(String[] args) {

		String str = "Javaisalsoeasy";

		char chr = ' ';
		String str2 = "";
		
		for (int i = 0; i < str.length(); i++) {
			chr = str.charAt(i);
			
			for (int j = i + 1; j < str.length(); j++) {
				
				if (chr == str.charAt(j)) {
					String d = Character.toString(chr);
					
					if (!str2.contains(d)) {
						str2 += "" + chr + ' ';
					}
				}
			}
		}
		System.out.println(str2);
	}
}
