import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bacakar {
    public static void main(String[] args) throws IOException {
        // Kamus
        char cc;
        int bil;

        // Membuat objek BufferedReader untuk input
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        // Algoritma
        System.out.print("hello\n");

        // Membaca satu karakter
        System.out.print("baca 1 karakter : ");
        cc = dataIn.readLine().charAt(0);

        // Membaca satu bilangan
        System.out.print("baca 1 bilangan : ");
        bil = Integer.parseInt(datAIn.readLine());

        // Menampilkan hasil
        System.out.println(cc);
        System.out.println(bil);
        System.out.println("bye");
    }
}