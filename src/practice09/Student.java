package practice09;

public class Student {
	/* TODO
    Burada iki adet class vard�r. Biri Main, di�eri ise student ,
    student class� i�inde;
    String name(isim) ve int age(ya�) isminde variables(de�i�kenler) olu�turunuz.
    getter ve setter ( al�c� ve ayarlay�c� ) olu�turunuz.
todo  Main class�n i�inde;
    �rnek:
    age 12'dir.
    name Steven'd�r.
todo  name(isim) olarak;
    "Student name is Steven"
    ve
    age(ya�) olarak da;
    "He is 12 years old"
 */
	private String name; 
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
