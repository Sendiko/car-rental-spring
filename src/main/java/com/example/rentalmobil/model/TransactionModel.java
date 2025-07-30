package com.example.rentalmobil.model;

import java.util.ArrayList;
import java.util.List;

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

        public static List<TransactionModel> getTransactions() {
        List<TransactionModel> transactions = new ArrayList<>();
        List<CustomerModel> customers = CustomerModel.getCustomers();
        List<CarModel> cars = CarModel.getCarList();

        // Create dummy transactions
        if (customers.size() >= 3 && cars.size() >= 3) {
            // Transaction 1
            transactions.add(new TransactionModel(
                    customers.get(0), // Budi Santoso
                    cars.get(0),     // Avanza Hitam
                    "Credit Card"
            ));

            // Transaction 2
            transactions.add(new TransactionModel(
                    customers.get(1), // Siti Aminah
                    cars.get(2),     // Innova Reborn
                    "Cash"
            ));

            // Transaction 3
            transactions.add(new TransactionModel(
                    customers.get(2), // Joko Susilo
                    cars.get(4),     // Rush Adventure
                    "Debit Card"
            ));

            // Transaction 4
            transactions.add(new TransactionModel(
                    customers.get(3), // Ayu Lestari
                    cars.get(1),     // Mobilio Silver (even if unavailable in dummy data, for example)
                    "Credit Card"
            ));

             // Transaction 5
            transactions.add(new TransactionModel(
                    customers.get(4), // Dewi Permata
                    cars.get(3),     // Xenia Putih
                    "Cash"
            ));
        } else {
            System.out.println("Not enough dummy customer or car data to create transactions.");
        }

        return transactions;
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
