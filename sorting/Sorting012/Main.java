package sorting.Sorting012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Sorting012(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Sorting012(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        int ct0 = 0, ct1 = 0, ct2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ct0++;
            }
            if (arr[i] == 1) {
                ct1++;
            }
            if (arr[i] == 2) {
                ct2++;
            }
        }
        int ind = 0;
        while (ct0 > 0 && ind < n) {
            res[ind] = 0;
            ct0--;
            ind++;
        }
        while (ct1 > 0 && ind < n) {
            res[ind] = 1;
            ct1--;
            ind++;
        }
        while (ct2 > 0 && ind < n) {
            res[ind] = 2;
            ct2--;
            ind++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }

    }
}
/*
0-1-2 Sorting
You are given an array arr of length n containing only 0s, 1s, and 2s. Your task is to sort the array in ascending order.

Input Format
The first line of input contains an integer n, the size of the array.

The following line contains n space-separated integers(0, 1, or 2) denoting the elements of the array.

Output Format
Print n space-separated integers denoting the segregated array.

Example 1
Input

9
0 2 2 0 2 0 1 0 1
Output

0 0 0 0 1 1 2 2 2
Explanation

We have arr = [0 2 2 0 2 0 1 0 1]

Moving all the 0s in the beginning and all the 2s at the end.

The final segregated array is [0 0 0 0 1 1 2 2 2]

Example 2
Input

11
1 1 2 0 1 1 2 2 0 0 1
Output

0 0 0 1 1 1 1 1 2 2 2
Explanation

The sorted array is [0 0 0 1 1 1 1 1 2 2 2]

Constraints
1 <= n <= 10^6

0 <= arr[i] <= 2
 */
