import java.util.Scanner;

public class praktikum_1_loop {
    public static void main(String[] args) {
        int Nilai_1;
        int Nilai_2;
        int Hasil = 0;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Bilangan Pertama :");
        Nilai_1 = inputan.nextInt();
        System.out.print("Masukan Bilangan Kedua :");
        Nilai_2 = inputan.nextInt();


        for (int Perkalian = 1; Perkalian <= Nilai_2; Perkalian++) {
            Hasil = Hasil+Nilai_1;
        }
        System.out.print("Hasil perkalian kedua bilangan adalah :" + Hasil);


    }
}