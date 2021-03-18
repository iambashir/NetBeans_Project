package com.mtr.main.model;

public class Honda {
    private int id;
    private String code;
    private String name;
    private String model;
    private String engine;
    private double cc;
    private int gear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Honda{" + "id=" + id + ", code=" + code + ", name=" + name + ", model=" + model + ", engine=" + engine + ", cc=" + cc + ", gear=" + gear + '}';
    }
    
    
    
}
