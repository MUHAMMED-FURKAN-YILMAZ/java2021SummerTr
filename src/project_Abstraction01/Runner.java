package project_Abstraction01;

public class Runner {

    //static Dikdortgen dikdortgen=new Dikdortgen();

    public static void main(String[] args) {
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("Kisa kenar : ");
        dikdortgen.kk=scan.nextInt();
        System.out.println("Uzun kenar : ");
        dikdortgen.uk= scan.nextInt();
        */
        Dikdortgen dikdortgen=new Dikdortgen(5,10);
        System.out.println("dikdortgen cevresi : "+dikdortgen.cevre());
        System.out.println("dikdortgenin alani : "+dikdortgen.alan());

    }
}
