import java.util.Scanner;
public class praktikum_3_loop {
    public static void main(String[] args) {
        int Bilangan; int Bil;
        int max=0; int min=0;

        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Banyak Bilangan :");
        Bilangan = masukan.nextInt();

        var a = 1;
        while (a <= Bilangan) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bilangan Ke -" + a++ + " : ");
            Bil = input.nextInt();

            if (a == 1) {
                max = Bil;
                min = Bil;
            }
            if (Bil > max) max = Bil;
            if (Bil < min) min = Bil;
        }
        System.out.println("Bilangan Terbesar :" + max);
    }
}