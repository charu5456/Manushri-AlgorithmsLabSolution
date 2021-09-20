package com.greatlearning.model.denomination;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter the size of currency denominations");
        Scanner in = new Scanner(System.in);
        int Size = in.nextInt();
        int[] array = new int[Size];

        for (int i = 0; i < Size; i++) {
            System.out.println("Enter the currency denominations value");
            array[i] = in.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = in.nextInt();
        MergeSort mer = new MergeSort();
        mer.sortArr(array, 0, array.length - 1);
        int[] currency = new int[Size];

        System.out.println("Your payment approach in order to give min no of notes will be\n");
        for(int i = 0; i < array.length; i++) {
            currency[i] = (int) ( amount / array[i] );
            amount = amount % array[i];
        }
        if(amount != 0){
            System.out.println("Money could not be dispensed");
        }else{
            for(int i = 0; i < Size; i++) {
                System.out.println(array[i] + ":" + currency[i]);
            }
        }
    }
}
