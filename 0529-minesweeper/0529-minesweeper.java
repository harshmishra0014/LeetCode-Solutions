class Solution {
    int[][] deltas = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    int m, n;
    public char[][] updateBoard(char[][] board, int[] click) {
        int r = click[0], c = click[1];
        m = board.length;
        n = board[0].length;

        if(board[r][c] == 'M'){
            board[r][c] = 'X';
            return board;
        }

        int mines = countMines(board, click);
        if(mines > 0){
            board[r][c] = (char)(mines + '0');
        }
        else{
            board[r][c] = 'B';
            List<List<Integer>> unrevealed = getUnrevealed(board, click);
            for(List<Integer> cord : unrevealed){
                updateBoard(board, new int[]{cord.get(0), cord.get(1)});
            }
        }
        return board;
    }
    private int countMines(char[][] board, int[] click){
        int mines = 0;
        for(int[] delta: deltas){
            int i = click[0] + delta[0], j = click[1] + delta[1];
            if(i != -1 && i != m && j != -1 && j != n && board[i][j] == 'M')
                mines++;
        }
        return mines;
    }

    private List<List<Integer>> getUnrevealed(char[][] board, int[] click){
        int mines = 0;
        List<List<Integer>> cord =  new ArrayList<>();
        List<Integer> temp;
        for(int[] delta: deltas){
            int i = click[0] + delta[0], j = click[1] + delta[1];
            if(i != -1 && i != m && j != -1 && j != n && (board[i][j] == 'M' || board[i][j] =='E')) {
                temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                cord.add(temp);
            }
                
        }
        return cord;
    }
}