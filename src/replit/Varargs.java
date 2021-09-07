package replit;

public class Varargs {

	public static void main(String[] args) {
	sum(1,2,3);
	 sum(1,2,3,4,5);
	 sum(1,2);
}

private static void sum(int ... i) {
	
	int toplam=0;
	
	for (int j : i) {
		toplam+=j;
	}
	System.out.println("toplam : " + toplam);

}
}
