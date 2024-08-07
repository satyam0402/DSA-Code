public class NqueensProblem {
    public static void main(String[] args) {

    }

    static int queen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            // place the queen if its safe
            if (isSafe(board, row, col)) {
                board[row][col] == true;
                count += queen(board, row + 1);
                board[row][col] == false;

            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for ( int i = 0; i < row; i++){
            if (board[i][col]) {
                return false;
            }
        }
        //diagonal
        int maxLeft = Math.min(row,col);
        for(int i = 1; i < maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
    }
}

