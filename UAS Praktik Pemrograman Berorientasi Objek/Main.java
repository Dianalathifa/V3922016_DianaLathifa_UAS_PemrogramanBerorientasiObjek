/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
// Contoh pembuatan kelas Mobil
class Mobil {
    // Atribut
    private String merk;
    private String model;
    private int tahunProduksi;
    private boolean menyala;

    // Konstruktor
    public Mobil(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.menyala = false;
    }

    // Metode
    public void nyalakanMesin() {
        if (!menyala) {
            menyala = true;
            System.out.println("Mesin mobil dinyalakan.");
        } else {
            System.out.println("Mesin mobil sudah menyala.");
        }
    }

    public void matikanMesin() {
        if (menyala) {
            menyala = false;
            System.out.println("Mesin mobil dimatikan.");
        } else {
            System.out.println("Mesin mobil sudah mati.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Status Mesin: " + (menyala ? "Menyala" : "Mati"));
    }
}

// Contoh penggunaan kelas Mobil
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil1
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2019);
        mobil1.tampilkanInfo();

        // Menyalakan mesin mobil1
        mobil1.nyalakanMesin();

        // Mematikan mesin mobil1
        mobil1.matikanMesin();

        // Membuat objek mobil2
        Mobil mobil2 = new Mobil("Honda", "Civic", 2020);
        mobil2.tampilkanInfo();

        // Menyalakan mesin mobil2
        mobil2.nyalakanMesin();

        // Mematikan mesin mobil2
        mobil2.matikanMesin();
    }
}
