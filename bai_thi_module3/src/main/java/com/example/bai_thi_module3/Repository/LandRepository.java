package com.example.bai_thi_module3.Repository;

import com.example.bai_thi_module3.Entity.Land;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LandRepository {
    public List<Land> getAll() {
        List<Land> lands = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from land");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String id_land = rs.getString("id_land");
                String status = rs.getString("status");
                String area = rs.getString("area");
                int floor = rs.getInt("floor");
                String type = rs.getString("type");
                int price = rs.getInt("price");
                String start_date = rs.getString("start_date");
                String end_date = rs.getString("end_date");
                lands.add(new Land(id_land, status, area, floor, type, price, start_date, end_date));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lands;
    }

    public void deleteById(String id_land) {
        Connection connection = BaseRepository.getConnection();
        String sql = "delete from land where id_land = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id_land);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Land s) {
        Connection connection = BaseRepository.getConnection();
        String sql = "insert into land(id_land, status, area, floor, type, price, start_date, end_date, description) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, s.getId_land());
            preparedStatement.setString(2, s.getStatus());
            preparedStatement.setString(3, s.getArea());
            preparedStatement.setInt(4, s.getFloor());
            preparedStatement.setString(5, s.getType());
            preparedStatement.setInt(6, s.getPrice());
            preparedStatement.setString(7, s.getStart_date());
            preparedStatement.setString(8, s.getEnd_date());
            preparedStatement.setString(9, s.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
