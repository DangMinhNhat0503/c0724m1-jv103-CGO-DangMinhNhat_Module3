package com.example.bai_thi_module3.Service;

import com.example.bai_thi_module3.Entity.Land;
import com.example.bai_thi_module3.Repository.LandRepository;

import java.util.List;

public class LandService implements ILand {

    private static LandRepository landrepository = new LandRepository();

    @Override
    public List<Land> getAll() {
        List<Land> lands = landrepository.getAll();
        return lands;
    }

    @Override
    public void save(Land s) {
        landrepository.save(s);
    }

    @Override
    public void remove(String id_land) {
        landrepository.deleteById(id_land);
    }

    @Override
    public Land findByType(String type) {
        return null;
    }

    @Override
    public Land findByPrice(int price) {
        return null;
    }

    @Override
    public Land findByFloor(int floor) {
        return null;
    }

}
