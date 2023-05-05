import java.util.*;

public class QuizGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to my computer quiz!");
        System.out.println("Do you want to play?");
        String playing = sc.nextLine();

        if (!playing.equals("yes")) {
            System.exit(0);
        }
        System.out.println("Okay! Let's play :)");

        System.out.println("What does CPU stand for?");
        String answer = sc.nextLine();
        if (answer.toLowerCase().trim().equals("central processing unit")) {
            System.out.println("Correct!");
            score += 1;
            System.out.println("Hurray!  You received a point :)");
        } else {
            System.out.println("Incorrect!");
            System.out.println("Oops!  You lose a point :(");
        }

        System.out.println("What does GPU stand for?");
        answer = sc.nextLine();
        if (answer.toLowerCase().trim().equals("graphics processing unit")) {
            System.out.println("Correct!");
            score += 1;
            System.out.println("Hurray!  You received a point :)");
        } else {
            System.out.println("Incorrect!");
            System.out.println("Oops!  You lose a point :(");
        }

        System.out.println("What does RAM stand for?");
        answer = sc.nextLine();
        if (answer.toLowerCase().trim().equals("random access memory")) {
            System.out.println("Correct!");
            score += 1;
            System.out.println("Hurray!  You received a point :)");
        } else {
            System.out.println("Incorrect!");
            System.out.println("Oops!  You lose a point :(");
        }

        System.out.println("What does PSU stand for?");
        answer = sc.nextLine();
        if (answer.toLowerCase().trim().equals("power supply unit")) {
            System.out.println("Correct!");
            score += 1;
            System.out.println("Hurray!  You received a point :)");
        } else {
            System.out.println("Incorrect!");
            System.out.println("Oops!  You lose a point :(");
        }
        System.out.println("You got " + score + " points out of 4.");
        sc.close();
    }
}
