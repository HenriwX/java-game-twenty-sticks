package com.company;

import java.util.Scanner;

public class Main {
    private static OutputMessages gameMessages = new OutputMessages();
    private static BotAlgorithm botAlgorithm = new BotAlgorithm();
    private static Scanner consoleReader = new Scanner(System.in);
    private static int matches = 20;
    private static int selector = 0;


    public static void main(String[] args) {
        gameMessages.gameStarted();
        gameStep();
    }

    public static void updateSelector() {
        if (matches < 2) {
            printWinner();
        }

        if (selector == 0) {
            selector++;
        } else {
            selector--;
        }

        gameMessages.countMatches(matches);
        gameStep();
    }

    public static void gameStep() {
        int step = 0;

        if (selector == 0) {
            step = botAlgorithm.stepBot(matches);
            gameMessages.botMove(step);
        } else {
            while (step < 1 || 3 < step) {
                gameMessages.playerMove();
                step = consoleReader.nextInt();
            }
        }

        matches -= step;
        updateSelector();
    }

    public static void printWinner() {
        if (matches == 1) {
            gameMessages.playerWin("Бот");
        } else {
            gameMessages.playerWin("Игрок");
        }

        restartGame();
    }

    public static void restartGame() {
        gameMessages.gameStarted();
        selector = 0;
        matches = 20;
        gameStep();
    }
}