import java.util.Scanner;

public class Main {

    public static void guessGame1() {
        int guessTime = 10;
        System.out.println("I have randomly chosen a number between [1, 100], Try to guess it:");
        int randomNumber = (int) Math.round(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        while (guessTime > 0) {
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Congrats, you have guess it right");
                break;
            } else if (number < randomNumber) {
                System.out.println("it is bigger than " + number);
            } else if (number > randomNumber) {
                System.out.println("it is smaller than " + number);
            }
            guessTime--;
            System.out.println("you have " + guessTime + "(es) left");
        }
        if (guessTime == 0) {
            System.out.println("You have run out of guesses");
            System.out.println("The random number is " + randomNumber);
        }
    }

    public static void guessGame2() {
        int randomNumber = (int) Math.round(Math.random() * 100);
        boolean hasWon = false;
        System.out.println("I have randomly chosen a number between [1, 100], Try to guess it:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            int number = scanner.nextInt();
            if (number == randomNumber) {
                hasWon = true;
                break;
            } else if (number < randomNumber) {
                System.out.println("it is bigger than " + number);
            } else if (number > randomNumber) {
                System.out.println("it is smaller than " + number);
            }
            System.out.println("You have " + i + "guesses left");
        }
        if (hasWon) {
            System.out.println("Congratulations, you win");
        } else {
            System.out.println("Out of guesses, YOU LOSE!!!");
            System.out.println("The number is " + randomNumber );
        }
    }
    public static void main(String[] args) {
        //guessGame1();
        guessGame2();
    }
}