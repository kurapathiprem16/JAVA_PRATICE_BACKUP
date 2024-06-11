package ipa;
import java.util.*;
public class Ipa57 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	Rectangle re[]= new Rectangle[n];
	for(int i=0;i<n;i++) {
		double a=in.nextDouble();
		double b=in.nextDouble();
		re[i]=new Rectangle(a,b);
	}
	double k[]=calculateArea(re);
	double v[]=caluatePer(re);
	for(int i=0;i<k.length;i++) {
		System.out.println(k[i]);
		System.out.println(v[i]);
	}
	
}
public static double[] calculateArea(Rectangle a[]) {
	double cc[]=new double[a.length];
	for(int i=0;i<a.length;i++) {
		cc[i]=a[i].getBreadth()*a[i].getLength();
	}
	return cc;
}
public static double[] caluatePer(Rectangle b[]) {
	double a[]=new double[b.length];
	for(int i=0;i<a.length;i++) {
		a[i]=(b[i].getBreadth()+b[i].getLength())*2;
	}
	return a;
	
}
}
class Rectangle {
	private double length;
	private  double breadth;
	public Rectangle(double length,double breadth) {
		this.breadth=breadth;
		this.length=length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
}