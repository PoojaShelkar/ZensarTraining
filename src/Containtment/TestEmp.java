package Containtment;

import java.util.Scanner;

public class TestEmp {
	
	public static void main(String[] args) {
		int a=30;
		System.out.println(a);
		Emp e1=new Emp(1, ,"pooja",20000,null);
		System.out.println(e1);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter emp id,emp name,sal");
		int id=sc.nextInt();
		String nm=sc.next();
		int sal=sc.nextInt();
		
		
		
		Emp e1=new Emp();
		e1.setEid(id);
		e1.setName(nm);
		e1.setSalary(sal);
		
		Emp e2=new Emp(1,"om",90000,null);
		
		e2.setName(name);
		
		System.out.println("enter ur deptid and dname");
		int did=sc.nextInt();
		String dnm=sc.next();
		Department d1=new Department(did,dnm);
		
		e1.setDept(d1);
		
		String ename=e1.getName();
		System.out.println(ename);
		System.out.println(e1.getSalary());
		Department dd=e1.getDept();
		System.out.println(dd.getDeptid());
		
		System.out.println(e1.getDept().getDeptid());
		System.out.println(e1.getDept().getDeptname());
		
		d1.setDeptid(did);
		
	}
}