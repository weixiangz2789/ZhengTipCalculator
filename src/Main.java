// imports the things we need
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        //Creates format for scanning user input and decimal format
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("How many people are in your group: ");
        //Scan user input for number of people in the group
        int people = scan.nextInt();
        scan.nextLine ();
        System.out.print("What's the tip percentage? (0-100): ");
        //Scan user input for the percentage of tip they want
        int percent = scan.nextInt();
        scan.nextLine ();

        //Initialize the variables needed in while loop
        double cost = 0;
        double input = 0;

        //While loop used to continuously ask the user for a cost until they enter in -1
        while (input != -1.0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            //Scan user input and stores it into variable input
            input = scan.nextDouble();
            //if the user inputs any value other than -1, add the value of input to cost
            if (input != -1){
                cost += input;
            }
            scan.nextLine();
        }
        //prints everything and formats the numbers into decimals
        System.out.println("-------------------------------");
        System.out.println("Total bill before tip: $" + (formatter.format(cost)));
        System.out.println("Total percentage: " + percent + "%");
        System.out.println("Total tip: $" + (formatter.format(cost*percent/100)));
        System.out.println("Total Bill with tip: $" + (formatter.format(cost + (cost*percent/100))));
        System.out.println("Per person cost before tip: $" + (formatter.format(cost/people)));
        System.out.println("Tip per person: $" + (formatter.format(cost*percent/100/people)));
        System.out.println("Total cost per person: $" + (formatter.format((cost*percent/100/people)+(cost/people))));

    }

}
