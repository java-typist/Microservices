package com.jason.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/6 15:06
 * @Modify 2019/9/6 15:06
 * @Version 1.0
 */
public class PascalTriangle {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = Arrays.asList(new Integer[rowIndex + 1]);
        if (rowIndex < 1) {
            list.set(0,1);
            return list;
        }
        for (int i = 0; i <= rowIndex / 2; i++) {
            int item = value(rowIndex, i);
            list.set(i, item);
            list.set(rowIndex - i, item);
        }
        return list;
    }

    public Integer value(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else if (col == 1 && row == 2) {
            return 2;
        } else {
            return value(row - 1, col - 1) + value(row - 1, col);
        }
    }

    public static void main(String[] args) {
        PascalTriangle triangle = new PascalTriangle();
        long star = System.currentTimeMillis();
        System.out.println(triangle.getRow(0));
        long end = System.currentTimeMillis();
        System.out.println(end - star);
    }
}
