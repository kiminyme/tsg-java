/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adder1;

/**
 *
 * @author student
 */
public class Adder1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare sum and initialize it to 0
        int sum = 0;
        // declare and initialize our operands
        int operand1 = 3;
        int operand2 = 2;
        
        // assign the sum of operand1 and operand2 to sum
        sum = operand1 + operand2;
        
        // NOTE: the plus (+) operator is acting as the
        // string concatentation operator instead of the 
        // addition operator. In Java, we use the plus (+)
        // operator to concatenate string values.
        System.out.println("Sum is: " + sum);
    }
    
}
