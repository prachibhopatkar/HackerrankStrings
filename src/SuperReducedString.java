/*
Steve has a string, , consisting of  lowercase English alphabetic letters.
In one operation, he can delete any pair of adjacent letters with same value. 
For example, string "aabcc" would become either "aab" or "bcc" after operation.

Steve wants to reduce  as much as possible.
To do this, he will repeat the above operation as many times as it can be performed. 
Help Steve out by finding and printing 's non-reducible form!

Note: If the final string is empty, print Empty String .
*/
import java.util.*;
public class SuperReducedString {
	public static Stack reduceString(String str){
		
		char[] arr = str.toCharArray();
		Stack <Character> stk = new Stack<Character>();
		for(int i=0;i<arr.length;i++){
			if(!stk.isEmpty()){
				if(arr[i] == stk.peek()){
					stk.pop();
					
				}
				else{
					stk.push(arr[i]);
				}
			}
			else{
				stk.push(arr[i]);
			}
		}
		
		return stk;
		
	}
	public static void main(String args[]){
		System.out.println("Enter input String");
		 Scanner scanner = new Scanner(System.in);
		 String str = scanner.nextLine();
		 Stack <Character> stack = reduceString(str);
		 if(stack.isEmpty()){
			 System.out.println("Empty String");
		 }
		 else{
			 StringBuilder builder = new StringBuilder();
			 while(!stack.isEmpty()){
				
				builder.append(stack.pop());
			 }
			 System.out.println(builder.reverse().toString());
		 }
		 
		 
	}
	

}
