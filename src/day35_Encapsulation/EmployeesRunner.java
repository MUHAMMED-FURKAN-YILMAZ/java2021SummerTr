package day35_Encapsulation;

import java.util.Scanner;

public class EmployeesRunner {
	/* T
    Burada iki adet class vardýr. Biri Main diðeri ise Employees,
    Employees(Çalýþanlar) class'ýnda;
    Bu variable'larý oluþturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doðum tarihi)
    getter ve setter oluþturunuz.
 Main class'ýn içinde; kullanicidan name dob ve slary bilgilerini alip
    
    Eðer employee 18 yaþýnda büyükse:
     Welcome to our company Fernando your salary is 80000. yazdýrýnýz.
    
    Eðer Fernando 18 yaþýndan küçükse: 
    come back when you are 18 years old. yazdýrýnýz.
    
    Eðer Fernando 18 yaþýndaysa:  
    we can have inter with you after that you can have a 80000 salary yazdýrýnýz.
  
  Örnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method oluþturunuz. 
Þuanki tarih - doðum yýlý = employee age
*/
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("adinizi giriniz :");
		String name=scan.nextLine();
		
		System.out.println("Dogum tarihini MM/dd/yyyy giriniz :");
		String dob=scan.nextLine();
		
		System.out.println("talep ettiginiz maasi giriniz :");
		int salary=scan.nextInt();
		
		Employees calisan=new Employees();
		
		calisan.setDob(dob);
		calisan.setName(name);
		calisan.setSalary(salary);
		int calisanYas=calisan.yasHesapla(dob);
		
		if (calisanYas>18) {
			System.out.println("Welcome to our company "+name+" your salary is :"+salary);
		}else if (calisanYas<18) {
			System.out.println("come back when you are 18 years old");
		}else if (calisanYas==18) {
			System.out.println("we can have inter with you after that you can have a "+salary+" salary");
		}

	}

}
