package ipa;
import java.util.*;
public class Ipa46 {
public static void main(String arg[]) {
	Scanner in=new Scanner(System.in);
	String a=in.nextLine();
	String dup="";
	for(int i=0;i<a.length();i++) {
		if(!dup.contains(a.substring(i,i+1))){
			dup=dup+a.substring(i,i+1);
		}
	}
	System.out.println(dup);
	int c[]=new int[0];
	for(int i=0;i<dup.length();i++) {
		int count=0;
		for(int j=0;j<a.length();j++) {
			if(dup.charAt(i)==a.charAt(j)) {
				count++;
			}
			
		}
		c=Arrays.copyOf(c,c.length+1);
		c[c.length-1]=count;
	}
	String v="";
	for(int i=0;i<dup.length();i++){
		v=v+dup.charAt(i)+Integer.toString(c[i]);
	}
	System.out.println(v);
	
	
}
}
