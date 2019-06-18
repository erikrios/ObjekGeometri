package com.erikriosetiawan;

public class UjiObjekGeometeri {

    /**
     *  Main method
     */
    public static void main(String[] args) {
        // Menciptakan dua objek geometri
        ObjekGeometri geoObjek1 = new Lingkaran(5);
        ObjekGeometri geoObjek2 = new PersegiPanjang(5, 3);

        System.out.println("Dua objek memiliki luas sama? " + luasSama(geoObjek1, geoObjek2));

        // Menamilkan lingkaran
        tampilObjekGeometri(geoObjek1);

        // Menampikan persegi panjang
        tampilObjekGeometri(geoObjek2);
    }

    /**
     * Suatu metode untuk membandingkan luas dua objek geometri
     */
    public static boolean luasSama(ObjekGeometri geoObjek1, ObjekGeometri geoObjek2) {
        return geoObjek1.getLuas() == geoObjek2.getLuas();
    }

    /**
     * Suatu metode untuk menampilkan suatu objek geometri
     */
    public static void tampilObjekGeometri(ObjekGeometri objek) {
        System.out.println("\nLuas adalah " + objek.getLuas());
        System.out.println("Keliling adalah " + objek.getKeliling());
    }
}
