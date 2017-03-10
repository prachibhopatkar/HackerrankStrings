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
