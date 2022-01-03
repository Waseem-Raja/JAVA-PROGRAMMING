package com.company;

import javafx.scene.transform.Scale;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber
{
    public int  count, Numberr;
    GuessTheNumber()
    {
        count=0;

        Random rand= new Random();                 //create instance of Ramdom class
        Numberr=rand.nextInt(21);          //generate random numbers upto 2
    }
    boolean Attemptlimit() {
        return count==5;
    }
    int Guess(int x)
    {
        if(Attemptlimit()!=true) {
            if (x < Numberr) {
                count++;
                System.out.println("Higher Number Please");
                System.out.println("Remaining attempts : " + (5 - count));
                return count;

            } else if (x > Numberr) {
                System.out.println("Lower Number Please");
                count++;
                System.out.println("Remaining attempts : " + (5 - count));
                return count;
            } else {
                count++;
                System.out.println("you guessed the right number in  : " + count + "  attempts");
                return 0;
            }
        }
        return -99;
    }
}
public class Guessthenumbergame {
    public static void main(String[] args) {

        GuessTheNumber obj=new GuessTheNumber();
        int x,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("total attempts are only 5 you have to guess from 0 to 20");
        do {
            System.out.println("Enter your Number");
            x=scan.nextInt();
            c=obj.Guess(x);
            if(c==-99||c==5)
            System.out.println("You Lose ,Out of Attempts");
        }while (c<5 && c!=0);
    }
}
