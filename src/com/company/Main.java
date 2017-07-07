package com.company;

import java.util.Arrays;
import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// Must print the largest sum among all the hourglasses in the array
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int hourglassSums[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                hourglassSums[i][j] =   arr[i][j] +arr[i][j+1] + arr[i][j+2] +      //top three hourglass locations
                                                    arr[i+1][j+1] +                  //middle hourglass location
                                        arr[i+2][j] +arr[i+2][j+1] + arr[i+2][j+2];//bottom 3 hourglass locations
            }
        }
        int largestSum = hourglassSums[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (hourglassSums[i][j] > largestSum)
                    largestSum = hourglassSums[i][j];

            }
            }
        System.out.println(largestSum);

//        System.out.println(Arrays.deepToString(arr));
//        System.out.println("test");

    }
}
