package ipa;
import java.util.*;
public class Ipa36 {
public static void main(String arg[]) {
	Scanner in=new Scanner(System.in);
	String a=in.nextLine();
	String k="";
	for(int i=0;i<a.length();i++) {
		if(!k.contains(a.substring(i,i+1))) {
			k=k+a.substring(i,i+1);
		}
	}
	System.out.println(k);
	int p[]=new int[0];
	for(int i=0;i<k.length();i++) {
		int count=0;
		for(int j=0;j<a.length();j++) {
			if(k.charAt(i)==a.charAt(j)) {
				count++;
			}
		}
		p=Arrays.copyOf(p, p.length+1);
		p[p.length-1]=count;
	}
	for(int i=0;i<k.length();i++) {
		System.out.println(k.charAt(i)+":"+p[i]);
	}
}
}
