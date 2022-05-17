package com.kiv;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        SimpleCsvDataSource input=new SimpleCsvDataSource(new File("src\\main\\resources\\transactions.csv"),",");
        FPgrowth yo = new FPgrowth();
        System.out.println(yo.findFrequentPattern(0.6,input));
    }
}
