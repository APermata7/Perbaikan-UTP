class CAT1 extends TiketKonser {
   // Mengoverride metode getNamaTiket dari superclass
   @Override
    public String getNamaTiket() {
        return "CAT 1"; // Mengembalikan nama tiket "CAT 1"
    }

    // Mengoverride metode getHarga dari superclass
    @Override
    public double getHarga() {
        return 1000000; // Harga dalam USD
    }
}