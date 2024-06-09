package ipa;
import java.util.*;
public class Ipa54 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();in.nextLine();
	HeadSets hs[]=new HeadSets[n];
	for(int i=0;i<n;i++) {
		 String a=in.nextLine();
		 String b=in.nextLine();
		 int c=in.nextInt();in.nextLine();
		 boolean d=in.nextBoolean();in.nextLine();
		 hs[i]=new HeadSets(a,b,c,d);
	}
	String l1=in.nextLine();
	int av=findTotalPriceForGivenBrand(hs,l1);
	if(av==0) {
		System.out.println("NO Headsets available with the given brand");
	}
	else {
		System.out.println(av);
	}
	HeadSets kk=findAvailableHeadsetWithSecondMinPrice(hs);
	if(kk==null) {
		System.out.println("No HeadSets Available");
	}
	else {
		System.out.println(kk.getHeadsetName()+" "+kk.getPrice());
	}
	
}
public static int findTotalPriceForGivenBrand(HeadSets ll[],String a){
	int sum=0;
	for(int i=0;i<ll.length;i++) {
		if(a.equals(ll[i].getBrand())) {
			sum=sum+ll[i].getPrice();
		}
	}
	if(sum>0) {
		return sum;
	}
	return 0;
}
public  static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets aa[]) {
	if(aa.length<=1) {
		return aa[0];
	}
	if(aa.length>1) {
		Arrays.sort(aa,(A,B)->A.getPrice()-B.getPrice());
		return aa[1];
	}
	return null;
}
}
class HeadSets {
	private String headsetName;
	private String brand;
	private int price;
	private boolean available;
	public HeadSets(String headsetName,String brand,int price,boolean available) {
		this.headsetName=headsetName;
		this.brand=brand;
		this.price=price;
		this.available=available;
	}
	public String getHeadsetName() {
		return headsetName;
	}
	public void setHeadsetName(String headsetName) {
		this.headsetName = headsetName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}