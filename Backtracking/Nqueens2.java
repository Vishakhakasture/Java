public class Nqueens2 {

  public static boolean isSafe(char board[][], int row, int col) {
    // vertical up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }

    // diagonal left
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    // diagonal right
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static boolean nQueens(char board[][], int row) {
    // base case
    if (row == board.length) {
      return true;
    }
    // recursion
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        if (nQueens(board, row + 1)) {
          return true;
        }
        board[row][j] = 'X'; // backtrack
      }
    }
    return false;
  }

  public static void printCell(char board[][]) {
    System.out.println("----------------------------------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    int n = 4;
    char board[][] = new char[n][n];
    // initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    if (nQueens(board, 0)) {
      System.out.println("Solution is possible ");
      printCell(board);
    } else {
      System.out.println("solution is not possible");
    }
  }
}
