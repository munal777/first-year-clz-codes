package basicsLearning;

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

    public static void main(String[] args) {
        System.out.println("Let's start our Rock Paper Scissor Game..\n Choosing 0 is for Rock, 1 is for Paper, 2 is for Scissor");
        System.out.print("Enter number here: ");
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        Random rps=new Random();
        int AI=rps.nextInt(3);
        if (userInput==AI)
        {
            System.out.println("Game is Draw!");
        }
        else if (userInput==0 && AI==2 || userInput==1 && AI==0 || userInput==2 && AI==1)
        {
            System.out.println("You win!");
        }
        else 
        {
            System.out.println("Computer win!");
        }
        if (AI==0)
        {
            System.out.println("Computer Choose Rock");
        }
        else if(AI==1)
        {
            System.out.println("Computer Choose Paper");
        }
        else
        {
            System.out.println("Computer Choose Scissor");
        }
    scn.close();
    }
}
