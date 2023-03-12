import java.util.Scanner;

public class SoalPrioritas4 {
    
    // Fungsi penjumlahan
    public static double tambah(double x, double y) {
        return x + y;
    }

    // Fungsi pengurangan
    public static double kurang(double x, double y) {
        return x - y;
    }

    // Fungsi perkalian
    public static double kali(double x, double y) {
        return x * y;
    }

    // Fungsi pembagian
    public static double bagi(double x, double y) {
        return x / y;
    }

    // Fungsi utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2;
        char operasi;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        System.out.println("Pilih operasi yang ingin dilakukan (+,-,*,/): ");
        operasi = input.next().charAt(0);

        double hasil;

        switch (operasi) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operasi yang dimasukkan salah.");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}
