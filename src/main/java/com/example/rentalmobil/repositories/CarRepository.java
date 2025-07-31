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

    public CarModel findCarById(int id) {
        String query = "SELECT * FROM car WHERE id_mobil = ?";
        return template.queryForObject(query, new BeanPropertyRowMapper<>(CarModel.class), id);
    }

    public void updateCar(CarModel car) {
        String query = "UPDATE car SET nama_mobil = ?, plat_nomor = ?, brand = ?, model = ?, tahun_keluaran = ?, harga_sewa = ?, available = ?, jumlah_kursi = ? WHERE id_mobil = ?";
        template.update(query, car.getNamaMobil(), car.getPlatNomor(), car.getBrand(), car.getModel(), car.getTahunKeluaran(), car.getHargaSewa(), car.isAvailable(), car.getJumlahKursi(), car.getIdMobil());
    }

    public void deleteCar(int id) {
        String query = "DELETE FROM car WHERE id_mobil = ?";
        template.update(query, id);
    }

}
