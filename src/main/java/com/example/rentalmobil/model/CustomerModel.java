package com.example.rentalmobil.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerModel {

    /**
     * Access modifier
     * 
     * Cara untuk menentukan akses untuk Atribut dan Method.
     */
    private String name;
    private String nik;
    private String phoneNumber;

    /**
     * Constructor untuk membuat object `Customer`
     * @param name
     * @param nik
     * @param phoneNumber
     */

    public CustomerModel(String name, String nik, String phoneNumber) {
        this.name = name;
        this.nik = nik;
        this.phoneNumber = phoneNumber;
    }

    /* Dummy Data */
    public static List<CustomerModel> getCustomers() {
        List<CustomerModel> customerList = new ArrayList<>();

        customerList.add(new CustomerModel("Budi Santoso", "3276011234567890", "081234567890"));
        customerList.add(new CustomerModel("Siti Aminah", "3276029876543210", "087654321098"));
        customerList.add(new CustomerModel("Joko Susilo", "3276034567890123", "085678901234"));
        customerList.add(new CustomerModel("Ayu Lestari", "3276040123456789", "089012345678"));
        customerList.add(new CustomerModel("Dewi Permata", "3276055555555555", "081122334455"));
        customerList.add(new CustomerModel("Rizky Pratama", "3276066666666666", "087788990011"));

        return customerList;
    }

    /**
     * 
     * Getter dan Setter
     * 
     * Fungsi untuk membantu mengakses Atribut.
     * 
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "==> Data Pelanggan <==" + 
        "\nNama: " + name +
        "\nNIK: " + nik + 
        "\nNomor HP: " + phoneNumber;
    }

}
