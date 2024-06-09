package ipa;
import java.util.*;
public class Ipa22 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int sum=0;
	int first=0;
	int second=1;
	System.out.println(first);
	System.out.println(second);

	while(sum<n) {
		sum=first+second;
		
		first=second;
		second=sum;
		if(sum>n) {
			break;
		}
		System.out.println(sum);
	}
	
}
}
