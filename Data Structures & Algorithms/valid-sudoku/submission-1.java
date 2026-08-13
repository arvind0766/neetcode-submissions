class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] block = new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int val = board[i][j]-'1';

                int blockIndex = (i/3)*3 + (j/3);
                if(rows[i][val] || cols[j][val] || block[blockIndex][val]) return false;

                rows[i][val]=true;
                cols[j][val]=true;
                block[blockIndex][val]=true;
            }
        }
        return true;
        
    }

}
