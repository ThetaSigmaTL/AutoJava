package com.company;

public class Mechanic {
    private long id;
    private String Name;

    public Mechanic(long id, String shortName) {
        this.id = id;
        this.Name = shortName;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
