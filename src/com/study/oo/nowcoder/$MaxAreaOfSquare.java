package com.study.oo.nowcoder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class $MaxAreaOfSquare {
    @Test
    public void test(){
        char[][] test2 = new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int[][] test = new int[][]{{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        System.out.println(solve(test));
    }
    public int solve (int[][] matrix) {
        int maxSquare = 0;
        int currentRow = 0;
        int maxRow = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j-1] == '1'&&matrix[i][j] == '1'){
                    currentRow += 1;
                    maxRow = Math.max(maxRow,currentRow);
                    System.out.println(i+" "+j);
                }
                else{
                    currentRow = 0;
                }
            }currentRow = 0;
        }
        return maxRow;
    }
}
