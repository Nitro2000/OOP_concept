package com.nitro.organs;

import java.util.Scanner;

public class Heart {
    private int heartrate = 65;
    Scanner sc = new Scanner(System.in);

    void condition() {
        System.out.println("Medical Condition: " + "Healthy Heart");
        System.out.println("Heart Rate: " + heartrate);
    }

    String toDo() {
        System.out.println("\tWant to increase the heart beat?");
        return sc.next().toLowerCase().equals("yes") ? "yes" : "no";
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }
}