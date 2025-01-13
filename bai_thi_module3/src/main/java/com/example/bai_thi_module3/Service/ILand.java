package com.example.bai_thi_module3.Service;

import com.example.bai_thi_module3.Entity.Land;

import java.util.List;

public interface ILand extends ILandService {
    @Override
    List<Land> getAll();

    @Override
    void save(Land s);

    @Override
    void remove(String id_land);

    @Override
    Land findByType(String type);

    @Override
    Land findByPrice(int price);

    @Override
    Land findByFloor(int floor);
}
