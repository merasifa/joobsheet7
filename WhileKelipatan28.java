import java.util .Scanner;

public class WhileKelipatan28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // deklarasi scanner dengan nama scan
        int total=0, counter= 0, jumlahKelipatan= 0, kelipatan;
        double rataRata;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) { // Kondisi
            if (i % kelipatan == 0) {
                total += i; // Eksekusi jika i adalah kelipatan
                counter++;
            }
             i++; // Pembaruan nilai i
        }

        i = 1;
        while (i <= 50) { // Kondisi
            if (i % kelipatan == 0) {
                jumlahKelipatan++; 
            }
            i++; // Pembaruan nilai i

        }
           rataRata = (double) total / jumlahKelipatan ;
        

        System.out.printf("Banyaknya %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.println("Rata rata adalah " + rataRata);
    }

}

