package ipa;
import java.util.*;
public class Ipa47 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine();
	int v=0;
	String k="";
	for(int i=0;i<a.length();i++) {
		if(Character.isDigit(a.charAt(i))) {
			v=Integer.parseInt(a.substring(i,i+1));
			for(int j=0;j<v;j++) {
				k=k+a.charAt(i-1);
			}
		}
	}
	System.out.println(k);
}

}
