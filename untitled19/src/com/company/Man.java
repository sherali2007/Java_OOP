package com.company;

public class Man {
    String name;
    String weight;
    String height;
    int young;


    public Man(String name, String weight, String height, int young) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.young = young;
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Weight: "+weight);
        System.out.println("Height: "+height);
        System.out.println("Young: "+young);
    }
}
