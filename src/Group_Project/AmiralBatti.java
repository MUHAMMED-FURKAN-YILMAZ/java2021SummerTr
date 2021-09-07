package Group_Project;

import java.util.Scanner;

public class AmiralBatti {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random(System.currentTimeMillis());
//gemilerin yerleştirildiği matris
        int gemiler[][] = new int [10][10];
//oyuncunun hamlelerinin tutulduğu matris
        int oyuncu[][] = new int [10][10];
//gemilerin adedini tutan dizi
//0 nolu eleman kullanılmıyor
        int gemi[] = {0, 4, 3, 2, 1};
        int i, j, row, col, size;
        int num, dir, gemiSize, count, r, c, rl, cl, flag;
        int right, down, vurus;
        row = 10;
        col = 10;
        size = 5;
        count = 0;
        gemiSize = 1;
        while (gemiSize <= 4) {
//yon üretiliyor (0 sağa, 1 aşağıya)
            dir = generator.nextInt();
//yöne göre satır sütun sınırları ve
//yerleştirilecek
// geminin sınırları belirleniyor
            if (dir == 0) {
                rl = row;
                cl = col - gemiSize + 1;
                right = 2 + gemiSize;
                down = 3;
            }
            else {
                rl = row - gemiSize + 1;
                cl = col;
                right = 3;
                down = 2 + gemiSize;
            }
//geminin nereye
// yerleştirileceği üretiliyor
            r = generator.nextInt(rl);
            c = generator.nextInt(cl);
//geminin yerleştirileceği yerin
//boş olup olmadığına bakılıyor
            flag = 0;
            for (i = r-1; i < (r-1) + down; i = i + 1)
                for (j = c-1; j < (c-1) + right; j = j + 1)
                    if (i >=0 && i < row && j >= 0 && j < col)
                        if (gemiler[i][j] != 0)
                            flag = 1;
//flag'in 0'a eşit olması geminin
// yerleştirileceği yerin
//boş olduğunu gösteriyor.
            if (flag == 0) {
//gemi yerleştiriliyor
                for (i = r; i < r + down - 2; i = i + 1)
                    for (j = c; j < c + right - 2; j = j + 1)
                        gemiler[i][j] = gemiSize;
//adet bir arttırılıyor
                count = count + 1;
//gemiden istenen adet
// yerleştirilmişse
//bir sonraki gemiye geçiliyor
                if (gemi[gemiSize] == count) {
                    gemiSize = gemiSize + 1;
                    count = 0;
                }
            }
        }
//gemilerin yerleştirildiği
// matris yazdırılıyor
        for (i = 0; i < row; i = i + 1) {
            for (j = 0; j < col; j = j + 1)
                System.out.print(gemiler[i][j] + " ");
            System.out.println();
        }
        System.out.println();
//toplam 20 isabetli atış
// yapıldığında oyun bitiyor
        count = 0;
        vurus = 0;
        while(vurus < 20) {
//atış sayısı bir arttırılıyor
            count = count + 1;
//atış yapılıyor
            Scanner input=new Scanner(System.in);
            System.out.print("Satiri giriniz : ");
            r = input.nextInt();
            System.out.print("Sutunu giriniz : ");
            c = input.nextInt();
//atışın isabetli olup
// olmadığına bakılıyor
//eğer isabetli ise
// oyuncunun matrisine
//gemi numarası yazdırılıyor
//değilse 9 sayısı yazdırılıyor

           /* if (gemiler[r] != 0) {
                vurus = vurus + 1;
                oyuncu[r] = gemiler[r];
            } else{
                oyuncu[r] = 9;}

            */

//gemilerin matrisi yazdırılıyor
            for (i = 0; i < row; i = i + 1) {
                for (j = 0; j < col; j = j + 1)
                    System.out.print(gemiler[i][j] + " ");
                System.out.println();
            }
            System.out.println();
//oyuncunun matrisi yazdırılıyor
            for (i = 0; i < row; i = i + 1) {
                for (j = 0; j < col; j = j + 1)
                    System.out.print(oyuncu[i][j] + " ");
                System.out.println();
            }
        }
        System.out.println("Tebrikler! " + count + " adimda bildiniz.");
    }
}
