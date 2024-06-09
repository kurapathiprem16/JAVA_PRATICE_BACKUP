/*package ipa;
import java.util.*;
public class Ipa1 {
public static Employee[] getEmployeeWithSecondLowestSalary(Employee e[]){
    Employee[] det = new Employee[0];
    if(e.length>1)
    {
        for(int i=0; i<e.length; i++)
        {
            for(int j=i; j<e.length; j++)
            {
                if(e[i].getSalary()>e[j].getSalary())
                {
                    Employee k = e[i];
                    e[i] = e[j];
                    e[j] = k;
                }
            }
        }
        Employee min = e[0];
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getSalary()>e[0].getSalary())
            {
                det = Arrays.copyOf(det, det.length+1);
                det[det.length-1] = e[i];
                break;
            }
        }
        for(int i=0; i<e.length; i++)
        {
            if(det[0].getSalary() == e[i].getSalary() && e[i].getEmpid()!=det[0].getEmpid())
            {
                det = Arrays.copyOf(det, det.length+1);
                det[det.length-1] = e[i];
            }
        }
        return det;
    }        
    return null;   
		
	}
	

public static int countEmployeesBasedOnAge(Employee[] employees, int age) {
    int count = 0;
    for (Employee employee : employees) {
        if (employee.getAge() == age) {
            count++;
        }
    }
    return count;
}
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	Employee emp[]=new Employee[n];
	for(int i=0;i<n;i++) {
		int empid=in.nextInt();
		String empname=in.next();
		int age=in.nextInt();
		char gender=in.next().charAt(0);
		double salary=in.nextInt();
		 emp[i]= new Employee(empid,empname,age,gender,salary); 
		
	}
	int countage=in.nextInt();
	Employee ans1[] =  getEmployeeWithSecondLowestSalary(emp);
	 if (ans1 != null) {
		 for(int i=0; i<ans1.length; i++)
         {
             System.out.println(ans1[i].getEmpid()+"#"+ans1[i].getEmpname());
         }
     } else {
         System.out.println("Null");
     }
	int count=countEmployeesBasedOnAge(emp,countage);
	 if (count > 0) {
         System.out.println(count);
     } else {
         System.out.println("No employee found for the given age");
     }
}

}

//class Employee{
	private  int empid;
	private String empname;
	private int age;
	private char gender;
	private double salary;
	public Employee(int empid,String empname,int age,char gender,double salary) {
		this.empid=empid;
		this.empname=empname;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
*/
