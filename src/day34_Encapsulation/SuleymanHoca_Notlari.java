package day34_Encapsulation;

public class SuleymanHoca_Notlari {
     /*
     Data Hiding Process is called "Encapsulation"
     *
     * 1)To hide class members, use "private" access modifier for them. If you do not want anybody to see object details, do not create "toString()"
     * 2)To read the value of hidden variables, we create "getters", and by using "getters" we can read the values
     * 3)To update value of a variable for a specific student, use "setters"
     *
     * Note: To create an "immutable class"
     * a)Make the variables private
     * b)Do not create any setters
     *
     * Note: getter() and setter() methods are called "Java Beans" in Java
     *
     * Note:Getter method names start with "get" followed by "variable name" int
     * number = 11; ==> Getter: getNumber() - Setter: setNumber() But if the
     * variable is "boolean", getter method names start with "is" followed by
     * "variable name" boolean old = true; ==> Getter:isOld() - Setter: setOld()
     *
     * Note:
     * a)The return type of getter is same with the return type of the variable
     * b)The return type of setter is "void" every time.
     * c)Getters do not use "parameters" but setters must use parameters to update the existing value

      ***********TURKCE*************************
      1- Encapsulation kısaca data hiding(saklamak) demektir.

	 2- Başarılı bir encapsulation aşağıdaki özelliklere sahip olmalı
	 	a)Nasıl kullanılacağı belli olmalı --> direksiyon gibi
	 	b)Kodun karmaşıklığı kullanımın karmaşıklığına sebep olmamalı
	 	yani çok karmaşık kodlardan oluşan bir yapı basit bir şekilde kullanılabilmeli
	 	c)Bir bölümün bozulması başka böümlerin bozulmasına sebep olmamalı

	 3-Encapsulation nasıl yapılır?
	 	a)access modifierler "private" olarak kullanınız.
	 	b)getter ve setter methodları ile "encapsulated" datalara ulaşıp onları okuyabilir(getter) ve değiştirebiliriz(setter)

	 4- Encapsulation nın faydaları
	 	a)Esneklik (flexibility) Normalde aşağıda age variablenın değeri 25'tir. ama diğer classlarda
	 	setAge() method unu kullanarak age variable nin değerini
	 	istediğimiz gibi değiştirip kullanabiliriz.

	 	b)Reusabilitiy(tekrar kullanılabilirlik) getter ve setter methodları birkez oluştururuz sonra proje içindeki
	 	classlardan istediğimiz kadar kullanabiliriz.

	 	c)İstediğiniz datayı okunabilir(getter() oluşturarak) istediğiniz datayı okunamaz(getter() oluşturmayız)
	 	hale getirebilirsiniz.

	 	d)istediğiniz datayı değiştirilebilir(setter oluşturarak), istediğiniz datayı değiştirilemez yapabilirsiniz...

	not: tüm variable lar private ve sadece getter methodlar oluşturulduğunda bu classtaki veriler sadedece okunabilir.
	bu tarz class lara "Immutable class" denir.

		e-Kullanıcının kullandığı sistem arkasındaki karmaşık yapıyı kullanıcıya göstermez. böylece kullanıcı yapmak
		istediklerini daha rahat yapar.

	5- bir classta tüm variable lar private ise ve tüm getter ve setter lar oluşturulmuş ise bu class
	   "Fully Encapsulated" olarak adlandırılır.

	6- getter() ve setter() methodlarına "Java Beans" de denir.

	not: data type boolean olduğunda getter method un ismi "get" ile değil "is" ile başlar.

      */
}
