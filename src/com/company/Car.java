package com.company;

public class Car {
    private long id;
    private String model;

    public Car(long id, String model) {
        this.id = id;
        this.model = model;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
