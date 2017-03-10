/*
 * Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , print the number of words in  on a new line.
 */

import java.util.*;

public class camelcase {
	public static int findNumberOfWords(String str){
		char []arr = str.toCharArray();
		int cnt=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=65 && arr[i]<=90){
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(findNumberOfWords(s));
    }
}
