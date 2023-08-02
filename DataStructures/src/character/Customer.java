package character;

import java.time.LocalDate;

public class Customer {

	
	private String customerName;
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", phno="
				+ phno + "]";
	}
	
	public Customer(String customerName, Integer age, LocalDate dateOfBirth, Long phno) {
		super();
		this.customerName = customerName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.phno = phno;
	}

	private Integer age;
	private LocalDate dateOfBirth;
	private Long phno;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
}
