import java.util .Scanner;

public class WhileKelipatan28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // deklarasi scanner dengan nama scan
        int total, counter, jumlahKelipatan;
        double rataRata; // deklarasi variabel 
        total = 0; // inisialisasi variabel dengan  niali 0
        counter =0; // inisialisasi variabel dengan  nilai 0
        jumlahKelipatan = 0;
        int i = 1;

        while (i <= 50) { // Kondisi
            if (i % kelipatan == 0) {
                total += i; // Eksekusi jika i adalah kelipatan
            }
            counter++; // Selalu tambahkan counter
            i++; // Pembaruan nilai i
        }
    }

}
