package com.company;

import com.sun.jdi.AbsentInformationException;

public class Main {

    public static void main(String[] args){
        Phone phone = new Phone("Apple","Iphone 13 Pro Max","128 GB","Green",2022);
        phone.Iphone();
        System.out.println();
        Man man = new Man("Ali","53 kg","1.70",16);
        man.show();
    }
}