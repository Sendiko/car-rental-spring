package com.example.rentalmobil.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "car")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mobil")
    private int idMobil;

    @Column(name = "nama_mobil")
    private String namaMobil;

    @Column(name = "plat_nomor")
    private String platNomor;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "tahun_keluaran")
    private int tahunKeluaran;

    @Column(name = "harga_sewa")
    private double hargaSewa;

    @Column(name = "available")
    private boolean available;

    @Column(name = "jumlah_kursi")
    private int jumlahKursi;

    /**
     * Constructor
     *
     * @param namaMobil     The name of the car.
     * @param platNomor     The license plate number.
     * @param brand         The brand of the car (e.g., Toyota, Honda).
     * @param model         The specific model of the car (e.g., Avanza, Civic).
     * @param tahunKeluaran The year the car was manufactured.
     * @param hargaSewa     The rental price per day.
     * @param available     The availability status of the car.
     * @param jumlahKursi   The number of seats in the car.
     */
    public CarModel(int idMobil, String namaMobil, String platNomor, String brand, String model, int tahunKeluaran, double hargaSewa,
            boolean available, int jumlahKursi) {
        this.idMobil = idMobil;
        this.namaMobil = namaMobil;
        this.platNomor = platNomor;
        this.brand = brand;
        this.model = model;
        this.tahunKeluaran = tahunKeluaran;
        this.hargaSewa = hargaSewa;
        this.available = available;
        this.jumlahKursi = jumlahKursi;
    }

    public CarModel() {
    }

    public int getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil = idMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahunKeluaran() {
        return tahunKeluaran;
    }

    public void setTahunKeluaran(int tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    /**
     * Returns a more readable, multi-line string representation of the Mobil
     * object.
     *
     * @return A formatted string containing the car's details.
     */
    @Override
    public String toString() {
        return "Mobil Details:\n" +
                "\tNama Mobil:     " + namaMobil + '\n' +
                "\tPlat Nomor:     " + platNomor + '\n' +
                "\tBrand:          " + brand + '\n' +
                "\tModel:          " + model + '\n' +
                "\tTahun Keluaran: " + tahunKeluaran + '\n' +
                "\tHarga Sewa:     " + hargaSewa + '\n' +
                "\tAvailable:      " + available + '\n' +
                "\tJumlah Kursi:   " + jumlahKursi;
    }
}
