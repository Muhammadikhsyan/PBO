package com.mycompany.smartlibrarylv;

public class EBook extends Koleksi {
    private double ukuranFileMB;

    public EBook(String judul, String penulis, int tahunTerbit, double ukuranFileMB) {
        super(judul, penulis, tahunTerbit);
        this.ukuranFileMB = ukuranFileMB;
    }

    public double getUkuranFileMB() {
        return ukuranFileMB;
    }

    public void setUkuranFileMB(double ukuranFileMB) {
        this.ukuranFileMB = ukuranFileMB;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran File    : " + ukuranFileMB + " MB");
    }

    @Override
    public void caraPinjam() {
        System.out.println("Akses dan unduh e-book ini melalui aplikasi digital library.");
    }
}