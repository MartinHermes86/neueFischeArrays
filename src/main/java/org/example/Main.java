package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Implement a program that reads a text from the console and then outputs the letters individually. Tip: Learn about the Scanner class.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userString = scanner.nextLine();
        System.out.println("You entered: " + userString);
        for (int i = 0; i < userString.length(); i++) {
            System.out.println(userString.charAt(i));
        }
        scanner.close();


        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Step 3: Find the largest number in the array and print it to the console.
        int largest = numbers1[0];
        for (int number : numbers1) {
            System.out.println(number);

            if (number > largest) {
                largest = number; // Update largest if current number is greater
            }
        }

        System.out.println("Largest number in the array: " + largest);


        //Step 2: Calculate the sum of all numbers in the array and print the result to the console.
        int sum = 0;
        for (int number : numbers1) {
            sum += number;
        }
        System.out.println("Sum of elements " + sum);

        //Step 4: Create a second array with numbers from 11 to 20.
        //Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.

        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] resultArray = sumArrays(numbers1, numbers2);
        System.out.print("Result Array: ");
        for (int number : resultArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] sumArrays(int[] array1, int[] array2) {

        int[] sum = new int[array1.length];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = array1[i] + array2[i];
        }

        return sum;
    }
}