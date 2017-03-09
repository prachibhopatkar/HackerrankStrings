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
