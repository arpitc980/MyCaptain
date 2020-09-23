/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arpit
 */
import java.util.Scanner;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an positive number: ");
        int num = scan.nextInt();
        scan.close();
        for (int i=2;i<=num/2;i++)
        {
            temp = num%i;
            if (temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
        {
            System.out.println(num + " is a Prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
    
}
