package ipa;
import java.util.*;
public class Ipa16 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int a[] = new int[0];
	int k=0;
	int count=0;
	while(n>0) {
		int temp=n%10;
		if(temp!=1 && temp!=0) {
			a=Arrays.copyOf(a, a.length+1);
			a[a.length-1]=temp;
		}
		
		n=n/10;
		k++;
	}
	
	for(int i=0;i<a.length;i++) {
		int temp=a[i];
		boolean kk=true;
		
		for(int j=2;j<=temp/2;j++) {
			
			if(temp%j==0) {
				kk=false;
				break;
			}
			
		}
		if(kk) {
			count++;
		}
		
			
		
	}
	System.out.println(count);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
