package ipa;
import java.util.*;
public class Ipa39 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String lol=in.nextLine();
	String a[]=lol.split(" ");
	int count=0;
	String v[]=new String[0];
	for(int i=0;i<a.length;i++) {
		String b="";
	    for(int j=(a[i].length()-1);j>=0;j--) {
	    	b=b+a[i].charAt(j);
	    }
	     if(a[i].equals(b)) {
	      count++;
	      v=Arrays.copyOf(v, v.length+1);
	      v[v.length-1]=b;
		}
	}
	System.out.println(count);
	for(int i=0;i<v.length;i++) {
		System.out.println(v[i]);
	}		
	}
}
