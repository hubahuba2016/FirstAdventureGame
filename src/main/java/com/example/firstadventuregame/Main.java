package com.example.firstadventuregame;
import java.util.*;

public class Main {
    public int number_of_cases = 0;
    public int case_number;

    public void Choose() {
        number_of_cases = number_of_cases + 1;
        Scanner input = new Scanner(System.in);
        if (number_of_cases == 1) {
            //System.out.println("number of cases is " + number_of_cases);
            System.out.println("Choose your choice");
            case_number = input.nextInt();
            switch (case_number) {
                case 1:
                    System.out.println("-Your spaceship crashed into a black hole and you are dead-");
                    GameOver();
                    input.nextLine();
                    input.nextLine();
                    System.exit(0);
                case 2:
                    ClearConsole();
                    System.out.println("-You see the warning on the computer-");
                    System.out.println("-WARNING: Spaceship about to crash to a black hole-");
                    Choose();
                default:
                    System.out.println("INVALID INPUT");
                    number_of_cases = 0;
                    Choose();
            }
        }
        if(number_of_cases == 2) {
            System.out.println("-TODO: You have two options-");
            System.out.println("1. Go to the cockpit and change directory");
            System.out.println("2. Evacuate to the escape pod");
            //System.out.println("number of cases is " + number_of_cases);
            System.out.println("Choose your choice");
            case_number = input.nextInt();
            switch (case_number) {
                case 1:
                    ClearConsole();
                    System.out.println("-You go to the cockpit-");
                    System.out.println("-You saw the control with the warning: fuel empty-");
                    break;
                case 2:
                    System.out.println("-You go to escape pod and landed on a nearby planet");
                    GameOver();
                    input.nextLine();
                    input.nextLine();
                    System.exit(0);
                default:
                    System.out.println("INVALID INPUT");
                    number_of_cases = 1;
                    Choose();
            }
        }
        if(number_of_cases==2 && case_number == 1)
                {
                    System.out.println("1. Try to refuel the spaceship");
                    System.out.println("2. Go to the escape pod");
                    Choose();
                }
                if (number_of_cases==3)
                {
                    System.out.println("Choose your choice");
                    case_number = input.nextInt();
                    switch (case_number)
                    {
                        case 1:
                            System.out.println("-You tried to refuel the spaceship but there's no time-");
                            System.out.println("-Your spaceship crashed into a black hole-");
                            GameOver();
                            input.nextLine();
                            input.nextLine();
                            System.exit(0);

                        case 2:
                            System.out.println("-You went to the escape pod and you evacuate to a nearby planet-");
                            GameOver();
                            input.nextLine();
                            input.nextLine();
                            System.exit(0);
                        default:
                            System.out.println("INVALID INPUT");
                            number_of_cases = 2;
                            Choose();

                    }
                }
            }


    public static void EndOfScene() {
        System.out.println("=================================");
        System.out.println("press enter to continue");
    }

    public static void GameOver() {
        System.out.println("=================================");
        System.out.println("game over");
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

