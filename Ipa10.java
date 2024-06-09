package ipa;
import java.util.*;
public class Ipa10 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int org=n;
	int a[]=new int[0];
	int count=0;
	int sum=0;
	while(n>0) {
		int temp=n%10;
		a=Arrays.copyOf(a, a.length+1);
		a[a.length-1]=temp;
		n=n/10;
		count++;
	}
	for(int i=0;i<a.length;i++) {
		int temp=(int)Math.pow(a[i], count);
		sum=sum+temp;
	}
	if(sum==org) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("no Armstrong number ");
	}
}
}
