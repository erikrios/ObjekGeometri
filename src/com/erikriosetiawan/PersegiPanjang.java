package com.erikriosetiawan;

public class PersegiPanjang extends ObjekGeometri {

    private double lebar;
    private double tinggi;

    public PersegiPanjang() {

    }

    public PersegiPanjang(double lebar, double tinggi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public PersegiPanjang(double lebar, double tinggi, String warna, boolean terisi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
        setWarna(warna);
        setTerisi(terisi);
    }

    /**
     * Mengembalikan lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * Menetapkan suatu lebar baru
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * Mengembalikan tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * Menetapkan suatu tinggi baru
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * Mengembalikan luas
     */
    @Override
    public double getLuas() {
        return lebar * tinggi;
    }

    /**
     * Mengembalikan keliling persegi panjang
     */
    @Override
    public double getKeliling() {
        return 2 * (lebar + tinggi);
    }
}
