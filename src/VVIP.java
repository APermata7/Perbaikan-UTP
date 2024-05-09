class VVIP extends TiketKonser {
   // Mengoverride metode getNamaTiket dari superclass
   @Override
    public String getNamaTiket() {
        return "UNLIMITED EXPERIENCE"; // Mengembalikan nama tiket "UNLIMITED EXPERIENCE"
    }

    // Mengoverride metode getHarga dari superclass
    @Override
    public double getHarga() {
        return 11000000; // Mengembalikan harga tiket (dalam USD)
    }
 }