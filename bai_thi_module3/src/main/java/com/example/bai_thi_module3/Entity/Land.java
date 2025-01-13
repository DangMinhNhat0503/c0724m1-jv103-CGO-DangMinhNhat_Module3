package com.example.bai_thi_module3.Entity;

import java.util.Objects;

public class Land {
    private String id_land;
    private String status;
    private String area;
    private int floor;
    private String type;
    private int price;
    private String start_date;
    private String end_date;
    private String description;


    public Land() {
    }

    public Land(String id_land, String status, String area, int floor, String type, int price, String start_date, String end_date) {
        this.id_land = id_land;
        this.status = status;
        this.area = area;
        this.floor = floor;
        this.type = type;
        this.price = price;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Land(String status, String area, int floor, String type, int price, String start_date, String end_date) {
        this.status = status;
        this.area = area;
        this.floor = floor;
        this.type = type;
        this.price = price;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Land(String id_land, String status, String area, int floor, String type, int price, String start_date, String end_date, String description) {
        this.id_land = id_land;
        this.status = status;
        this.area = area;
        this.floor = floor;
        this.type = type;
        this.price = price;
        this.start_date = start_date;
        this.end_date = end_date;
        this.description = description;
    }

    public String getId_land() {
        return id_land;
    }

    public void setId_land(String id_land) {
        this.id_land = id_land;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Land{" +
                "id_land=" + id_land +
                ", status='" + status + '\'' +
                ", area='" + area + '\'' +
                ", floor=" + floor +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Land)) return false;
        Land land = (Land) o;
        return Objects.equals(area, land.area);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(area);
    }
}
