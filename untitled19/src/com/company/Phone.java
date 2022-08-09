package com.company;

public class Phone {
    String brand;
    String name;
    String memory;
    String color;
    int year;

    public Phone() {
    }

    public Phone(String brand, String name, String memory,String color, int year) {
        this.brand = brand;
        this.name = name;
        this.memory = memory;
        this.color = color;
        this.year = year;

    }
    public void Iphone(){
        System.out.println("Brand: "+brand);
        System.out.println("Name: "+name);
        System.out.println("Memory: "+memory);
        System.out.println("Color: "+color);
        System.out.println("Year: "+year);
    }
}
