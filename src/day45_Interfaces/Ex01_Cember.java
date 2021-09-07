package day45_Interfaces;

public class Ex01_Cember implements Ex01_Interface_Sekil {

    @Override
    public double cevre(double... dizi) {
    return 2*pi*dizi[0];
    }

    @Override
    public double alan(double... dizi) {
    return dizi[0]*dizi[0]*pi;
    }
}
