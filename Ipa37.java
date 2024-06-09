package ipa;
import java.util.*;
public class Ipa37 {
public static void main(String arg[]) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	if(n%2!=0) {
		int a[]=new int[0];
		while(n>0) {
			int temp=n%10;
			a=Arrays.copyOf(a, a.length+1);
			a[a.length-1]=temp;
			n=n/10;
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum*10+a[i];
		}
		System.out.println(sum);
	}
	else {
		System.out.println("no");
	}
	
	
}
}
