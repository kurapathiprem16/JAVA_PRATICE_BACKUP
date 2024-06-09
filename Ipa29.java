package ipa;
import java.util.*;
public class Ipa29 {
public static void main(String arg[]) {
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();
	List<Integer> li = new ArrayList<>();
	for(int i=0;i<n;i++) {
		int temp=in.nextInt();
		li.add(temp);
	}
	Iterator<Integer> it = li.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	li.sort(null);
	System.out.println(li.get(0)+" "+li.get(li.size()-1));
}
}
