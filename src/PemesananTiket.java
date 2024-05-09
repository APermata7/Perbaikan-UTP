class PemesananTiket {
    // Atribut-atribut pemesanan tiket
    private String namaPemesan;
    private String jenisTiket;
    private String kodeBooking;
    private String tanggalPesanan;

    // Constructor untuk inisialisasi objek PemesananTiket
    public PemesananTiket(String namaPemesan, String jenisTiket, String kodeBooking, String tanggalPesanan) {
        this.namaPemesan = namaPemesan;
        this.jenisTiket = jenisTiket;
        this.kodeBooking = kodeBooking;
        this.tanggalPesanan = tanggalPesanan;
    }

    // Getter methods untuk mendapatkan informasi pemesanan
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    public String getTanggalPesanan() {
        return tanggalPesanan;
    }
 }