// HashMap is used, to implements phone directory

import java.util.*;
import java.io.*;
class Solution {
    public static void main(String [] args) throws Exception {
        
        /* Read input and save as entries in a HashMap */
        
        //BufferedReader is used instead of Scanner since it's faster  and throws Exception is must when using this
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String name = br.readLine();
            int phone   = Integer.valueOf(br.readLine());
            map.put(name, phone);
        }
        
        /*  to print map (key value ) using for loop
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + " " +  m.getValue());
        }*/
        
        
        
        /* Read each query and check if its in our HashMap */
        String s;
        while((s = br.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
   

        br.close();
    }
}
