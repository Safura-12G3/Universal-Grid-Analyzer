
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
        // Step 3: Display Grid
public static void displayGrid(int[][] grid) {
    for (int[] row : grid) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

// Step 4: Row and Column Sums
public static void rowColumnSums(int[][] grid) {
    int rowSums = new int[grid.length];
    int colSums = new int[grid[0], length];

    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            rowSums[i] += grid[i] [j];
            colSums[j] += grid[i] [j];
        }
    }

    System.out.println("Row sums:");
    for (int sum : rowSums) System.out.print(sum + " ");
    
    System.out.println("\nColumn sums:");
    for (int sum : colSums) System.out.print(sum + " ");
}

// Step 5: Maximum and Minimum + Position
public static void maxMin(int[][] grid) {
    int max = grid[0][0], min = grid[0][0];
    int maxRow = 0, maxCol = 0;
    int minRow = 0, minCol = 0;

    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {

            if (grid[i][j] > max) {
                max = grid[i][j];
                maxRow = i;
                maxCol = j;
            }

            if (grid[i][j] < min) {
                min = grid[i][j];
                minRow = i;
                minCol = j;
            }
        }
    } 

    System.out.println("Max: " + max + " at (" + maxRow + "," + maxCol + ")");
    System.out.println("Min: " + min + " at (" + minRow + "," + minCol + ")");

}

// Step 6: Frequency Check
public static void frequencyCheck(int[][] grid) {
    
    System.out.print("Enter value to count: ");
    int valuue = input.nextInt();

    System.out.print("Enter threshold: ");
    int threshold = input.nextInt();

    int countvALUE = 0, countGreater = 0;

    for (int[] row : grid) {
        for (int val : row) {
            if (val == value) countValue++;
            if (val > threshold) countGreater++;
        }
    }
    System.out.println("Occurences of " + value + ": " + countValue);
    System.out.println("Values > " + threshold + ": " + countGreater);
}

// Step 7: Pattern Detection
public static void patternDetection(int[][] grid) {

    boolean found = false;

    for (int i + 0; i < grid.length; i++) {
        boolean increasing = true;

        for (int j = 0; i < grid[0].length - 1; j++) {
            if (grid[i][j] >= grid[i][j + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Row " + i + " is strictly increasing.");
            found = true;
        }
    }

    if (!found) {
        System.out.println("No increasing row found.");
    }
}

}