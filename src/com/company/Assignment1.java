package com.company;

public class Assignment1 {
    private static void task1(){
        //Variables
        byte num1 = 50;
        int num2 = 500;
        float f1 = 5.55F;
        double f2 = 2.9999999;
        String s1 = "Java";
        String s2 = " ";
        String s3 = "Training";

        //Results
        int result1 = num1 + num2;
        double result2 = f1 + f2;
        String result3 = s1 + s2 + s3;
        System.out.println("Task 1 output");
        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);
        System.out.println("Result 3: "+result3);
    }

    private static void task2(){
        int[] arr = {1, 3, 6};
        int sum = 0;
        for (int i=0 ; i<arr.length; i++)
            sum += arr[i];
        System.out.println("Task 2 output");
        System.out.println("Sum of array: "+sum);
    }

    private static void task3(){
        int[] arr1 = {1, 7, 8, 9};
        int[] arr2 = {6, 9, 4, 7};
        boolean found7 = false;
        boolean found10 = false;
        //checking 7 in arr1
        for (int i=0; i<arr1.length; i++){
            if (arr1[i] == 7){
                found7 = true;
                break;
            }
        }
        //checking 10 in arr2
        for(int i = 0; i<arr2.length; i++){
            if(arr2[i] == 10){
                found10 = true;
                break;
            }
        }
        //Result
        System.out.println("Task 3 output");
        System.out.println("Found 7 in arr1: "+found7);
        System.out.println("Found 10 in arr2: "+found10);
    }

    private static void task4and5(){
        int[] arr3 = {1, 5, 7, 9};
        int smallest = findMinimum(arr3);
        int largest = findMaximum(arr3);
        System.out.println("Task 4 output");
        System.out.println("Smallest value: "+smallest);
        System.out.println("Task 5 output");
        System.out.println("Largest value: "+largest);
    }

    private static void task6(){
        int[] arr4 = {6, 4, 9, 3, 5};
        int[] sortedArray = bubbleSort(arr4);
        System.out.println("Task 6 output");
        System.out.println("Array in ascending order");
        for(int i=0; i<sortedArray.length; i++)
            System.out.println(sortedArray[i]);
    }

    //method for finding minimum value in array
    private static int findMinimum(int[] arr){
        int minimum = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < minimum)
                minimum = arr[i];
        }
        return minimum;
    }

    //method for finding maximum value in array
    private static int findMaximum(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    //implementing bubble sort algorithm
    private static int[] bubbleSort(int[] arr){
        int n = arr.length; // no. of elements
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // putting larger value to the last
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void showAll(){
        task1();
        task2();
        task3();
        task4and5();
        task6();
    }
}
