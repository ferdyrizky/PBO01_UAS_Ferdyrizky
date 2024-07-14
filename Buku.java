public class Buku {

    private int id;
    private String judul;
    private String penulis;
    private String penerbit;
    private int jumlah_halaman;
    private double harga;

    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public String getPenerbit() {
        return this.penerbit;
    }

    public int getJumlahHalaman() {
        return this.jumlah_halaman;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setJumlahHalaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }    
    
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void naikkanHarga() {
        // Increase price by a default amount, e.g., Rp. 10,000
        this.harga += 10000;
    }

    public void naikkanHarga(double kenaikan) {
        // Increase price by the specified amount
        this.harga += kenaikan;
    }
}
