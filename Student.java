public class Student {

public int id;
public String name;
public String degree;
public String department;
public String college;

public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public String getDegree()
{
	return degree;
}
public String getDepartment()
{
	return department;
}
public String getCollege()
{
	return college;
}
public void setId(int id)
{
	this.id=id;
}
public void setName(String name)
{
	this.name=name;
}
public void setDegree(String degree)
{
	this.degree=degree;
}
public void setDepartment(String department)
{
	this.department=department;
}	
public void setCollege(String college)
{
	this.college=college;
}
}
class EngineeringStudent extends Student
{
	public void displayStudentInfo()
	{
		System.out.println("Student Identity"+getId());
		System.out.println("Student Name"+getName());
		System.out.println("Student Degree"+getDegree());
		System.out.println("Student Department"+getDepartment());
		System.out.println("Student College"+getCollege());
		System.out.println('\n');
	}
}
class ArtsAndScienceStudent extends Student
{
	public void displayStudentInfo()
	{
		System.out.println("Student Identity"+getId());
		System.out.println("Student Name"+getName());
		System.out.println("Student Degree"+getDegree());
		System.out.println("Student Department"+getDepartment());
		System.out.println("Student College"+getCollege());
		
	}
}
class App 
{
	public static void main(String[] args)
	{   
		EngineeringStudent es=new EngineeringStudent();
		ArtsAndScienceStudent ass=new ArtsAndScienceStudent();
		es.setId(102);
		es.setName("Bhanu Sree");
		es.setDegree("BE");
		es.setDepartment("CSE");
		es.setCollege("GRT");
		ass.setId(1103);
		ass.setName("Rajeshwari");
		ass.setDegree("Bsc");
		ass.setDepartment("Maths");
		ass.setCollege("SUBRAMANIAN COLLEGE");
		es.displayStudentInfo();
	    ass.displayStudentInfo();
	}
}
