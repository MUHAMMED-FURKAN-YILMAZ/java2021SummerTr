package day35_Encapsulation;

import java.util.Scanner;

public class EmployeesRunner {
	/* T
    Burada iki adet class vard�r. Biri Main di�eri ise Employees,
    Employees(�al��anlar) class'�nda;
    Bu variable'lar� olu�turunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Do�um tarihi)
    getter ve setter olu�turunuz.
 Main class'�n i�inde; kullanicidan name dob ve slary bilgilerini alip
    
    E�er employee 18 ya��nda b�y�kse:
     Welcome to our company Fernando your salary is 80000. yazd�r�n�z.
    
    E�er Fernando 18 ya��ndan k���kse: 
    come back when you are 18 years old. yazd�r�n�z.
    
    E�er Fernando 18 ya��ndaysa:  
    we can have inter with you after that you can have a 80000 salary yazd�r�n�z.
  
  �rnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method olu�turunuz. 
�uanki tarih - do�um y�l� = employee age
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
