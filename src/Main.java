import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Model
        String data = "Initial Data";

        // View & Presenter logic combined in one messy block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current Data: " + data);
        System.out.print("Enter new data: ");
        data = scanner.nextLine();
        System.out.println("Data updated to: " + data);

        System.out.println("Performing more operations...");

        // Pretend this is more presenter logic
        System.out.print("Enter another piece of data: ");
        String moreData = scanner.nextLine();
        System.out.println("More data: " + moreData);

        // This should be part of the model but is cluttered here
        data = data + " | " + moreData;
        System.out.println("Final combined data: " + data);
    }
}

/*
1. Separate the Model, View, and Presenter into different classes.

2. Ensure that the Presenter acts as the intermediary between the Model and the View.

3. Make the Model responsible for managing the data, the View responsible for displaying and gathering user input,
and the Presenter for coordinating between them.
*/