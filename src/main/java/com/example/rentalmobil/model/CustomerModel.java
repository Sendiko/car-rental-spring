package com.example.rentalmobil.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private int idCustomer;

    @Column(name = "name")
    private String name;

    @Column(name = "nik")
    private String nik;

    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * No-argument constructor required by JPA
     */
    public CustomerModel() {
    }

    // Getters and Setters for all fields

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idPelanggan) {
        this.idCustomer = idPelanggan;
    }

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
}