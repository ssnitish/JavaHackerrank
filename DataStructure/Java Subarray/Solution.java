//Print the number of subarrays of Array having negative sums.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no. of elements in array
        int[] arr = new int[n];
        for(int i=0 ; i < n; i++){
           arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i < n; i++){
            int sum = 0;
            for(int j=i; j < n; j++){
                sum = sum + arr[j];  // add value of contigous subarray
                if(sum < 0) // checking for negative sum
                    count++;
            }
        }
        System.out.println(count);
            
    }
}
