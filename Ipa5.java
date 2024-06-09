package ipa;
import java.util.*;
public class Ipa5 {
	public static int findCountOfDayscholarStudents(Student s[]){
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].getScore()>80 && s[i].isDayScholar()) {
				count++;
			}
		}
		if(count>0) {
			return count;
		}
		return 0;
	}
	public static Student findStudentwithSecondHighestScore(Student s[]){
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
			  if(s[i].getScore()>s[j].getScore()) {
				  Student kk=s[i];
					s[i]=s[j];
					s[j]=kk;
			  }
				
			}
		 }
		Student det[]=new Student[0];
		for(int i=0;i<s.length;i++) {
			if(!s[i].isDayScholar()) {
			det=Arrays.copyOf(det, det.length+1);
			det[det.length-1]=s[i];
			}	
		}
		if(det.length>0) {
			return det[0];
		}
		return null;
		
	}
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	Student ss[]=new Student[n];
	for(int i=0;i<n;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		double d=in.nextInt();
		boolean e=in.nextBoolean();
		ss[i]=new Student(a,b,c,d,e);
	}
	int ans1=findCountOfDayscholarStudents(ss);
	if(ans1!=0) {
		System.out.println(ans1);
	}
	else {
		System.out.println( "There are no such dayscholar students");
	}
	Student kl=findStudentwithSecondHighestScore(ss);
	if(kl==null) {
		System.out.println("There are no student from non day scholar");
	}
	else {
		System.out.println(kl.getRollno()+"#"+kl.getName()+"#"+kl.getScore());
	}
	
}
}
class Student{
	private int rollno;
	private String name;
	private String branch;
	private double score;
	private boolean dayScholar;
	public Student(int rollno,String name,String branch,double score,boolean dayScholar)
	{
	     this.rollno=rollno;
	     this.name=name;
	     this.branch=branch;
	     this.score=score;
	     this.dayScholar=dayScholar;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public boolean isDayScholar() {
		return dayScholar;
	}
	public void setDayScholar(boolean dayScholar) {
		this.dayScholar = dayScholar;
	}
	
}