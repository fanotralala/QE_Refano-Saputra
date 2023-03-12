public class SoalPrioritas1_2 {

    public static void main(String[] args) {
        int hargaBeli = 15000;
        int hargaJual = 30000;
        int hasil;
 
        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian
        hasil = hargaJual - hargaBeli;
        
        if ( hasil >= 0 ){
            System.out.println(" Selamat kamu untung, dengan keuntungan sebesar Rp. " + hasil);
        }else {

        System.out.println(" Yahh kamu rugi, dengan kerugian sebesar Rp. " + hasil);
        }
    }
}