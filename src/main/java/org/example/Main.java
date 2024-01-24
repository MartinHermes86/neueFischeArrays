package org.example;

//Step 1: Create an array with numbers from 1 to 10 and print it to the console.
//
//
//
//
//
//
//
//
public class Main {
    public static void main(String[] args) {

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
        int[] resultArray = new int[10];
        System.out.print("Result Array: ");
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = numbers1[i] + numbers2[i];
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
    }
}