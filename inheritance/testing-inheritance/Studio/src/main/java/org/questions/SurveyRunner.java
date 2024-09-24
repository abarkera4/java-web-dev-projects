package org.questions;

public class SurveyRunner {

    private static final Survey survey = new Survey();

    public static void main(String[] args) {

        // Create Questions
        Choice[] trueAndFalse = {
            new Choice("True"),
                new Choice("False")
        };
        TrueOrFalse lactoseIntolerant = new TrueOrFalse("I am lactose-intolerant and need a non-dairy alternative", trueAndFalse);
        TrueOrFalse diabetic = new TrueOrFalse("I am diabetic and need a no-sugar-added alternative.", trueAndFalse);

        Choice[] flavorChoices = {
                new Choice("Vanilla"),
                new Choice("Chocolate"),
                new Choice("Strawberry")
        };
        MultipleChoice flavor = new MultipleChoice("What flavor of ice cream would you like?", flavorChoices);

        LinearScale numScoops = new LinearScale("How many scoops of ice cream would you lilke?", 3);

        Choice[] toppingChoices = {
                new Choice("Oreo Crumbles"),
                new Choice("Fresh Strawberry Slices"),
                new Choice("M&Ms"),
                new Choice("Hot Caramel Syrup"),
                new Choice("Pecans")
        };
        Checkbox toppings = new Checkbox("Select Some Toppings", toppingChoices);

        ShortAnswer flavorSuggestion = new ShortAnswer("What Flavor of Ice Cream Would You Like to See Added to Our Menu?");

        Paragraph comments = new Paragraph("Any Other Questions or Comments?");

        //Add Questions*********************
        survey.addQuestions(new Question[] {lactoseIntolerant, diabetic, flavor, numScoops, toppings, flavorSuggestion, comments});

        //Interact with User************************
        String newLine = System.lineSeparator();
        System.out.println("Thank You for Registering for Our Meetup! We Will be Serving Dessert and Would Like to Know YOur Preferences Ahead of Time." + newLine);

        survey.run();

        System.out.println(newLine + "Thank You! Your Preferences Have Been Noted for the Upcoming Event." + newLine + "\t" + String.join(newLine + "\t", survey.getAllResponses()) + newLine);


    }


}
