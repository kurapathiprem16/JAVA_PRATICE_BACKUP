package ipa;
import java.util.*;
public class Ipa32 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int nn=in.nextInt();
	int n=(nn/2);
	int a[]= new int[nn];
	for(int i=0;i<nn;i++) {
		a[i]=in.nextInt();
	}
    Arrays.sort(a);
    String ll="";
    for(int i=0;i<a.length;i++) {
    	ll=ll+Integer.toString(a[i]);
    }
    String p="";
    for(int i=0;i<ll.length();i++) {
    	if(!p.contains(ll.substring(i,i+1))){
    		p=p+ll.charAt(i);
    	}
    }
    System.out.println(ll);
    System.out.println(p);
    for(int i=0;i<p.length();i++) {
    	int count=0;
    	for(int j=0;j<ll.length();j++) {
    		if(p.charAt(i)==ll.charAt(j)) {
    			count++;
    		}
    		
    	}
    	System.out.println(count);
    	if(count>n) {
    		System.out.println(Integer.parseInt(p.substring(i,i+1)));
    	}
    }
	
}
}
