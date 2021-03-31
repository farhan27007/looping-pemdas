public class continue_loop {
    public static void main(String[] args) {
        System.out.println("Cetak bilangan ganjil");
        for (var counter =1; counter <=20; counter++) {
            if (counter %2 == 0) {
                continue;
            }
            System.out.println(counter + "\t");
        }
    }
}
