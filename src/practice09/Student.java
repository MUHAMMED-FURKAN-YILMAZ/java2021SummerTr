package practice09;

public class Student {
	/* TODO
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
    getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.
todo  Main classın içinde;
    Örnek:
    age 12'dir.
    name Steven'dır.
todo  name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
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
