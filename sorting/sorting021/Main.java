package sorting.sorting021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = Sorting021(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] Sorting021(int n, int[] arr) {
        int ct0 = 0, ct1 = 0, ct2 = 0;
        int res[] = new int[n];
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
        int ind = 1;
        while (ct0 > 0 && ind < n) {
            res[ind] = 0;
            ct0--;
            ind++;
        }
        while (ct2 > 0 && ind < n) {
            res[ind] = 2;
            ct2--;
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
0-2-1 Sorting
You are given an array arr of size n that only consists of 0s 1s and 2s. Sort the array in such a way that it has all the 0s first then all the 2s and lastly all the 1s .

Input Format:
line 1: contains an integer n denoting number of elements of array.

line 2: contains n separated integers denoting elements of array.

Output Format:
Return the array such that it has all the 0s first then all the 2s and lastly all the 1s.

Example 1
Input

7
2 0 1 0 2 1 1
Output

0 0 2 2 1 1 1
Explanation

The required array consist of all the 0s followed by 2s and 1s.

Example 2
Input

5
0 1 0 1 1
Output

0 0 1 1 1
Explanation

The required array consist of all the 0s followed 1s.

Constraints
0 <= n <= 10^6

0 <= arr[i] <= 2
 */
