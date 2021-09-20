package com.greatlearning.model;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the values of array");
            array[i] = in.nextInt();
        }
        System.out.println("Enter the total no of targets that needs to be achieved");
        int targets = in.nextInt();
        int temp = 0;
        for (int i = 0; i < targets; i++) {
            System.out.println("Enter the value of target");
            int total = in.nextInt();

            for (int j = 0; j < size; j++) {
                temp = temp + array[i];
                if (temp >= total) {
                    System.out.println("Target is achieved after " + (j + 1) + " transactions");
                    break;
                }

            }
            if (temp < total) {
                System.out.println("Given target is not achieved");
                break;
            }

        }
        in.close();
        }
    }