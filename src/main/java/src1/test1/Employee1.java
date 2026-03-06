package src1.test1;

import java.util.List;

public class Employee1 {
	
	Integer empId;
	String empName;
	String Dept;
	Double salary;
	String gender;
	List<Address> addressList;
	
	public Employee1(Integer empId, String empName, String dept, Double salary, String gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		Dept = dept;
		this.salary = salary;
		this.gender = gender;
	}
	public Employee1(String empName, String dept, Double salary) {
		this.empName = empName;
		this.Dept = dept;
		this.salary = salary;
	}
	
	public Employee1(Integer empId, String empName, String dept, Double salary, String gender,
			List<Address> addressList) {
		super();
		this.empId = empId;
		this.empName = empName;
		Dept = dept;
		this.salary = salary;
		this.gender = gender;
		this.addressList = addressList;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Dept=" + Dept + ", salary=" + salary
				+ ", gender=" + gender + "]";
	}
	
}
