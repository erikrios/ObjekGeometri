package com.erikriosetiawan;

public class Lingkaran extends ObjekGeometri {

    private double radius;

    public Lingkaran() {

    }

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public Lingkaran(double radius, String warna, boolean terisi) {
        this.radius = radius;
        setWarna(warna);
        setTerisi(terisi);
    }

    /**
     * Mengembalikan radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Menetapkan suatu radius baru
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Mengembalikan diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Mengembalikan luas
     */
    @Override
    public double getLuas() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Mengembalikan diameter
     */
    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    /**
     * Menampilkan informasi lingkaran
     */
    public void tampilLingkaran() {
        System.out.println("Lingkaran diciptakan pada " + getTanggalDiciptakan() + " dan radiusnya adalah " + radius);
    }
}
