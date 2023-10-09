import java.util .Scanner;

/**
 * ForKelipatan28
 */
public class ForKelipatan28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // deklarasi scanner dengan nama scan
        int kelipatan, total, counter, jumlahKelipatan; // deklarasi variabel 
        double rataRata; // deklarasi variabel 
        total = 0; // inisialisasi variabel dengan  niali 0
        counter =0; // inisialisasi variabel dengan  nilai 0
        jumlahKelipatan = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : "); // untuk menerima input dari keyboard
        kelipatan = scan.nextInt();


        // perulangan for dengan kondisi pemilihan if untuk menentukan bilangan kelipatan 
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0)
                total += i;
                counter++;
        }
        
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0)
            jumlahKelipatan++;
        }
        
        rataRata = (double) total / jumlahKelipatan ;

        // menampilkan banyaknya bilangan kelipatan dan total bilangan pada rentang 1 sampai 50 
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata rata adalah "+ rataRata);
    }
}
