public class Main {

    public static void main(String[] args) {
        // Create a Pengguna object
        Pengguna pengguna = new Pengguna();
        pengguna.setUsername("budi");
        pengguna.setPassword("123456");
        pengguna.setId(1);

        // Create a Buku object
        Buku buku = new Buku();
        buku.setJudul("Pemrograman Java untuk Pemula");
        buku.setPenulis("John Doe");
        buku.setPenerbit("Penerbit Informatika");
        buku.setJumlahHalaman(300);
        buku.setHarga(100000);

        // Increase the price of the book using the default method
        buku.naikkanHarga();
        System.out.println("\nHarga Buku setelah naikkanHarga() default:");
        System.out.println("Harga: Rp. " + buku.getHarga());

        // Increase the price of the book by a specified amount
        buku.naikkanHarga(50000);
        System.out.println("\nHarga Buku setelah naikkanHarga(double kenaikan):");
        System.out.println("Harga: Rp. " + buku.getHarga());

        // Create a Komik object
        Komik komik = new Komik();
        komik.setJudul("Naruto");
        komik.setPenulis("Masashi Kishimoto");
        komik.setPenerbit("Shueisha");
        komik.setJumlahHalaman(200);
        komik.setHarga(50000);
        komik.setVolume(72);

        // Increase the price of the comic using the overridden method
        komik.naikkanHarga();
        System.out.println("\nHarga Komik setelah naikkanHarga() overridden:");
        System.out.println("Harga: Rp. " + komik.getHarga());

        // Create a Tamu object
        Tamu tamu = new Tamu();
        tamu.setUsername("guest123");
        tamu.setPassword("guestpass");
        tamu.setId(2);
        tamu.setSisaMasaAktif(30);
        tamu.menambahMasaAktif(15);
        tamu.login();
        tamu.hapus();

        // Display Pengguna information
        System.out.println("\nPengguna:");
        System.out.println("Username: " + pengguna.getUsername());
        System.out.println("Password: " + pengguna.getPassword());
        System.out.println("ID: " + pengguna.getId());

        // Display Buku information
        System.out.println("\nBuku:");
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println("Penerbit: " + buku.getPenerbit());
        System.out.println("Jumlah Halaman: " + buku.getJumlahHalaman());
        System.out.println("Harga: Rp. " + buku.getHarga());

        // Display Komik information
        System.out.println("\nKomik:");
        System.out.println("Judul: " + komik.getJudul());
        System.out.println("Penulis: " + komik.getPenulis());
        System.out.println("Penerbit: " + komik.getPenerbit());
        System.out.println("Jumlah Halaman: " + komik.getJumlahHalaman());
        System.out.println("Harga: Rp. " + komik.getHarga());
        System.out.println("Volume: " + komik.getVolume());

        // Display Tamu information
        System.out.println("\nTamu:");
        System.out.println("Username: " + tamu.getUsername());
        System.out.println("Password: " + tamu.getPassword());
        System.out.println("ID: " + tamu.getId());
        System.out.println("Sisa Masa Aktif: " + tamu.getSisaMasaAktif() + " hari");
    }
}
