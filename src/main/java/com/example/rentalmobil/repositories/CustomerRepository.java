package com.example.rentalmobil.repositories;

import com.example.rentalmobil.model.CustomerModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    private final JdbcTemplate template;

    public CustomerRepository(JdbcTemplate template) {
        this.template = template;
    }

    public List<CustomerModel> getCustomers() {
        String query = "SELECT * FROM customer";
        return template.query(query, new BeanPropertyRowMapper<>(CustomerModel.class));
    }

    public void addCustomer(CustomerModel customer) {
        String query = "INSERT INTO customer (name, nik, phone_number) VALUES (?, ?, ?)";
        template.update(query, customer.getName(), customer.getNik(), customer.getPhoneNumber());
    }

    public CustomerModel findCustomerById(int id) {
        String query = "SELECT * FROM customer WHERE id_customer = ?";
        return template.queryForObject(query, new BeanPropertyRowMapper<>(CustomerModel.class), id);
    }

    public void updateCustomer(CustomerModel customer) {
        String query = "UPDATE customer SET name = ?, nik = ?, phone_number = ? WHERE id_customer = ?";
        template.update(query, customer.getName(), customer.getNik(), customer.getPhoneNumber(), customer.getIdCustomer());
    }

    public void deleteCustomer(int id) {
        String query = "DELETE FROM customer WHERE id_customer = ?";
        template.update(query, id);
    }
}
