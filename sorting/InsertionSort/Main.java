package sorting.InsertionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
    }

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int currEle = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currEle) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currEle;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
Insertion Sort
Implement insertion sort.

Input Format
The first line  contains one space separated integer N denoting the number of elements.

The Second line  contains N space separated integers denoting the elements of the array.

You need to complete insertionSort function which contains a array of size n and print the final sorted array in this function only.

Output Format
Print the array in sorted fashion in sorted fashion.

Example 1
Input

 6
 7 6 8 5 4 9
Output

 4 5 6 7 8 9
Explanation

Printed sorted array.

Example 2
Input

 5
 11 5 12 6 13
Output

5 6 11 12 13
Explanation

Printed sorted array.

Constraints
0 <= nums.length <= 10^4

-10^9 <= nums[i] <= 10^9
 */
