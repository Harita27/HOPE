class Solution{
    int changed=0;
    int[][] diff=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(char[][] board,int row,int col,int R,int C){
        if(board[row][col] !='O') return ;
        board[row][col]='#';
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR>=0 && adjR<R && adjC>=0 && adjC<C){
                dfs(board,adjR,adjC,R,C);
                changed++;
            }
        }return ;
    }
    
    public void solve(char[][] board) {
        int R=board.length;
        int C=board[0].length;
        int max=0;
        for(int row=0;row<R;row++){
            if(board[row][0]=='O'){
                dfs(board,row,0,R,C);
                
            }
            if(board[row][C-1]=='O'){
                dfs(board,row,C-1,R,C);
                
            }
        }
        for(int col=0;col<C;col++){
            if(board[0][col]=='O'){
                dfs(board,0,col,R,C);

            }
            if(board[R-1][col]=='O')
            {
                dfs(board,R-1,col,R,C);
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='#') board[i][j]='O';
            }
        }
        System.out.println("total changes "+changed);
        return;

        
    }
}