/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consultearea;
import java.util.Scanner;
/**
 *
 * @author King of Austell
 */
public class ConsulteArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create scanner
        Scanner input = new Scanner(System.in);
        // tell user to enter radius 
        System.out.println("Enter a number for radius:  ");
        double radius = input.nextDouble();
        // compute area
        double area = radius * radius * 3.14159;
        
        // display result
        System.out.println(" The area for the sircle of radius " + radius + " is "+ area);
    }
    
}
