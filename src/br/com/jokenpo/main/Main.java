package br.com.jokenpo.main;

import br.com.jokenpo.utils.JokenpoUtils;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Rock\n2. Paper\n3.Scissors");

            JokenpoUtils game = new JokenpoUtils();
            Random randomNumber = new Random();
            int computerChoice = randomNumber.nextInt(1, 4);
            System.out.println("<< Rock Paper Scissors >>");
            System.out.print("Choose your option: ");
            Scanner scanner = new Scanner(System.in);
            int playerChoice = scanner.nextInt();
            game.determineWinner(playerChoice, computerChoice);

            System.out.println("Press (Y) to continue or any another key to exit: ");
            Scanner scannerContinue = new Scanner(System.in);
            String playerContinueChoice = scannerContinue.next();


            if(playerContinueChoice.charAt(0) == 'Y' || playerContinueChoice.charAt(0) == 'y') {
                // continue
            } else {
                System.out.println("Shutting Down...");
                break;
            }
        }
    }
}

