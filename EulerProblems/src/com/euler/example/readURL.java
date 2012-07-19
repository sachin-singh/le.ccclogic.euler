package com.euler.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class readURL {
    public static void main(String[] args){
        String generate_URL = "http://projecteuler.net/problem=11";
        try {
            URL data = new URL(generate_URL);
            URLConnection yc = data.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
