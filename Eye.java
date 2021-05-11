package com.nitro.organs;

import java.util.Scanner;

public class Eye {
    Scanner sc = new Scanner(System.in);
    void leftCondition() {
        System.out.println("Medical Condition: " + "Normal");
        System.out.println("Colour: " + "Blue");
    }
    int toDo() {
        System.out.println("\t1. Close the eye");
        System.out.println("\t2. Wait for some time");
        int a = sc.nextInt();
        return a == 1? 1 : a;
    }
    void rightCondition() {
        System.out.println("Medical Condition: " + "Metropia");
        System.out.println("Colour: " + "Blue");
    }
}

