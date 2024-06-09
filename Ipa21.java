package ipa;
import java.util.*;
public class Ipa21 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String lol=in.nextLine().toLowerCase();
	String a[]=lol.split(" ");
	int count=0;
	for(int i=0;i<a.length;i++){
		if(a[i].startsWith("a") || a[i].startsWith("e") ||  a[i].startsWith("i") || a[i].startsWith("o") || a[i].startsWith("u") ) {
			count++;
		}
	}
	if(count>0) {
		System.out.println(count);
	}
	else {
		System.out.println("no");
	}
	
}
}
