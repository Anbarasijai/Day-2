package org.emp;

public class Employee {

	private void empID() {
		// TODO Auto-generated method stub

		System.out.println("Employee Id: 101");
	}
	private void empName() {
		// TODO Auto-generated method stub

		System.out.println("Employee Name: Anbarasi");
	}
	private void empDOB() {
		// TODO Auto-generated method stub

		System.out.println("Employee DOB:19-11-91");
	}
	private void empPhone() {
		// TODO Auto-generated method stub

		System.out.println("Employee Phone: 8056947637");
	}
	private void empEmail() {
		// TODO Auto-generated method stub

		System.out.println("Employee Email: Anbarasijai@gmail.com");
	}
	private void empAddress() {
		// TODO Auto-generated method stub

		System.out.println("Employee Address: Pondicherry");
	}
	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.empID();
		e.empName();
		e.empDOB();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}

