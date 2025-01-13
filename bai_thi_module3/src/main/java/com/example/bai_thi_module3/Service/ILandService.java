package com.example.bai_thi_module3.Service;

import com.example.bai_thi_module3.Entity.Land;

import java.util.List;

public interface ILandService {
    List<Land> getAll();

    void save(Land s);

    void remove(String id_land);

    Land findByType(String type);

    Land findByPrice(int price);

    Land findByFloor(int floor);

}
