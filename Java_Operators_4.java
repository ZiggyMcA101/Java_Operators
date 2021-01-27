/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_operators_4;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Operators_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
         int value_a;
         int value_b;
         int result1;
         int result2;
         int result3;
         int result4;
         int result5;
         
      System.out.print("Enter value a:");
      value_a = input.nextInt();
      
      System.out.print("Enter value b:");
      value_b = input.nextInt();
      
      result1 = value_a + value_b;
      result2 = value_a - value_b;
      result3 = value_a*value_b;
      result4 = value_a/value_b;
      result5 = value_a%value_b;
      
      System.out.println("The result of adding "+value_a+" and "+value_b+" is "+result1+".");
      System.out.println("The result of subtracting "+value_a+" and "+value_b+" is "+result2+".");
      System.out.println("The result of multiplying "+value_a+" and "+value_b+" is "+result3+".");
      System.out.println("The result of dividing is "+value_a+" and "+value_b+" is "+result4+".");
      System.out.println("The remainder of "+value_a+" and "+value_b+" is "+result5+".");
        // TODO code application logic here
    }
    
}
