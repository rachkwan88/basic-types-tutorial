package com.example;

import java.util.ArrayList;
import java.util.List;

public class Tutorial {
    // Function 1
    public int[] func1(int input) {
        int[] result = new int[input];
        for (int i = 0; i < input; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    // Function 2
    public Integer[] func2(Integer input) {
        Integer[] result = new Integer[1];
        result[0] = input;
        return result;
    }

    // Function 3
    public String[] func3(String input) {
        String[] result = {input};
        return result;
    }

    // Function 4
    public List<String> func4(String[] input) {
        List<String> resultList = new ArrayList<>();
        for (String str : input) {
            resultList.add(str);
        }
        return resultList;
    }

    // Function 5
    public int[][] func5(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    // Function 6
    public String[] func6(int[][] matrix) {
        List<String> resultList = new ArrayList<>();
        for (int[] row : matrix) {
            StringBuilder rowString = new StringBuilder();
            for (int num : row) {
                rowString.append(num).append(" ");
            }
            resultList.add(rowString.toString().trim());
        }
        return resultList.toArray(new String[0]);
    }

    // Function 7
    public Object[] func7(Object obj) {
        Object[] result = new Object[1];
        result[0] = obj;
        return result;
    }
}
