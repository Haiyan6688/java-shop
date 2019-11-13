package com.mypackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("*********Receipt*********");
        System.out.println("Product\tPrice\tStock\tTotal");
        System.out.println("Apple  \t29  \t 2  \t 58");
        System.out.println("Milk   \t15  \t 2  \t 30");
        System.out.println("Bred   \t20  \t 1  \t 20");
        System.out.println("Salt   \t18  \t 1  \t 18");
        System.out.println("The Total of this shopping is: " + "126 SEK.");
        System.out.println("*************************");
        System.out.println("");

        int t=29;//Apple price
        int Milk=15;//Milk price
        int Bred=20;//Bred price
        int Salt=18;//Salt price
        System.out.print("Please input the kg of apple：");
        int tnum=input.nextInt();//how many kg of apple
        System.out.print("Please input the boxes of milk：");
        int Milknum=input.nextInt();//how many boxes of milk
        System.out.print("Please input the stocks of bred：");
        int Brednum=input.nextInt();//The numbers of bred
        System.out.print("Please input the boxes of salt：");
        int Saltnum=input.nextInt();//how many boxes of salt
        double sum= 29*tnum + 15*Milknum + 20*Brednum + 18*Saltnum;
        System.out.println("Total of all products: "+sum);
        System.out.println("You pay        SEK"+500);
        System.out.println("Return         SEK"+(500-sum));

    }
}
