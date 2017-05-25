import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // no. of arraylist( of arraylist)
        
         /* Save numbers in 2-D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt(); // how many are in one arraylist
            ArrayList<Integer> list = new ArrayList<>(); // inner arraylist
            for (int col = 0; col < d; col++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }
        
        //query part
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x-1); // get that list ( 1 row complete)
            //
           // System.out.println(list);
            // to get one element from 2D list -- (lists.get(row).get(col)) 
            //
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        
    }
}
