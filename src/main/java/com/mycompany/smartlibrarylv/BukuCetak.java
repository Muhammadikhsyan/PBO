package com.mycompany.smartlibrarylv;

public class BukuCetak extends Koleksi {
    private int jumlahHalaman;

    public BukuCetak(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        super(judul, penulis, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Halaman : " + jumlahHalaman + " halaman");
    }

    @Override
    public void caraPinjam() {
        System.out.println("Pinjam buku fisik ini langsung di meja sirkulasi.");
    }
}