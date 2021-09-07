package day47_Collections_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MehmetHoca_01_LinkedList {

	public static void main(String[] args) {
	// Ozelliklerine pdf'ten kesinlikle bak

		// linked bagli demektir
		// linkedList'te tum elemanlar tren gibi birbirine baglidir

		//Collections'ta obje olustururken olusturmak istedigimiz collection'in class mi
		// yoksa interface mi olduguna bakmaliyiz.
		//Eger olusturmak istedigimiz collection interface ise
		//data type olarak o interface'i, constructor olarak ise uygun bir class secmeliyiz

		//simdiye kadar List(interface) olustururken constructor olarak ArrayList seciyorduk

		List<String> liste=new ArrayList<>();
		liste.add("X");
		liste.add("Y");// -->[X, Y]

		LinkedList<String> ll1=new LinkedList<>();

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);// [A, B]
		ll1.add(1,"C");
		System.out.println(ll1);// [A, C, B]
		ll1.addAll(liste);
		System.out.println(ll1); // [A, C, B, X, Y]

		ll1.addAll(2,liste);
		System.out.println(ll1);//[A, C, X, Y, B, X, Y]

		ll1.addLast("K");
		System.out.println(ll1);//[A, C, X, Y, B, X, Y, K]

		//LinkedList ve Queue interface'lerine implement ile child oldugundan
		//her iki interface'deki tum methodlari override etmek zorundadir.
		//Islev olarak ayni isi yapan addLast() queue'dan ve add() ise List'den inherit edilmistir

		//*********************
		//ben bir LinkedList olusturmak istiyorum ama sadece List ozelliklerini tasisin istiyorum
		List<String> listList=new LinkedList<>();
		listList.add("Sadece list'ten gelen ozellikler var");//--> addLast() ve addFirst() YOK!!

		//ben bir LinkedList olusturmak istiyorum ama sadece Queue ozelliklerini tasisin istiyorum
		Queue<String> queueList=new LinkedList<>();
		queueList.add("Sadece queue'den gelen ozellikler var");



		LinkedList<String> ll2=new LinkedList<>();

		ll2.add("A");
		ll2.add("B");
		System.out.println(ll2);//[A, B]

		System.out.println(ll2.contains("A"));// true

		LinkedList<String> ll3=new LinkedList<>();

		ll3.add("A");
		ll3.add("B");
		ll3.add("C");
		ll3.add("D");
		System.out.println(ll3);//[A, B, C, D]

		System.out.println(ll3.containsAll(ll2));// true
		System.out.println(ll2.containsAll(ll3));// false

		System.out.println(ll3.get(2));// C -->index'i 2 olan elemani getir
		System.out.println(ll3.getFirst());// A
		System.out.println(ll3.getLast());// D


	}

}