package OgrenciPractice;

public enum C04_Urunler {
    MAC12("MAC_12",1750.56,"2021, 16 GB, Mac pro"),
    SAMSUNG("Samsung_12",750.56,"2018, 8 GB, A20"),
    IPHONE12("Iphone",550.56,"2019, 8 GB, A12"),
    ACER76("Acer12",450.56,"2020, 16 GB, Mac pro"),
    ASUS12("Asus_23",1750.56,"2021, 16 GB, Mac pro"),

    ;
    /*
     --enum sinifi javada sabitleri saklamak ve yazmak icin kullanilan bir siniftir
     --ingilizce numaralandirmadan geliyor. Hic degistirmeyecegimiz seyleri tuttugumuz yerdir.
                Orn: ocak subat mart veya pazartesi sali carsamba vs gibi
     --Burda create ettiginiz bir seyi baska yerde create edemiyorsunuz.
     */
private String name;
private double price;
private String details;

    C04_Urunler(String name, double price, String details) {
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
       String str=this.name;

       for (int i=0; i< 20-this.name.length(); i++)
           str+=" ";
           str+=this.getDetails();


        for (int i=0; i< 30-this.name.length(); i++)
            str += " ";

            str += this.getPrice();


            return str;

    }
}
