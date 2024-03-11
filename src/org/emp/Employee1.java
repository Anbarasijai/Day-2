package org.emp;

public class Employee1 {

	private void empdet(int id) {
		// TODO Auto-generated method stub
System.out.println("Employee ID is "+id);
	}
	private void empdet(String name) {
		// TODO Auto-generated method stub
System.out.println("Employee Name is " +name);
	}
private void empdet(long phone) {
	// TODO Auto-generated method stub
System.out.println("Employee Name is " +phone);
	}
	public static void main(String[] args) {
		Employee1 s=new Employee1();
		s.empdet(101);
		s.empdet("Anbu");
		s.empdet(1234567898);
	}
}

