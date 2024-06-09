package ipa;
import java.util.*;
public class Ipa30 {
public static void main(String arg[]) {
   Scanner in = new Scanner(System.in);
   String l=in.nextLine();
   String a="";
   String k[]=l.split(" ");
   for(int i=0;i<k.length;i++) {
	   if(k[i].length()>a.length()) {
		   a=k[i];
	   }
   }
   System.out.println(a);
}
}
