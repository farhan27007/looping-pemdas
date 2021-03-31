import java.util.Scanner;


public class praktikum_4_loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan :");
        int bilangan = input.nextInt();

        do {
            if (bilangan % 2 ==0) {
                bilangan = bilangan / 2;
            }else {
                bilangan = bilangan *3 + 1;
            }
            System.out.print(bilangan + "");
        }while (bilangan != 1);
    }
}