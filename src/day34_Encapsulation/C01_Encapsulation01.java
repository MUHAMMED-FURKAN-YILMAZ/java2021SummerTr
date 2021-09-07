package day34_Encapsulation;

public class C01_Encapsulation01 {

	// field, attribute, properties denir bunlara
	String name;
	String surname;
	private int age;// burada private yaparak ecapsulation yaptik.
	
	public static void main(String[] args) {
		
	}

	public void yasAta(int age) {// obje isterse yasi set edebilir
		if (age<0) {
			this.age=-age;
		}else this.age=age;
	}
	
	public int yasGoster() {// bu method obje isterse yasini gosterir
		
		return this.age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {// ustte source--> Generate Getters and Setters ile olusturdu
		if (age>0) {
			this.age = age;
		}else this.age = -age;
		
		
	}
	
	
	
}
