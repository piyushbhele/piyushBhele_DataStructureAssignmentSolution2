package com.skycraper.gl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class SkyScraper {


    public void sortFloor(ArrayList<Construction> list) {

        Queue<Construction> que = new LinkedList<Construction>();


        addElementToQueue(que, list);


        int position = 0;
        while (!que.isEmpty()) {
            Construction f = que.poll();

            int floorDay = f.day;
            if (floorDay < position) {
                System.out.print(f.size + ",");
            } else if (floorDay > position) {
                int j;
                for (j = position; j < floorDay; j++) {
                    System.out.println();
                    System.out.println("day " + (j + 1) + ":");
                }
                System.out.print(f.size + ",");
                position = j;
            }
        }

    }


    public void addElementToQueue(Queue<Construction> que, ArrayList<Construction> list) {
        ArrayList<Construction> tempList = new ArrayList<Construction>(list.size());
        tempList.addAll(list);
        while (!tempList.isEmpty()) {
            int max = 0;
            Construction maxFloor = new Construction();
            int index = 0;
            for (int i = 0; i < tempList.size(); i++) {
                Construction var = tempList.get(i);
                if (var.size > max) {
                    index = i;
                    max = var.size;
                    maxFloor.day = var.day;
                    maxFloor.size = var.size;

                }
            }
            que.add(maxFloor);
            tempList.remove(index);
        }
    }

}
