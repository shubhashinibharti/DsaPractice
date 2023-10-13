package sorting.sorting01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = Sorting01(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] Sorting01(int n, int[] arr) {
        int[] res = new int[n];
        int ct0 = 0, ct1 = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ct0++;
            }
            if (arr[i] == 1) {
                ct1++;
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
        return res;
    }
}
/*
0-1 Sorting
You are given an array arr of length n containing only 0's and 1's. Your task is to segregate all the 0's to the left of the array and all the 1's to the right of the array.

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers(0 or 1) denoting the elements of the array.

Output Format
Print n space seperated integers denoting the segregated array.

Example 1
Input

15
0 0 0 1 1 1 1 0 1 1 0 0 1 0 1
Output

0 0 0 0 0 0 0 1 1 1 1 1 1 1 1
Explanation

We have arr = [0 0 0 1 1 1 1 0 1 1 0 0 1 0 1]

Moving all the 0's in the beginning and all the 1's at the end.

The final segregated array is [0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]

Example 2
Input

6
1 0 1 0 1 1
Output

0 0 1 1 1 1
Explanation

The sorted array is [0 0 1 1 1 1]

Constraints
1 <= n <= 10^6

0 <= arr[i] <= 1
 */