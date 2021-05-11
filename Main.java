package com.nitro.organs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] a = {"Left Eye", "Right Eye", "Heart", "Stomach", "Skin", "Quit"};
        int[] b = {1, 2, 3, 4, 5, 6};
        System.out.println("Hello Sir");
        System.out.println("May i have your \"Name\" and \"Age\"");
        System.out.println("Name: " + sc.nextLine());
        System.out.println("Age: " + sc.nextInt());
        boolean ans = true;
        Heart h = new Heart();
        while (ans) {
            Thread.sleep(1000);
            System.out.println("Choose Organ");
            for (int i = 0; i < 6; i++) {
                System.out.print("\t" + b[i] + ". " + a[i] + "\n");
            }
            int Answer = sc.nextInt();
            switch (Answer) {
                case (1):
                    Eye e = new Eye();
                    System.out.println("Organ: Left Eye");
                    e.leftCondition();
                    int num = e.toDo();
                    if (num == 1) {
                        System.out.println("Left eye is closed.");
                    } else if (num == 2) {
                        System.out.println("Ok Waiting");
                    }
                    break;
                case (2):
                    Eye er = new Eye();
                    System.out.println("Organ: Right Eye");
                    er.rightCondition();
                    num  = er.toDo();
                    if (num == 1) {
                        System.out.println("Right eye is closed.");
                    } else if (num == 2) {
                        System.out.println("Ok Waiting");
                    }
                    break;
                case (3):
                    System.out.println("Organ: Heart");
                    h.condition();
                    if (h.toDo().equals("yes")) {
                        System.out.println("Enter new heart rate");
                        h.setHeartrate(sc.nextInt());
                        System.out.println("Heart Rate Increased To: " + h.getHeartrate());
                    }
                    break;
                case (4):
                    Stomach s = new Stomach();
                    System.out.println("Organ: Stomach");
                    s.condition();
                    s.toDo();
                    break;
                case (5):
                    Skin sk = new Skin();
                    System.out.println("Organ: Skin");
                    sk.condition();
                    break;
                default:
                    ans = false;
                    break;
            }
        }
    }
}
