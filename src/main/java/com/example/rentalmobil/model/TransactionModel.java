package com.example.rentalmobil.model;

public class TransactionModel {

    private CustomerModel customer;
    private CarModel car;
    private String paymentMethod;

    public TransactionModel(
            CustomerModel customer,
            CarModel car,
            String paymentMethod
    ) {
        this.customer = customer;
        this.car = car;
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String getCustomerPhoneNumber() {
        return customer.getPhoneNumber();
    }

    public String getCarName() {
        return car.getNamaMobil();
    }

    public String getLicensePlate() {
        return car.getPlatNomor();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String displayDetail() {
        return "====> Detail Transaksi <====" +
                "\nMobil yang di rental: " + this.car.getNamaMobil() + ", " + this.car.getPlatNomor() +
                "\nPelanggan: " + this.customer.getName() + ", " + this.customer.getPhoneNumber() +
                "\n============================";
    }

}
