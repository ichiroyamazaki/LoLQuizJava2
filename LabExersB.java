import java.util.Scanner;

public class LabExersB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] questions = {
            "What year did League of Legends debut?",
            "What is Poppy known as?",
            "Who created Blitzcrank?",
            "What type of game is League of Legends considered?",
            "What is the name of the champion carrying the bomb?",
            "What is Miss Fortune's first name?",
            "What does Caitlyn use as bait in her traps?"
        };

        String[][] choices = {
            {"A. 2008", "B. 2009", "C. 2010"},
            {"A. Keeper of the Hammer", "B. Shield Bearer", "C. Defender of the Realm"},
            {"A. Riot Games", "B. Nintendo", "C. Moonton"},
            {"A. MOBA", "B. RPG", "C. FPS"},
            {"A. Lux", "B. Annie", "C. Ziggs"},
            {"A. Melissa", "B. Anne", "C. Sarah"},
            {"A. Donuts", "B. Cupcakes", "C. Flowers"}
        };

        String[] correctAnswers = {"B", "A", "A", "A", "C", "C", "B"};

        int score = 0;

        System.out.println("Welcome to the League of Legends Quiz!");
        System.out.println("**************************************");
        System.out.println("Please answer the following questions:");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String choice : choices[i]) {
                System.out.println(choice);
            }

            boolean validAnswer = false;

            while (!validAnswer) {
                System.out.print("Enter your answer (A, B, or C): ");
                String answer = scanner.nextLine().toUpperCase();

                try {
                    if (!answer.equals("A") && !answer.equals("B") && !answer.equals("C")) {
                        throw new IllegalArgumentException("Invalid letter! Please choose A, B, or C.");
                    }

                    validAnswer = true;

                    if (answer.equals(correctAnswers[i])) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Incorrect answer. The correct answer is: " + correctAnswers[i]);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            System.out.println("**************************************");
        }

        System.out.println("Your final score is: " + score + " / " + questions.length);
        scanner.close();
    }
}
