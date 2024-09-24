package org.questions;

public class Checkbox extends Question{

    public Checkbox(String question, Choice[] choiceArray) {

        super(question, choiceArray);
        setMaxResponses(getNumCorrect());

    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "Choose All Correct Answers" + newLine + getFormattedChoices();
    }

/*
    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }*/

    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect > 0 ? numCorrect : getChoiceMap().size();
    }

}
