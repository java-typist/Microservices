package com.jason.test;

/**
 * @Author Jason
 * @CreateTime 2019/9/11 8:58
 * @Modify 2019/9/11 8:58
 * @Version 1.0
 */
public class IslandQ {

    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int number = 0;
        int col = grid[0].length;
        int row = grid.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    number++;
                }
            }
        }
        return number;
    }

    public void dfs(int row, int col, char[][] grid) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return;
        }
        if (grid[row][col] == '1') {
            grid[row][col] = '2';
            dfs(row + 1, col, grid);
            dfs(row - 1, col, grid);
            dfs(row, col + 1, grid);
            dfs(row, col - 1, grid);
        }
    }

    public int openLock(String[] deadends, String target) {
        int result = 0;
        int[] current = new int[4];
        String str = "";
        while (!str.equals("9999")) {
            str = "";
            for (int count : current) {
                str += count;
            }
            if(str.equals(target)){
                return result;
            }
//            forLock(current, deadends);
        }
        return -1;
    }

//    public int forLock(int[] current, String[] deads){
//        if()
//    }
}
