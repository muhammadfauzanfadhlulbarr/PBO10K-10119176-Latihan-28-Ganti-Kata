import java.util.Scanner;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Ganti kata
 */
public class Latihan28 {
    public static void main (String[] args) {
        String hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String kata_lama = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata_baru = scanner.nextLine();
        String[] perkata = kalimat.split(" ");
        for (String kata : perkata) {
            if (kata.equalsIgnoreCase(kata_lama)) {
                hasil += kata_baru + " ";
            }
            else {
                hasil += kata + " ";
            }
        }
        System.out.println("Kalimat Baru : "+ hasil.trim());
    }
}

