public class Komik extends Buku {
    private int volume;

    public Komik() {
        super();
        System.out.println("Object Komik telah diciptakan, constructor berjalan");
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void naikkanHarga() {
        // Override to increase the price by a different default amount, e.g., Rp. 5,000
        this.setHarga(this.getHarga() + 5000);
    }
}
