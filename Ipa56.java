package ipa;
import java.util.*;
public class Ipa56 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();in.nextLine();
	Reso Re[]=new Reso[n];
	for(int i=0;i<n;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine().toLowerCase();
		double d=in.nextDouble();in.nextLine();
		double e=in.nextDouble();in.nextLine();
		Re[i]=new Reso(a,b,c,d,e);
	}
	String l1=in.nextLine();
	int ass=findAvgPriceByCategory(Re,l1);
	if(ass==0) {
		System.out.println("There are no such available resort");
	}
	else {
		System.out.println("Average price of the 3 star Resort:"+ass);
	}
	
}
public static int findAvgPriceByCategory(Reso a[],String aa) {
	double sum=0;
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i].getCategory().equalsIgnoreCase(aa)) {
			sum=sum+a[i].getPrice();
			count++;
		}
	}
	double avg=sum/count;
	if(avg>0) {
		int m=(int)avg;
		return m;
	}
	return 0;
}
}
class Reso {
	private int resortId;
	private String resortName;
	private String category;
	private double price;
	private double rating;
	public Reso(int resortId,String resortName,String category,double price,double rating) {
		this.resortId=resortId;
		this.resortName=resortName;
		this.category=category;
		this.price=price;
		this.rating=rating;
	}
	public int getResortId() {
		return resortId;
	}
	public void setResortId(int resortId) {
		this.resortId = resortId;
	}
	public String getResortName() {
		return resortName;
	}
	public void setResortName(String resortName) {
		this.resortName = resortName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}