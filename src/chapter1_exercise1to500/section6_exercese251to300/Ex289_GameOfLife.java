package chapter1_exercise1to500.section6_exercese251to300;
/*According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
*/

/*
根据 百度百科 ，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。

给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞都具有一个初始状态：1 即为活细胞（live），或 0 即为死细胞（dead）。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：

如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。给你 m x n 网格面板 board 的当前状态，返回下一个状态。

 

示例 1：


输入：board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
输出：[[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
示例 2：


输入：board = [[1,1],[1,0]]
输出：[[1,1],[1,1]]
 

提示：

m == board.length
n == board[i].length
1 <= m, n <= 25
board[i][j] 为 0 或 1
 

进阶：

你可以使用原地算法解决本题吗？请注意，面板上所有格子需要同时被更新：你不能先更新某些格子，然后使用它们的更新后的值再更新其他格子。
本题中，我们使用二维数组来表示面板。原则上，面板是无限的，但当活细胞侵占了面板边界时会造成问题。你将如何解决这些问题？


* */
public class Ex289_GameOfLife {
    //执行0ms，击败100%
    public void gameOfLife(int[][] board) {
        if(board==null||board.length==0||board[0].length==0)return;
        int[][]result=new int[board.length][board[0].length];
        //暴力求解，简单做法
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count=countNeighborLife(board,i,j);
                if(board[i][j]==1){
                    if(count==2||count==3)result[i][j]=1;
                }else {
                    if(count==3)result[i][j]=1;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               board[i][j]=result[i][j];
            }
        }

    }
    //获得这个“细胞”相邻活细胞总数
    public int countNeighborLife(int[][] board,int m,int n){
        int count=0;
        int m1=m==0?m:m-1;
        int n1=n==0?n:n-1;
        int m2=board.length==m?m:m+1;
        int n2=board[0].length==n?n:n+1;
        for(int i=m1;i<=m2;i++){
            for(int j=n1;j<=n2;j++){
                if(i!=m||n!=j){
                    if(board[i][j]==1)count++;
                }
            }
        }
        return count;
    }
}
