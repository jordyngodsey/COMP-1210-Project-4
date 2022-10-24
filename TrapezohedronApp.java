import java.util.Scanner;
/**
 * A program that reads in the values for label, color, and edge of a
 * trapezohedron, creates a trapezohedron object and prints the object.
 *
 * Project 4
 *@author Jordyn Godsey - COMP 1210 - 007
 *@version 2/10/22
 */
public class TrapezohedronApp {
    /**
      * Prompts users for input values and uses them to make calculations for
      * a trapezohedron object.
      *
      *@param args - Command Line Arguments
      */
   public static void main(String[] args) {
      // Declare variables
      String label, color;
      double shortEdge;
      Scanner userInput = new Scanner(System.in);
      
      // Read input from user
      System.out.println("Enter label, color, and short edge length for a "
                 + "trapezohedron.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tcolor: ");
      color = userInput.nextLine();
      System.out.print("\tshort edge: ");
      shortEdge = userInput.nextDouble();
      
      // Create and print trapezohedron object
      if (shortEdge <= 0) { // Print error if short edge is <= 0
         System.out.println("Error: short edge must be greater than zero.");
      }
      else {
         Trapezohedron trap = new Trapezohedron(label, color, shortEdge);
         System.out.println("\n" + trap);
      }
   }
}