package ipa;
import java.util.*;
public class Ipa3 {
public static int findAvgOfQuizByAdmin(Course c[],String admin){
	int sum=0;
	int count=0;
	for(int i=0;i<c.length;i++) {
		if(c[i].getCourseAdmin().equalsIgnoreCase(admin)) {
			sum=sum+c[i].getQuiz();
			count++;
		}
	}
	
	if(count>0) {
		int avg=sum/count;
		return avg;
	}
	return 0;
}
public static Course[] sortCourseByHandsOn(Course c[],int hs){
	Course a[]=new Course[0];
	for(int i=0;i<c.length;i++){
		if(c[i].getHandson()<hs) {
			a=Arrays.copyOf(a, a.length+1);
			a[a.length-1]=c[i];
		}
	}
	if(a.length>0) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].getHandson()>a[j].getHandson()) {
					Course temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	return null;
}
public static void main(String arg[]) {
  Scanner in = new Scanner(System.in);
  int n=in.nextInt();in.nextLine();
  Course  co[]= new Course[n];
  for(int i=0;i<n;i++) {
	  int a=in.nextInt();in.nextLine();
	  String b=in.nextLine();
	  String c=in.nextLine();
	  int d=in.nextInt();in.nextLine();
	  int e=in.nextInt();in.nextLine();
	  co[i]=new Course(a,b,c,d,e);
  }
  String f=in.nextLine();
  int g=in.nextInt();in.nextLine();
  int v=findAvgOfQuizByAdmin(co,f);
  if(v==0) {
	  System.out.println("No Course found.");
  }
  else {
	  System.out.println(v);
  }
  Course l[]=sortCourseByHandsOn(co,g);
  if(l==null){
	  System.out.println("No Course found with mentioned attribute.");
  }
  else {
	  for(int i=0;i<l.length;i++) {
		  System.out.println(l[i].getCourseName());
	  }
  }
}
}
class Course{
	private int courseId;
	private String courseName;
	private String courseAdmin;
	private int quiz;
	private int handson;
	public Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
	    this.courseId=courseId;
	    this.courseName=courseName;
	    this.courseAdmin=courseAdmin;
	    this.quiz=quiz;
	    this.handson=handson;
		
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseAdmin() {
		return courseAdmin;
	}
	public void setCourseAdmin(String courseAdmin) {
		this.courseAdmin = courseAdmin;
	}
	public int getQuiz() {
		return quiz;
	}
	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}
	public int getHandson() {
		return handson;
	}
	public void setHandson(int handson) {
		this.handson = handson;
	}
	
}