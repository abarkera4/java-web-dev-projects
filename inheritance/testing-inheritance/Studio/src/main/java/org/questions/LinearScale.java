package org.questions;

public class LinearScale extends Question{

    private final int highestNum;

    public LinearScale(String question, int highestNum) {
        super(question);
        this.highestNum = highestNum;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + getQuestion() + newLine + "Please Enter a Number from 1 to " + highestNum + ":" + newLine;
    }

    @Override
    public boolean isInvalid(String response) {
        try {
            int responseInt = Integer.parseInt(response);
            return responseInt < 0 || responseInt > highestNum;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
