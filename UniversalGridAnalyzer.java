
// Step 1: Basic Structure (Main Class) 
import java.util.Scanner;

public class UniversalGridAnalyzer {

    static Scanner input = new Scanner(System.in);

// Step 2: Create Grid
    public static void main(String[] args) {

       int[] [] grid = createGrid();

       int choice;

       do {
          displayMenu();
          choice = input.nextInt();

          switch (choice) {
            case 1: displayGrid(grid); break;
            case 2: rowColumnSums(grid); break;
            case 3: maxMin(grid); break;
            case 4: frequencyCheck(grid); break;
            case 5: patternDetection(grid); break;
            case 6: transformGrid(grid); break;
            case 7: subgridProcessing(grid); break;
            case 8: boundaryDiagonal(grid); break;
            case 9: validation(grid); break;
            case 0: System.out.println("Exiting...");
            default: System.out.println("Invalid choice");
          }

       } while (choice != 0);

       public static int[][] createGrid() {
           System.out.print("Enter rows (>=6): ");
           int rows = input.nextInt();

           System.out.print("Enter cols (>=6): ");
           int cols = input.nextInt();

           int[][] grid = new int[rows][cols];

           System.out.println("Enter values:");

           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {
                   grid[i][j] = input.nextInt();
                }
           }

           return grid;
        }
}