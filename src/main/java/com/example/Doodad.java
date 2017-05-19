package com.example;

public class Doodad implements Identifiable<Integer> {

    Integer id;
    String name;

    Doodad(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
