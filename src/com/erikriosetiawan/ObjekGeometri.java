package com.erikriosetiawan;

import java.util.Date;

public abstract class ObjekGeometri {
    private String warna = "putih";
    private boolean terisi;
    private Date tanggalDiciptakan;

    /**
     * Menciptakan suatu objek geometri default
     */
    protected ObjekGeometri() {
        tanggalDiciptakan = new Date();
    }

    /**
     * Menciptakan suatu objek geometri dengan warna dan nilai terisi tertentu
     */
    protected ObjekGeometri(String warna, boolean terisi) {
        tanggalDiciptakan = new Date();
        this.warna = warna;
        this.terisi = terisi;
    }

    /**
     * Mengembalikan warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * Menetapkan suatu warna baru
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * Mengembalikan terisi, karena terisi adalah suatu boolean, metode dapat dinamai isTerisi
     */
    public boolean isTerisi() {
        return terisi;
    }

    /**
     * Menetapkan suatu nilai terisi yang baru
     */
    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    /**
     * Mendapatkan tanggal diciptakan
     */
    public Date getTanggalDiciptakan() {
        return tanggalDiciptakan;
    }

    /**
     * Mengambil suatu representasi string atas objek ini
     */
    public String toString() {
        return "diciptakan pada " + tanggalDiciptakan + "\nwarna: " + warna + "dan nilai terisi: " + terisi;
    }

    /**
     * Metode abstract getLuas
     */
    public abstract double getLuas();

    /**
     * Metode abstract getKeliling
     */
    public abstract double getKeliling();
}
