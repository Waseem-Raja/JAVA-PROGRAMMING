package com.company;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int []arr=new int[3];
        int [][]twod=new int[3][3];       // two dimensional array
//        int []arrr={4,6,7,8};
        System.out.println("enter your numbers");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int element:arr)      //for each loop to display array elements
        {
            System.out.println(element);
        }
    }
}
