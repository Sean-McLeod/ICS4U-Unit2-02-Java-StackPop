/*
* This is a program that
* stacks information using OOP.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-19
*/

import java.util.Scanner;

public final class StackPop {
    private StackPop() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function
    * is the main function.
    * @param args
    */
    public static void main(final String[] args) {
        // call object
        MrCoxallStack myStack = new MrCoxallStack();
        System.out.println("Stack program\n");
        // input
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many items are you going to add: ");
        try {
            int nOfItems = userInput.nextInt();
            System.out.println();

            for (int counter = 1; counter <= nOfItems; counter++) {
                // get input and push them in to pushNumber function
                System.out.print("Element " + counter + ": ");
                int anElement = userInput.nextInt();

                myStack.pushNumber(anElement);
            }
            // print the items
            System.out.println("\nThese are the items: ");
            myStack.printStack();
            // call the getter
            System.out.println("\nYour last element: ");
            System.out.println(myStack.peekElement());
            // call the pop method
            System.out.println("\nYour last element that was removed: ");
            System.out.println(myStack.popElement());
            // print the items
            System.out.println("\nThese are the refreshed items: ");
            myStack.printStack();

        } catch (Exception ex) {
            System.out.println("\nPlease enter an integer");
        }
    }
}
