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

public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number of rows in matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns in the matrix: ");
        int columns = scanner.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        
        System.out.println("Enter the elements in first matrx: ");
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements in second matrix: ");
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] resultMatrix = new int[rows][columns];
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("\nFirst Matrix is: ");
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.println(matrix1[i][j] + "");
            }
        }
        System.out.println("\nSecond Matrix is: ");
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.println(matrix2[i][j] + "");
            }
        }
        System.out.println("\nThe sum of two matrices is: ");
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.println(resultMatrix[i][j] + "");
            }
        }
    }
}
