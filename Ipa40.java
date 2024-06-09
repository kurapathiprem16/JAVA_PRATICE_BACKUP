package ipa;
import java.util.*;
public class Ipa40 {
public static void main(String arg[]) {
Scanner in = new Scanner(System.in);
int sum=0;
int n=in.nextInt();
for(int i=1;i<n;i++) {
	if(n%i==0) {
		sum=sum+i;
	}	
}
if(sum==n) {
  System.out.println("perfect number");	
}
else {
  System.out.println("NA");	
}
	
}
}


