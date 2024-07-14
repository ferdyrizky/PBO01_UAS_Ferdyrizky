public class Barang {

    private int id;
    private String nama;
    private String kategori;
    private double harga;
    private boolean tersedia;

    public Barang() {
        System.out.println("Object Produk telah diciptakan, constructor berjalan");
    }

    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getKategori() {
        return this.kategori;
    }

    public double getHarga() {
        return this.harga;
    }

    public boolean isTersedia() {
        return this.tersedia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
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

