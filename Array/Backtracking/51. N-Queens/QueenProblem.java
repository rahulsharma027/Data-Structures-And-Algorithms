import java.util.*;
class QueenProblem{
    static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
        }
        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }
    static boolean isSafe(int row, int col, char[][] board){
        //horizontal
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        //vertical
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upper-left
        int r = row;
        for(int c = col; c >=0 && r>=0; r--, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper-right
        r = row;
        for(int c = col; c < board.length && r>=0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower-left
        r = row;
        for(int c = col; c >=0 && r < board.length; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower-right
        r = row;
        for(int c = col; c < board.length && r < board.length; r++, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static void saveBoard(char[][] board, List<List<String>> allBoards){
        String str = "";
        List<String> newBoard = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            str = "";
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 'Q'){
                    str += 'Q';
                }
                else{
                    str+='.';
                }
            }
            newBoard.add(str);
        }
        allBoards.add(newBoard);
    }
    static List<List<String>> queens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {
        List<List<String>> result = queens(4); 
        for(List<String> x : result){
            System.out.println(x);
        }
    }
}
