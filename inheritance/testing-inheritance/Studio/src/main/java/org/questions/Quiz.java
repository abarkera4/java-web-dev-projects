package org.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {

    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] questionsArray) {
        Collections.addAll(questions, questionsArray);
    }

    public void run() {

        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        for (Question question : questions) {

            //print question*************
            System.out.println(question);

            //Get and evaluate responses***********************
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i< question.getMaxResponses()) {
                String userResponse;

                //Validate******************
                do {
                    System.out.println("Please Enter a Number: ");
                    userResponse = input.nextLine();
                } while (question.isInvalid(userResponse));

                //Evaluate Response
                int userResponseNum = Integer.parseInt(userResponse);
                if (userResponses.contains(userResponseNum)) {
                    System.out.println("You already picked that one!");
                } else if (!question.getChoiceMap().get(userResponseNum).isCorrect()) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userResponseNum);
                    if (i == question.getMaxResponses() - 1) {
                    numCorrect++;
                    }
                    i++;
                }

            }
        }
        input.close();
    }
}
