// Stack -- Balanced parentheses 

import java.util.*;
class Solution{
   
   public static boolean isBalanced(String s){
       int length = s.length();
       if(length == 0 || s ==null )
           return true ;
       
       //can be done using ArrayDeque, ArrayDeque is "likely to be faster than Stack when used as a stack" - Java documentation
       //instead of using if, can be used HashMap where '(' is key and ')' is value
       
       Stack<Character> stack = new Stack<Character>();
       for(int i=0; i < length ; i++){
           if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
               stack.push(s.charAt(i));
           }
           else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
               if(stack.empty() || stack.peek()==s.charAt(i)){
                   return false;
               }
               else 
                   stack.pop();
           }
           
       }
       return stack.empty() ? true : false ; // lastly stack should be empty.
   } 
    
   public static void main(String []argh){
   
      Scanner sc = new Scanner(System.in);
       
      //reads the input line by line and calls method isBalanced
       
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
         // System.out.println(input); // reads the input
          boolean result = isBalanced(input);
          if(result)
              System.out.println("true");
          else
              System.out.println("false");
              
      }
      
   }
    
    
}
