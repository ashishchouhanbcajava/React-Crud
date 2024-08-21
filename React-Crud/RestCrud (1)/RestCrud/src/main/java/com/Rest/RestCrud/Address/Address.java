//package com.Rest.RestCrud.Address;
//
//import com.Rest.RestCrud.Employee.Employee;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
//@Entity
//public class Address {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	private String country;
//	private String state;
//	private String district;
//	private String village;
//
////	@ManyToOne
////	private Employee employee;
////
////	public Employee getEmployee() {
////		return employee;
////	}
////
////	public void setEmployee(Employee employee) {
////		this.employee = employee;
////	}
//
////	@OneToOne
////	@JsonBackReference
////	private Employee employee;
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getDistrict() {
//		return district;
//	}
//
//	public void setDistrict(String district) {
//		this.district = district;
//	}
//
//	public String getVillage() {
//		return village;
//	}
//
//	public void setVillage(String village) {
//		this.village = village;
//	}
//
//	@Override
//	public String toString() {
//		return "Address [id=" + id + ", country=" + country + ", state=" + state + ", district=" + district
//				+ ", village=" + village + ", employee=" + employee + "]";
//	}
//
//}
