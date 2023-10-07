package sorting.InsertionSort1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertionSort1(a, n);
    }

    static void insertionSort1(int[] a, int n) {
        int curr = a[n - 1];
        int j = n - 2;
        while (j >= 0 && a[j] > curr) {
            a[j + 1] = a[j];
            j--;
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        a[j + 1] = curr;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
/*
Insertion Sort 1
Given a sorted list with an unsorted number e in the rightmost cell, can you write some simple code to insert e into the array so that it remains sorted?

Guideline: Assume you are given the array of size N indexed 0 . . . N-1. Store the value of arr[N-1]. Now test lower index values successively from N-2 to 0 until you reach a value that is lower than arr[N-1] .Each time your test fails, copy the value at the lower index to the current index and print your array. When the next lower indexed value is smaller than arr[N-1], insert the stored value at the current index and print the entire array.

Print the interim and final arrays, each on a new line. No return value is expected.

Input Format
The first line contains the integer n, the size of the array arr .

The next line contains n space-separated integers arr[0] .... arr[n-1].

You need to complete insertionSort1 function which contains arr of size N and print the interim and final array each line in this function only.

Output Format
Print the array as a row of space-separated integers each time there is a shift or insertion.

Example 1
Input

5
2 4 6 8 3
Output

2 4 6 8 8
2 4 6 6 8
2 4 4 6 8
2 3 4 6 8
Explanation

3 is removed from the end of the array.

In the 1st line , 8>3 so 8 is shifted one cell to the right.

In the 2nd line , 6>3 so 6 is shifted one cell to the right.

In the 3rd line , 4>3 so 4 is shifted one cell to the right.

In the 4th line , 2<3 so 3 is placed at position 1.

Example 2
Input

5
1 2 4 5 3
Output

1 2 4 5 5
1 2 4 4 5
1 2 3 4 5
Explanation

3 is removed from the end of the array.

In the 1st line , 5>3 so 5 is shifted one cell to the right.

In the 2nd line , 4>3 so 4 is shifted one cell to the right.

In the 3rd line , 3<4 so 3 is placed at position 2.

Constraints
1 <= n <= 1000

-1000 <= arr[i] <= 1000
 */
