//ROCK PAPER SCISSOR GAME
package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import  java.util.Random;    //you have to include if you want to generate random numbers
public class rockpaperscissor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand= new Random();                 //create instance of Ramdom class
        int opposite=rand.nextInt(3);          //generate random numbers upto 2
        System.out.println("Enter your choice 0 for rock , 1 for scissor and 2 for paper");
        int num=scan.nextInt();
        if(num<0||num>2)
            System.out.println("please enter a valid choice");
        else {

            if(opposite==0&&num==1)
                System.out.println("Opposite wins :Rock");
            else if(opposite==1&&num==2)
                System.out.println("Opposite wins : Scissor");
            else if(opposite==2&&num==0)
                System.out.println("Opposite wins :  Paper" );
            else if(opposite==num)
                System.out.println("ITS A TIE" );
            else
            {
                if(opposite==0)
                    System.out.println("Opposite :Rock");
                else if(opposite==1)
                    System.out.println("Opposite : Scissor");
                else if(opposite==2)
                    System.out.println("Opposite  :  Paper" );

                System.out.println("YOU WIN");

            }
        }

    }
}
