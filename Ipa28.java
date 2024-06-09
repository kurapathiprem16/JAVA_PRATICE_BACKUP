package ipa;
import java.util.*;
public class Ipa28 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int s1=in.nextInt();
	int s2=in.nextInt();
	int set1[]=new int[s1];
	int set2[]=new int[s2];
	for(int i=0;i<s1;i++) {
		set1[i]=in.nextInt();
	}
	for(int i=0;i<s2;i++) {
		set2[i]=in.nextInt();
	}
	int inter[]=new int[0];
	for(int i=0;i<s1;i++) {
		for(int j=0;j<s2;j++) {
			if(set1[i]==set2[j]) {
				inter=Arrays.copyOf(inter,inter.length+1);
				inter[inter.length-1]=set1[i];
			}
		}
	}
	for(int i=0;i<inter.length;i++) {
		System.out.println(inter[i]);
	}
}
}
