import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of element in list
        
        // LinkedList over ArrayLst because, many insert and delete operation and it is fast in LinkedList
        /* Create and fill Linked List of Integers */
        List<Integer> list = new LinkedList<Integer>(); // this also ok- List<Integer> list = new LinkedList<>();
        for(int i=0; i < n; i++){
            list.add(sc.nextInt());
        }
        //System.out.print(list); // list intialised 
        int q = sc.nextInt(); // no. of queries
        /*  queries on linked list */
        for(int i=0; i < q; i++){
            String s = sc.next();
            if(s.equals("Insert")){
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index,value);
            }
            else{ // only two option, Delete
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        
        /* print list */  
        // for-each loop
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        
        
        // or by Iterator interface
        /*
         Iterator it = list.iterator();
         while(it.hasNext()){
            Integer ir = (Integer)it.next();
            System.out.print(ir+" ");
         }
         */
        
        
    }
}
