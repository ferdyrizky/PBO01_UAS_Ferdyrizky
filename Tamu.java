public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    public Tamu() {
        super();
        System.out.println("Object Tamu telah diciptakan, constructor berjalan");
    }

    public int getSisaMasaAktif() {
        return this.sisaMasaAktif;
    }

    public void setSisaMasaAktif(int sisaMasaAktif) {
        this.sisaMasaAktif = sisaMasaAktif;
    }

    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif += tambahan;
    }

    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }

    @Override
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}
