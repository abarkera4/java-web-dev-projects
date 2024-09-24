package org.questions;

public class ShortAnswer extends Question{

    public ShortAnswer(String question) {
        super(question);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + getQuestion() + newLine + "Please Enter a Response (80 Characters Max)" + newLine;
    }

    @Override
    public boolean isInvalid(String response) {
        return response.length() > 80;
    }

}
