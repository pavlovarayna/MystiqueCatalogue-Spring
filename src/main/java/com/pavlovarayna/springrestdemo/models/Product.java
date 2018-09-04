package com.pavlovarayna.springrestdemo.models;

//POJO Class - reflection class

public class Product {

    private int id;
    private String name;
    private String category;
    private String type;
    private String units;
    private int size;
    private int number;

    public Product(){
        //empty constructor needed
    }

    public Product(int id, String name, String category, String type, String units, int size, int number){
        this.id = id;
        this.name = name;
        this.category = category;
        this.type = type;
        this.units = units;
        this.size = size;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}