package com.aiguigu.boot.bean;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Pet{" + "name='" + name + "\'" + "}";
    }
}
