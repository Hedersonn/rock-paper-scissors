package br.com.jokenpo.main;

import br.com.jokenpo.utils.JokenpoUtils;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JokenpoUtils game = new JokenpoUtils();
        Random randomNumber = new Random();
        int computerChoice = randomNumber.nextInt(1, 4);
        System.out.println("<< Rock Paper Scissors >>");
        System.out.print("Choice your option: ");
        Scanner scanner = new Scanner(System.in);
        int playerChoice = scanner.nextInt();
        game.determineWinner(playerChoice, computerChoice);
    }
}

