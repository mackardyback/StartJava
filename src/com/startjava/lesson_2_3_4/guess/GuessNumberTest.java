package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("player1 name: ");
        Player player1 = new Player(scanner.next());
        System.out.print("player2 name: ");
        Player player2 = new Player(scanner.next());

        GuessNumber game = new GuessNumber(player1, player2);

        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                playerAnswer = scanner.next();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
    }
}