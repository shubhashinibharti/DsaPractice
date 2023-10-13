package sorting.MaximumOccurrence;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));
    }

    static int maximum_occurrence(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int curEle = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curEle) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curEle;
        }
        System.out.println(Arrays.toString(arr));

        int ct = 1;
        int num = 0;
        int ctOfNum = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                ct++;
            } else {
                ct = 1;
            }
            if (ctOfNum < ct) {
                num = arr[i];
                ctOfNum = ct;
            }
        }
        return num;
    }
}

/*
Maximum occurrence
You are given an array arr of length n. Your task is to print the element which has maximum occurrences in the array. If two elements have the same occurrence then print the smaller element

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers denoting the elements of the array.

Output Format
Print single integer denoting the maximum occurring element in the array.

Example 1
Input

8
7 7 6 4 8 7 3 1
Output

7
Explanation

We have arr = [7 7 6 4 8 7 3 1]

As 7 is occurring 3

Example 2
Input

7
9 8 1 1 2 2 3
Output

1
Explanation

1 and 2 have smae occurrence that is 2 so print smaller element i.e. 1.

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^9

Topic Tags
Sorting
Arrays
Companies
Walmart Global Tech
SAP
 */
