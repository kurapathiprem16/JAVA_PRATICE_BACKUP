package ipa;
import java.util.*;
public class Ipa55 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine().toLowerCase();
	String vc[]=a.split(" ");
	int count=0;
	for(int i=0;i<vc.length;i++) {
		if(vc[i].charAt(0)=='a' || vc[i].charAt(0)=='e' || vc[i].charAt(0)=='i' || vc[i].charAt(0)=='o' ||  vc[i].charAt(0)=='u') {
			count++;
		}
	}
	if(count>0) {
		System.out.println(count);
	}
	else {
		System.out.println("No String found");
	}
}
}
