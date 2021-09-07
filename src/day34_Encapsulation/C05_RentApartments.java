package day34_Encapsulation;

public class C05_RentApartments {
	/* 
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo
​
   Bütün variable'lar için getter ve setter oluşturunuz.
​
    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
​
    Main class'ın içinde;
    userName rent is amountOfRent
     */

	private String name;
    private int roomCount;
    private boolean balconyOrNo;
	
    
    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRoomCount() {
		
		return roomCount;
	}
	
	public void setRoomCount(int roomCount) {
		
		this.roomCount = roomCount;
		room(roomCount);
	}
	
	public boolean isBalconyOrNo() {
		
		return balconyOrNo;
	}
	
	public void setBalconyOrNo(boolean balconyOrNo) {
		this.balconyOrNo = balconyOrNo;
	}
	
	public int room(int room) {
		int rent=0;
	
		if (roomCount==0) {
			rent+=1400;
		}else if (roomCount==1) {
			rent+=1700;
		}else if (roomCount==2) {
			rent+=2200;
		}else if (roomCount==3) {
			rent+=2700;
		}else System.out.println("hatali oda sayisi girdiniz" );
		return rent;
	}
	
	public int balkon(boolean x) {
		int rent=0;
		if (balconyOrNo==true) {
			rent+=200;
		}
		return rent;
	}
}
