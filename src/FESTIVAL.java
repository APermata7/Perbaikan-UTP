class FESTIVAL extends TiketKonser {
   
    // Mengoverride metode getNamaTiket dari superclass
   @Override
    public String getNamaTiket() {
        return "FESTIVAL"; // Mengembalikan nama tiket "FESTIVAL"
    }

    // Mengoverride metode getHarga dari superclass
    @Override
    public double getHarga() {
        return 800000; // Mengembalikan harga tiket (dalam USD)
    }
 }
 