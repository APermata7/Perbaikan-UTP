public class CAT8 extends TiketKonser {
    // Mengoverride metode getNamaTiket dari superclass
   @Override
    public String getNamaTiket() {
        return "CAT 8"; // Mengembalikan nama tiket "CAT 8"
    }

    // Mengoverride metode getHarga dari superclass
    @Override
    public double getHarga() {
        return 500000; // Mengembalikan harga tiket (dalam USD)
    }
}
