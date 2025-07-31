package com.example.rentalmobil.repositories;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.rentalmobil.model.CarModel;

@Repository
public class CarRepository {
    
    private final JdbcTemplate template;

    public CarRepository(JdbcTemplate template) {
        this.template = template;
    }

    public List<CarModel> getCars() {
        String query = "SELECT * from car";
        return template.query(query, new BeanPropertyRowMapper<>(CarModel.class));
    }

    public void addCar(CarModel carModel) {
        String query = "INSERT INTO `car` (`nama_mobil`, `plat_nomor`, `brand`, `model`, `tahun_keluaran`, `harga_sewa`, `available`, `jumlah_kursi`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        template.update(query, carModel.getNamaMobil(), carModel.getPlatNomor(), carModel.getBrand(), carModel.getModel(), carModel.getTahunKeluaran(), carModel.getHargaSewa(), carModel.isAvailable(), carModel.getJumlahKursi());
    }

}
