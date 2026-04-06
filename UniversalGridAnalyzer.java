
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
            case 0: System.out.println("Exiting..."); break;
            default: System.out.println("Invalid choice");
          }
    
       } while (choice != 0);
       }

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
    int[] rowSums = new int[grid.length];
    int[] colSums = new int[grid[0]. length];

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
    int value = input.nextInt();

    System.out.print("Enter threshold: ");
    int threshold = input.nextInt();

    int countValue = 0, countGreater = 0;

    for (int[] row : grid) {
        for (int val : row) {
            if (val == value) countValue++;
            if (val > threshold) countGreater++;
        }
    }
    System.out.println("Occurrences of " + value + ": " + countValue);
    System.out.println("Values > " + threshold + ": " + countGreater);
}

// Step 7: Pattern Detection
public static void patternDetection(int[][] grid) {

    boolean found = false;

    for (int i = 0; i < grid.length; i++) {
        boolean increasing = true;

        for (int j = 0; j < grid[0].length - 1; j++) {
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

// Step 8: Grid Transformation
// (1/3) Rotate Row Right
public static void rotateRow(int[][] grid) {

    System.out.print("Enter row index: ");
    int r = input.nextInt();

    int last = grid[r][grid[0].length - 1];

    for (int j = grid[0].length - 1; j > 0; j--) {
        grid[r][j] = grid[r][j - 1];
    }

    grid[r][0] = last;

    System.out.println("Row rotated.");
}

// (2/3) Swap Rows
public static void swapRows(int[][] grid) {

    System.out.print("Enter first row: ");
    int r1 = input.nextInt();

    System.out.print("Enter second row: ");
    int r2 = input.nextInt();

    for (int j = 0; j < grid[0].length; j++) {
        int temp = grid[r1][j];
        grid[r1][j] = grid[r2][j];
        grid[r2][j] = temp;
    }

    System.out.println("Rows swapped");
}

// (3/3) Reverse Column
public static void reverseColumn(int[][] grid) {

    System.out.print("Enter column index: ");
    int c = input.nextInt();

    int top = 0;
    int bottom = grid.length - 1;

    while (top < bottom) {
        int temp = grid[top][c];
        grid[top][c] = grid[bottom][c];
        grid[bottom][c] = temp;

        top++;
        bottom--;
    }

    System.out.println("Column reversed.");

}

public static void transformGrid(int[][] grid) {

    System.out.println("1, Rotate Row");
    System.out.println("2, Swap Rows");
    System.out.println("3. Reverse Column");

    int choice = input.nextInt();

    switch (choice) {
        case 1: rotateRow(grid); break;
        case 2: swapRows(grid); break;
        case 3: reverseColumn(grid); break;
        default: System.out.println("Invalid");
    }
}


// Step 9: Subgrid Processing
public static void subgridProcessing(int[][] grid) {

    System.out.print("Row start: ");
    int r1 = input.nextInt();

    System.out.print("Row end: ");
    int r2 = input.nextInt();

    System.out.print("Col start: ");
    int c1 = input.nextInt();

    System.out.print("Col end: ");
    int c2 = input.nextInt();

    int sum = 0;
    int max = grid[r1][c1];

    for (int i = r1; i <= r2; i++) {
        for (int j = c1; j <= c2; j++) {

            sum += grid[i][j];

            if (grid[i][j] > max) {
                max = grid[i][j];
            }
        }
    }

    System.out.println("Subgrid sum: " + sum);
    System.out.println("Subgrid max: " + max);
}


// Step 10: Boundary and Diagonals
public static void boundaryDiagonal(int[][] grid) {

    System.out.println("Boundary:");
    
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {

            if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length - 1) {
                System.out.print(grid[i][j] + " ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println("Main Diagonals:");
    for (int i = 0; i < grid.length; i++) {
        System.out.print(grid[i][i] + " ");
    }

    System.out.println("\nSecondary diagonal:");
    for (int i = 0; i < grid.length; i++) {
        System.out.print(grid[i][grid.length - 1 - i] + " ");
    }
}


// Step 11: Validation
public static void validation(int[][] grid) {

    boolean hasDuplicates = false;

    for (int i = 0; i < grid.length; i++) {

        for (int j = 0; j < grid[0].length; j++) {
            for (int k = j + 1; k < grid[0].length; k++) {

                if (grid[i][j] == grid[i][k]) {
                    hasDuplicates = true;
                }
            }
        }
    }

    System.out.println("Any row has duplicates: " + hasDuplicates);
}

// Method for Menu Display
public static void displayMenu() {
    System.out.println("\n1. Display Grid");
    System.out.println("2. Row and Column Sums");
    System.out.println("3. Maximum and Minimum");
    System.out.println("4. Frequency Check");
    System.out.println("5. Pattern Detection");
    System.out.println("6. Grid Transformation");
    System.out.println("7. Subgrid Processing");
    System.out.println("8. Boundary and Diagonals");
    System.out.println("9. Validation");
    System.out.println("0. Exit");
}
}

/* In order to run the code, paste the following into the terminal one by one.
 cd ~/Desktop/"mini project"
ls 

javac UniversalGridAnalyzer.java
java UniversalGridAnalyzer
*/