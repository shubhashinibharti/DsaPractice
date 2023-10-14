package sorting.AsSortingProblem5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int[] arr = new int[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        int ans = sorting5(n, arr);
        System.out.println(ans);
    }

    static int sorting5(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int currEle = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currEle) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currEle;
        }
        System.out.println(Arrays.toString(arr));
        int proMn = arr[0] * arr[1];
        int proMx = arr[n - 1] * arr[n - 2];
        int sub = proMx - proMn;
        return sub;
    }
}

/*
AS Sorting Problem 5
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Note : You need to complete the given function. Input and output will be handled by the driver code.

Input Format
The first line contains integer N denoting the size of array nums

The second line contains N integers denoting the array elements

Output Format
Print the maximum product difference between the 2 pairs.

Example 1
Input

5
5 6 2 7 4
Output

34
Explanation

The chosen pairs of indices (0-indexed) are (1, 3) and (2, 4).

7 * 6 = 42 and 2 * 4 = 8. 42 - 8 = 34.

Example 2
Input

4
4 3 2 1
Output

10
Explanation

The chosen pairs of indices (0-indexed) are (0, 1) and (2, 3).

4 * 3 = 12 and 2 * 1 = 2. 12 - 2 = 10.

Constraints
4 <= N <= 10^5
1<= nums[i] <= 10^4

Topic Tags
Arrays
Companies
VMware
Oracle
 */
