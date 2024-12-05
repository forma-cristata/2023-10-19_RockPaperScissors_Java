/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

import static java.lang.Math.abs;

public class Main
{
    public static String theyThrew;
    public static String ithrew;
    public static int i;
    public static int ptCountYou;
    public static Random random = new Random();
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for(i = 0; i < 5; i++)
        {
            System.out.print("What will you play? (Rock, Paper, or Scissors): ");
            ithrew = input.nextLine();
            if (!ithrew.equalsIgnoreCase("rock")&&!ithrew.equalsIgnoreCase("paper")&&!ithrew.equalsIgnoreCase("scissors"))
            {
                System.out.print("Invalid input! What will you play? ('Rock', 'Paper', or 'Scissors' ONLY): ");
                ithrew = input.nextLine();
            }
            randomThrow();
            whoWon();
            if (abs(ptCountYou) == 3)
            {
                i=4;
            }
        }
        if (ptCountYou<0)
        {
            System.out.println("\nYou lost the tournament!");
        }
        else
        {
            System.out.println("\nYou won the tournament!");
        }

    }

    public static void randomThrow()
    {
        int player2Throw = random.nextInt(1, 4);
        if(player2Throw == 1)
        {
            theyThrew = "rock";
            System.out.println("They threw rock and you threw " + ithrew);
        }
        else if(player2Throw == 2)
        {
            theyThrew = "paper";
            System.out.println("They threw paper and you threw " + ithrew);
        }
        else
        {
            theyThrew = "scissors";
            System.out.println("They threw scissors and you threw " + ithrew);
        }
    }

    public static void whoWon()
    {
        if(theyThrew.equalsIgnoreCase(ithrew))
        {
            i--;
            System.out.println("This round was a draw.");
        }
        else if((ithrew.equalsIgnoreCase("rock") && theyThrew.equals("scissors")) || (ithrew.equalsIgnoreCase("paper") && theyThrew.equals("rock")) || (ithrew.equalsIgnoreCase("scissors") && theyThrew.equals("paper")))
        {
            ptCountYou ++;
            System.out.println("You won this round.");
        }
        else
        {
            ptCountYou --;
            System.out.println("You lost this round.");
        }

    }
}