import java.util.Scanner;

public class mathQuizApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scan.nextLine();

        String welcomeMessage = "Hello, " + userName + "! Welcome to the math quiz.";
        System.out.println(welcomeMessage);
        int totalScore = 0;
// Addition question
        int additionQuestionMarks = 5;
        String additionQuestion = "What is 3+2? ";
        System.out.print(additionQuestion);
        int additionUserAnswer = scan.nextInt();
        System.out.println("Your answer: " + additionUserAnswer);
        int additionCorrectAnswer = 5;
        if (additionUserAnswer == additionCorrectAnswer) {
            totalScore += additionQuestionMarks;
            System.out.println("Your answer is 'Correct' and you scored: "+ additionQuestionMarks + " marks.");
        } else {
            System.out.println("Your answer is 'Incorrect' and you scored: 0 marks.");
        }
// Division Question
        int divisionQuestionMarks = 5;
        String divisionQuestion = "What is 6/2? ";
        System.out.print(divisionQuestion);
        int divisionUserAnswer = scan.nextInt();
        System.out.println("Your answer: " + divisionUserAnswer);
        int divisionCorrectAnswer = 3;
        if (divisionUserAnswer == divisionCorrectAnswer) {
            totalScore += divisionQuestionMarks;
            System.out.println("Your answer is 'Correct' and you scored: "+ divisionQuestionMarks + " marks.");
        } else {
            System.out.println("Your answer is 'Incorrect' and you scored: 0 marks.");
        }
// Multiplication Question
        int multiplicationQuestionMarks = 5;
        String multiplicationQuestion = "What is 3*5? ";
        System.out.print(multiplicationQuestion);
        int multiplicationUserAnswer = scan.nextInt();
        System.out.println("Your answer: " + multiplicationUserAnswer);
        int multiplicationCorrectAnswer = 15;
        if (multiplicationUserAnswer == multiplicationCorrectAnswer) {
            totalScore += multiplicationQuestionMarks;
            System.out.println("Your answer is 'Correct' and you scored: "+ multiplicationQuestionMarks + " marks.");
        } else {
            System.out.println("Your answer is 'Incorrect' and you scored: 0 marks");
        }
// Subtraction Question
        int subtractQuestionMarks = 5;
        String subtractQuestion = "What is 6-2? ";
        System.out.print(subtractQuestion);
        int subtractUserAnswer = scan.nextInt();
        System.out.println("Your answer: " + subtractUserAnswer);
        int subtractCorrectAnswer = 4;
        if (subtractUserAnswer == subtractCorrectAnswer) {
            totalScore += subtractQuestionMarks;
            System.out.println("Your answer is 'Correct' and you scored: "+ subtractQuestionMarks + " marks.");
        } else {
            System.out.println("Your answer is 'Incorrect' and you scored: 0 marks");
        }

        System.out.println("Thanks " + userName + ". Your total score is: "+ totalScore);
        scan.close();
// Total Marks
    }
}