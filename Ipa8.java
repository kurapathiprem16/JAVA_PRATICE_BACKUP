package ipa;
import java.util.*;
public class Ipa8 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	Resort re[]=new Resort[n];
	for(int i=0;i<n;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		double d=in.nextDouble();in.nextLine();
		double e=in.nextDouble();in.nextLine();
		re[i]=new Resort(a,b,c,d,e);
		
	}
	String lol=in.nextLine();
	double avg=findAvgPrice(re,lol);
	if(avg==0) {
		System.out.println("No such Resort found");
	}
	else {
		int lk=(int)avg;
		System.out.println(lk);
	}
}
public static double findAvgPrice(Resort r[],String a) {
	double sum=0;
	int n=0;
	for(int i=0;i<r.length;i++) {
		if(r[i].getCategory().equalsIgnoreCase(a) && r[i].getResortRating()>4) {
			sum=sum+r[i].getResortPrice();
			n++;
		}
		
	}
	double avg=sum/n;
	if(sum>0) {
		return avg;
		
	}
	return 0;
}
}
class Resort{
	private int resortId;
	private String resortName;
	private String Category;
	private double resortPrice;
	private double resortRating;
	public Resort(int resortId,String resortName,String Category,double resortPrice,double resortRating) {
		this.resortId=resortId;
		this.resortName=resortName;
		this.Category=Category;
		this.resortPrice=resortPrice;
		this.resortRating=resortRating;
		
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
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getResortPrice() {
		return resortPrice;
	}
	public void setResortPrice(double resortPrice) {
		this.resortPrice = resortPrice;
	}
	public double getResortRating() {
		return resortRating;
	}
	public void setResortRating(double resortRating) {
		this.resortRating = resortRating;
	}
	
}
