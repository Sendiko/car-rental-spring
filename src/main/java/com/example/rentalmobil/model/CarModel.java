package com.example.rentalmobil.model;

import java.util.ArrayList;

public class CarModel {

    private String namaMobil;
    private String platNomor;
    private String brand;
    private String model;
    private int tahunKeluaran;
    private double hargaSewa;
    private boolean available;
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
    public CarModel(String namaMobil, String platNomor, String brand, String model, int tahunKeluaran, double hargaSewa,
            boolean available, int jumlahKursi) {
        this.namaMobil = namaMobil;
        this.platNomor = platNomor;
        this.brand = brand;
        this.model = model;
        this.tahunKeluaran = tahunKeluaran;
        this.hargaSewa = hargaSewa;
        this.available = available;
        this.jumlahKursi = jumlahKursi;
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

    public static ArrayList<CarModel> getCarList() {
        ArrayList<CarModel> carList = new ArrayList<>();

        carList.add(new CarModel(
                "Avanza Hitam",
                "B 1234 XYZ",
                "Toyota",
                "Avanza",
                2021,
                350000.0,
                true,
                7));
        carList.add(new CarModel(
                "Avanza Hitam",
                "B 1234 XYZ",
                "Toyota",
                "Avanza",
                2021,
                350000.0,
                true,
                7));

        carList.add(new CarModel(
                "Mobilio Silver",
                "D 5678 ABC",
                "Honda",
                "Mobilio",
                2020,
                320000.0,
                false,
                7));

        carList.add(new CarModel(
                "Innova Reborn",
                "E 9101 DEF",
                "Toyota",
                "Innova",
                2022,
                500000.0,
                true,
                8));

        carList.add(new CarModel(
                "Xenia Putih",
                "F 1122 GHI",
                "Daihatsu",
                "Xenia",
                2019,
                300000.0,
                true,
                7));

        carList.add(new CarModel(
                "Rush Adventure",
                "G 3344 JKL",
                "Toyota",
                "Rush",
                2023,
                450000.0,
                false,
                5));

        // Return the populated list
        return carList;
    }
}
