package ipa;
import java.util.*;
public class Ipa48 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int v=in.nextInt();
	int k=single(v);
	System.out.println(k);
}
public static int single(int a) {
	int sum=0;
	while(a>0) {
		int temp=a%10;
		sum=sum+temp;
		a=a/10;
	}
	if(sum>9) {
		return single(sum);
	}
	return sum;
	
}
}
