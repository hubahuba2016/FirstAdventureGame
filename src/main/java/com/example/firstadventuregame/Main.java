package com.example.firstadventuregame;
import java.util.*;

public class Main {
    public int number_of_cases = 0;
    public int case_number;

    public void Choose() {
        number_of_cases = number_of_cases + 1;
        System.out.println("Choose your choice");
        Scanner input = new Scanner(System.in);
        case_number = input.nextInt();
        if (number_of_cases == 1) {
            switch (case_number) {
                case 1:
                    System.out.println("-Your spaceship crashed into a black hole and you are dead-");
                    break;
                case 2:
                    System.out.println("-You see the warning on the computer-");
                    System.out.println("-WARNING: Spaceship about to crash to a black hole-");
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    number_of_cases = 0;
                    Choose();
            }
        }
    }

    public static void EndOfScene() {
        System.out.println("=================================");
        System.out.println("press enter to continue");
    }

    /*public static void WaitForEnter()
    {
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    public final static void ClearConsole() {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }

    public void game() {
        ClearConsole();
        Scanner input_game = new Scanner(System.in);
        System.out.println("-Vhoom vhoom!-");
        EndOfScene();
        input_game.nextLine();
        ClearConsole();
        System.out.println("-You are feeling doozy on your bed-");
        System.out.println("-Vhoom vhoom!-");
        System.out.println("-Looks like the alarm goes off-");
        EndOfScene();
        input_game.nextLine();
        ClearConsole();
        System.out.println("1. Disable alarm and head back to bed");
        System.out.println("2. Check warning on the computer");
        Choose();
    }


    public static void main(String[] args) {
        Main gameinstance = new Main();
        gameinstance.game();
    }
}

