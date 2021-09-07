package day45_Interfaces;

public class Ex01_Dikdortgen implements Ex01_Interface_Sekil{


    @Override
    public double cevre(double... dizi) {
    if (dizi.length==1){
        return (dizi[0]+dizi[0])*2;
    }else{
        return (dizi[0]+dizi[1])*2;
    }
    }

    @Override
    public double alan(double... dizi) {
        if (dizi.length==1){
            return dizi[0]*dizi[0];
        }else{
            return dizi[0]*dizi[1];
        }
    }
}
