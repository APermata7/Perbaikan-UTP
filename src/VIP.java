class VIP extends TiketKonser {
    // Mengoverride metode getNamaTiket dari superclass
    @Override
    public String getNamaTiket() {
        return "VIP"; // Mengembalikan nama tiket "VIP"
    }

    // Mengoverride metode getHarga dari superclass
    @Override
    public double getHarga() {
        return 1500000; // Mengembalikan harga tiket (dalam USD)
    }
 }
 