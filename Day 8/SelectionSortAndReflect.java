import java.util.Scanner;

public class SelectionSortAndReflect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] aInput = scanner.nextLine().split(" ");
        int[] A = new int[aInput.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(aInput[i]);
        }

        String[] bInput = scanner.nextLine().split(" ");
        int[] B = new int[bInput.length];
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(bInput[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());

        selectionSortAndReflect(A, B, n);

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }

    public static void selectionSortAndReflect(int[] A, int[] B, int n) {
        int[][] swaps = new int[n][2];

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;

            swaps[i][0] = i;
            swaps[i][1] = minIndex;
        }

        reflectSwaps(B, swaps);
    }

    public static void reflectSwaps(int[] arr, int[][] swaps) {
        for (int i = 0; i < swaps.length; i++) {
            int temp = arr[swaps[i][0]];
            arr[swaps[i][0]] = arr[swaps[i][1]];
            arr[swaps[i][1]] = temp;
        }
    }
}

/*
Sort And Reflect

Problem Description

Selection sort works by dividing the array into two parts: a sorted and an unsorted part. In each iteration, the algorithm finds the minimum element in the unsorted part and swaps it with the first element of the unsorted part. This process continues, effectively growing the sorted part of the array until the entire array is sorted

Given two arrays A and B which are of same size and consisting of integers. Given a positive integer n, perform the selection sorting operations on array A until n number of elements move to the correct positions where they belong after the array is sorted in ascending order. Sort the second array based on the swaps in the first array and then print the second array.

Note: If duplicates are present in array A, follow the same order they occurred, while sorting

Input :
91 4 37 6 19 27 0 54 11 16
43 56 35 3 56 232 5 6 54 1
6

Output :
5 56 3 54 1 56 43 6 35 232 
*/