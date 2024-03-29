package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tutorial tutorial = new Tutorial();

        // Testing Function 1
        System.out.print("Enter an integer input for Function 1: ");
        int input1 = scanner.nextInt();
        int[] result1 = tutorial.func1(input1);
        System.out.println("Result array from Function 1: " + Arrays.toString(result1));

        // Testing Function 2
        System.out.print("Enter an integer input for Function 2: ");
        Integer input2 = scanner.nextInt();
        Integer[] result2 = tutorial.func2(input2);
        System.out.println("Result array from Function 2: " + Arrays.toString(result2));

        // Testing Function 3
        scanner.nextLine(); 
        System.out.print("Enter a string input for Function 3: ");
        String input3 = scanner.nextLine();
        String[] result3 = tutorial.func3(input3);
        System.out.println("Result array from Function 3: " + Arrays.toString(result3));

        // Testing Function 4
        System.out.print("Enter number of strings for Function 4: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); 
        String[] input4 = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            input4[i] = scanner.nextLine();
        }
        List<String> result4 = tutorial.func4(input4);
        System.out.println("Result list from Function 4: " + result4);

        // Testing Function 5
        System.out.print("Enter number of rows for Function 5: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for Function 5: ");
        int columns = scanner.nextInt();
        int[][] result5 = tutorial.func5(rows, columns);
        System.out.println("Result matrix from Function 5: ");
        for (int[] row : result5) {
            System.out.println(Arrays.toString(row));
        }

        // Testing Function 6
        System.out.println("Result array from Function 6: " + Arrays.toString(tutorial.func6(result5)));

        // Testing Function 7
        System.out.print("Enter an object input for Function 7: ");
        Object input7 = scanner.next();
        Object[] result7 = tutorial.func7(input7);
        System.out.println("Result array from Function 7: " + Arrays.toString(result7));

        scanner.close();
    }
}
