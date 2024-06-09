package ipa;
import java.util.*;
public class Ipa14 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine();
	String b[]=a.split(" ");
	int count=0;
	for(int i=0;i<b.length;i++) {
		if(b[i].length()>2) {	
		for(int j=0;j<b[i].length()-1;j++) {
			if((b[i].charAt(j)=='a' || b[i].charAt(j)=='e' || b[i].charAt(j)=='i' || b[i].charAt(j)=='o' || b[i].charAt(j)=='u') && (b[i].charAt(j+1)=='a' || b[i].charAt(j+1)=='e' || b[i].charAt(j+1)=='i' || b[i].charAt(j+1)=='o' || b[i].charAt(j+1)=='u')) {
				 count++;
				 break;
			}
			
		}
	}
	}
	
         System.out.println(count);	
}
}
