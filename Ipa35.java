package ipa;
import java.util.*;
public class Ipa35 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=in.nextInt();
	}
	 int num;
     for (int i = 0; i < a.length-1; i++) {
         num = a[i];
         while(num+1 != a[i+1])
         {
             System.out.print(num+1+" ");
             num++;
         }
     }
}
}
