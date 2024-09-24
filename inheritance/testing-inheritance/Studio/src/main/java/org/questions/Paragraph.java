package org.questions;

public class Paragraph extends Question{

    public Paragraph(String question) {
        super(question);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + getQuestion() + newLine + "Please Enter a Response (500 Characters Max)";
    }

    @Override
    public boolean isInvalid(String response) {
        return response.length() > 500;
    }
}
