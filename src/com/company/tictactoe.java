//TIC TAC TOE GAME
package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class tictat
{
    int [][] tic;
    Scanner scan;
    tictat()
    {
        scan=new Scanner(System.in);
        tic=new int[3][3];
    }
    public void setvalue(int z)
    {
        int y=z;

        switch (y)
        {
            case 1:
                System.out.println("ENTER YOUR VALUE ");
                tic[0][0]=scan.nextInt();
                break;
            case 2:
                System.out.println("ENTER YOUR VALUE ");
                tic[0][1]=scan.nextInt();
                break;
            case 3:
                System.out.println("ENTER YOUR VALUE ");
                tic[0][2]=scan.nextInt();
                break;
            case 4:
                System.out.println("ENTER YOUR VALUE ");
                tic[1][0]=scan.nextInt();
                break;
            case 5:
                System.out.println("ENTER YOUR VALUE ");
                tic[1][1]=scan.nextInt();
                break;
            case 6:
                System.out.println("ENTER YOUR VALUE ");
                tic[1][2]=scan.nextInt();
                break;
            case 7:
                System.out.println("ENTER YOUR VALUE ");
                tic[2][0]=scan.nextInt();
                break;
            case 8:
                System.out.println("ENTER YOUR VALUE ");
                tic[2][1]=scan.nextInt();
                break;
            case 9:
                System.out.println("ENTER YOUR VALUE ");
                tic[2][2]=scan.nextInt();
                break;

            default:
                break;
        }

    }
    public int check()
    {
        if ((tic[0][0]==1&&tic[0][1]==1)&&(tic[0][0]==1&&tic[0][2]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;

        }
        else if ((tic[0][0]==2&&tic[0][1]==2)&&(tic[0][0]==1&&tic[0][1]==1))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;
        }
        else if((tic[1][0]==1&&tic[1][1]==1)&&(tic[1][0]==1&&tic[1][2]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;
        }

        else if((tic[1][0]==2&&tic[1][1]==2)&&(tic[1][0]==2&&tic[1][2]==2))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;
        }

        else if((tic[2][0]==1&&tic[2][1]==1)&&(tic[2][0]==1&&tic[2][2]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;
        }

        else if((tic[2][0]==2&&tic[2][1]==2)&&(tic[2][0]==2&&tic[2][2]==2))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;
        }

        else if((tic[0][0]==1&&tic[1][0]==1)&&(tic[0][0]==1&&tic[2][0]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;
        }

        else if((tic[0][0]==2&&tic[1][0]==2)&&(tic[0][0]==2&&tic[2][0]==2))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;
        }

        else if((tic[0][1]==1&&tic[1][1]==1)&&(tic[0][1]==1&&tic[2][1]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;
        }


        else if((tic[0][1]==2&&tic[1][1]==2)&&(tic[0][1]==2&&tic[2][1]==2))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;
        }
        else if((tic[0][2]==1&&tic[1][2]==1)&&(tic[0][2]==1&&tic[2][2]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;
        }

        else if((tic[0][2]==2&&tic[1][2]==2)&&(tic[0][2]==2&&tic[2][2]==2))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;
        }

        else if((tic[0][0]==1&&tic[1][1]==1)&&(tic[0][0]==1&&tic[2][2]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;
        }

        else if((tic[0][0]==2&&tic[1][1]==2)&&(tic[0][0]==2&&tic[2][2]==2))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;
        }

        else if((tic[0][2]==1&&tic[1][1]==1)&&(tic[0][2]==1&&tic[2][0]==1))
        {
            System.out.println("HURRRY:) PLAYER IST WON");
            return 9;
        }


        else if((tic[0][2]==2&&tic[1][1]==2)&&(tic[0][2]==2&&tic[2][0]==2))
        {
            System.out.println("HURRRY:) PLAYER 2ND WON");
            return 9;

        }
        else
            return 0;



    }
    public void display()
    {
        System.out.println("|"+tic[0][0]+"|"+tic[0][1]+"|"+tic[0][2]+"|");
        System.out.println("|"+tic[1][0]+"|"+tic[1][1]+"|"+tic[1][2]+"|");
        System.out.println("|"+tic[2][0]+"|"+tic[2][1]+"|"+tic[2][2]+"|");
    }
    public int generate() // i have to figuare out how i can genrate random numbers without repetitations
    {
        Random rand= new Random();
       return 0;
    }

}
public class tictactoe {
    public static void main(String[] args) {

       Scanner scan= new Scanner(System.in);
       tictat obj= new tictat();
        System.out.println("WELCOME TO THE TIC TAC TOE");
        System.out.println("|1|2|3|");
        System.out.println("|4|5|6|");
        System.out.println("|7|8|9|");
        System.out.println("PLAYER ONE'S MARK IS 1  AND  PLAYER TWO'S MARK IS 2");
        System.out.println("PLEASE ENTER THE LOCATION NUMBER (PLAYER IST)");
        int a=scan.nextInt();
        obj.setvalue(a);
        System.out.println("PLEASE ENTER THE LOCATION NUMBER (PLAYER 2ND)");
        int b=scan.nextInt();
        obj.setvalue(b);
        int indicate=0;
        for (int i = 1; i <5; i++)
        {

           if(obj.check()!=9){

                obj.display();
                System.out.println("PLEASE ENTER THE LOCATION NUMBER (PLAYER IST)");
                int x = scan.nextInt();
                obj.setvalue(x);

                if( obj.check()!=9)
                {
                    if(i==4)
                    {

                        break;
                    }
                    System.out.println("PLEASE ENTER THE LOCATION NUMBER (PLAYER 2ND)");
                    int y;
                    y = scan.nextInt();
                    obj.setvalue(y);
                }
                else
                {
                    ++indicate;
                    break;
                }


           }
           else {
               ++indicate;
               break;
           }

        }
        if(indicate==0)
        System.out.println("ITS A TIE");


    }
}
