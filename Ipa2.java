package ipa;
import java.util.*;
public class Ipa2 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String cpname=in.nextLine();
	int n=in.nextInt();
	Employee emp[]=new Employee[n];
	for(int i=0;i<n;i++) {
		int id=in.nextInt();in.nextLine();
		String name=in.nextLine();
		String  designation =in.nextLine();
		double Salary=in.nextDouble();in.nextLine();
		emp[i]=new Employee(id,name,designation,Salary);
	}
	Company com = new Company(cpname,emp,n);
    
    System.out.println("Average Salary : "+com.getAverageSalary(emp));
    System.out.println("Max Salary : "+com.getMaxSalary(emp));

    System.out.print("Enployee with Designation: ");
    String desi = in.nextLine();
    Employee[] ans = com.getEmployeesByDesignation(desi,emp);
    if(ans!=null)
    {
        for (int i = 0; i < ans.length; i++) {
            System.out.println("ID: "+ans[i].getId()+", Name: "+ans[i].getName()+", Designation: "+ans[i].getDesignation()+", Salary: "+ans[i].getSalary());
        }
    }
}
}
class Employee{
	private int id;
	private String name;
	private String designation;
	private double salary;
	public Employee(int id,String name,String designation,double salary) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
class Company{
	private String companyname;
	private Employee emp[];
	private int numEmployees;
	public Company(String companyname,Employee emp[],int numEmployees) {
		this.companyname=companyname;
		this.emp=emp;
		this.numEmployees=numEmployees;
	}
	public double getAverageSalary(Employee e[]) {
		double sum=0;
		for(int i=0;i<e.length;i++) {
			sum=sum+e[i].getSalary();
		}
		double avg=sum/e.length;
		return avg;
	}
	public double getMaxSalary(Employee e[]){
		for(int i=0;i<e.length;i++) {
			for(int j=i+1;j<e.length;j++) {
				if(e[i].getSalary()<e[j].getSalary()) {
				 Employee temp=e[i];
				  e[i]=e[j];
				  e[j]=temp;
			}
			}		
		}
		return e[0].getSalary();
	}
    public Employee[] getEmployeesByDesignation(String designation,Employee e[]) { 
    	Employee emp[] = new Employee[0];
    	for(int i=0;i<e.length;i++) {
    		if(e[i].getDesignation().equalsIgnoreCase(designation)) {
    			emp=Arrays.copyOf(emp,emp.length+1);
    			emp[emp.length-1]=e[i];
    		}
    	}
    	return emp;
    }
	
}