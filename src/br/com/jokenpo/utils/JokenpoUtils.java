package br.com.jokenpo.utils;

public class JokenpoUtils {
    public void determineWinner(int player, int computer) {
        System.out.print("You: ");
        this.printMove(player);
        System.out.print("Me: ");
        this.printMove(computer);
        if (player == computer) {
            System.out.println("Draw!!");
        } else if ((player != 1 || computer != 2) && (player != 2 || computer != 3) && (player != 3 || computer != 1)) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lost");
        }
    }

    public void printMove(int number) {
        switch (number) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("Scissors");
        }

    }
}
