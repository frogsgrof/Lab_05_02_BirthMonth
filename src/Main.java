public class Main {
    public static void main(String[] args) {

        // Directions below:
        /*
        A program that asks the user to enter their birth month (integer 1 – 12 inclusive).
        If the user enters a value in range, the program echoes the input (“Your birth month is: N”)
        If the value is not in the range it outputs an error msg (“You entered an incorrect month value: N”).
        Here N should be the value they entered.

        Test runs:
        - valid input in range 1 - 12
        - invalid input out of range
        */

        // Pseudocode below:
        /*
        num monthNum
        output "Enter birth month [1-12]:"
        input monthNum

        if monthNum >= 1 AND monthNum <= 12 then
            output "Your birth month is: " + monthNum
        else
            output "You entered an incorrect month value: " + monthNum
        endIf
        */

        int monthNum; //input stored here

        System.out.println("Enter birth month [1-12]:");
        System.out.println("[Imagine the user inputs a number]");
        monthNum = 13; // this is me "inputting" my birth month
        System.out.println("User: " + monthNum); // makes test runs clearer

        if (monthNum >= 1 && monthNum <= 12) { // runs if month is valid
            System.out.println("Your birth month is: " + monthNum);
        } else {                               // gives error message if outside range
            System.out.println("You entered an incorrect month value: " + monthNum);
        }

    }
}