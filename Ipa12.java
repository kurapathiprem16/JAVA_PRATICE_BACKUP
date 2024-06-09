package ipa;
import java.util.*;
public class Ipa12 {
public static void main(String arg[]) {	
	Scanner in =new Scanner(System.in);
	String a=in.nextLine();
	String dup="";
	for(int i=0;i<a.length()-1;i++) {
		if(!dup.contains(a.substring(i,i+1))) {
			dup=dup+a.substring(i,i+1);
		}
	}
	int lo[]=new int[dup.length()];
	
	for(int i=0;i<dup.length();i++) {
		int count=0;
		for(int j=0;j<a.length();j++) {
			 if(dup.charAt(i)==a.charAt(j)) {
				 count++;
			 }
		}
		lo[i]=count;
	}
	String lk="";
	for(int i=0;i<dup.length();i++) {
		lk=lk+dup.substring(i,i+1)+Integer.toString(lo[i]);
	}
	System.out.println(lk);
}
	
	

}
