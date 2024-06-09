package ipa;
import java.util.*;
public class Ipa38 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine();
    String p="";
    for(int i=a.length()-1;i>=0;i--) {
    	p=p+a.charAt(i);
    }
    if(p.equals(a)) {
    	System.out.println("palindrome");
    }
    else {
    	System.out.println("no");
    }
}

}
