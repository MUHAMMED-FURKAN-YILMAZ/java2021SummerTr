package project_Abstraction01;

public class Dikdortgen extends Sekil{

    public int kk,uk;

    public Dikdortgen(int kk, int uk) {
        this.kk = kk;
        this.uk = uk;
    }

    @Override
    public int cevre() {

        return 2*(kk+uk);
    }

    @Override
    public int alan() {

        return kk*uk;
    }
}
