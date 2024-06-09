package ipa;
import java.util.*;
public class Ipa9 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();in.nextLine();
	Emp2 ee[]=new Emp2[n];
	for(int i=0;i<n;i++) {
		String name=in.nextLine();
		int age=in.nextInt();in.nextLine();
		double salary=in.nextDouble();in.nextLine();
		ee[i]=new Emp2(name,age,salary);
	}
	double lol=calculateYearlySalary(ee);
	if(lol>0) {
		System.out.println(lol);
	}
	else {
		System.out.println("no");
	}
	double w=calculateTax(ee);
	System.out.println(w);
}
public static double calculateYearlySalary(Emp2 e[]) {
	for(int i=0;i<e.length;i++) {
		if(e[i].getSalary()>0) {
			return e[i].getSalary()*12;
		}
		
	}
	return 0;
}
public static double calculateTax(Emp2 e[]) {
	
	double yearlySalary = calculateYearlySalary(e);
    double tax = 0;
    if (yearlySalary > 0) {
        if (yearlySalary <= 50000) 
        {
            tax = yearlySalary * 0.10;
        } 
        else if (yearlySalary <= 100000 && yearlySalary>50000) 
        {
            tax = (50000 * 0.10) + ((yearlySalary - 50000) * 0.20);
        } 
        else 
        {
            tax = (50000 * 0.10) + (50000 * 0.20) + ((yearlySalary - 100000) * 0.30);
        }
    }
    return tax;
}
}
class Emp2{
	private String name;
	private int age;
	private double salary;
	public Emp2(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}