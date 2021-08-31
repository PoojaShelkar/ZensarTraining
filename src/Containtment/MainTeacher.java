package Containtment;

public class MainTeacher {
	

public static void main(String[] args)

{
	

HourlyBased hobj = new HourlyBased();
hobj.salary();

SalaryBased sobj = new SalaryBased(10000);
sobj.salary();

Teacher teacher = new SalaryBased();
teacher.salary();

}

}