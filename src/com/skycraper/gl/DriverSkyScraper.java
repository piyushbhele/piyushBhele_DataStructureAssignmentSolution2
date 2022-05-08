package com.skycraper.gl;


import java.util.ArrayList;
import java.util.Scanner;

public class DriverSkyScraper {

    public static void main(String[] args) {

        int totalFloors;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the total no of floors in the building");
        totalFloors = sc.nextInt();
        ArrayList<Construction> list = new ArrayList<Construction>(totalFloors);


        for (int i = 0; i < totalFloors; i++) {
            System.out.println("Enter the floor size given on day :" + (i + 1));
            Construction f = new Construction();
            f.size = sc.nextInt();
            f.day = i + 1;
            list.add(i, f);
        }
        SkyScraper df = new SkyScraper();
        df.sortFloor(list);
        sc.close();


    }

}

