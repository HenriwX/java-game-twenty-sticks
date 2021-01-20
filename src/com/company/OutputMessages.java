package com.company;

public class OutputMessages {

    void gameStarted() {
        System.out.println("Игра началась, на столе 20 спичек");
    }

    void countMatches(int countMatches) {
        System.out.println("На столе осталось " + countMatches + " спичек");
    }

    void playerMove() {
        System.out.print("Игрок ваш ход: ");
    }

    void botMove(int step) {
        System.out.println("Бот забрал: " + step + (step == 1 ? " спичку" : " спички"));
    }

    void playerWin(String player) {
        System.out.println("\n============\n" + player + " выиграл." + "\n============\n");
    }
}
