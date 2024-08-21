package com.Rest.RestCrud.Employee;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String password;
	private String name;
	private String designation;
	private String department;
	private Boolean isChecked;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	@Basic(fetch = FetchType.LAZY)
	private byte[] profilePic;

//	@OneToMany(cascade = CascadeType.ALL)
//    private List<Address> address = new ArrayList<>();

	public byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}

	public String getEmail() {
		return email;
	}

	public Boolean getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(Boolean isChecked) {
		this.isChecked = isChecked;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@JsonManagedReference
//	@OneToOne(cascade = CascadeType.ALL)
//	private Address address;
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

//	public List<Address> getAddress() {
//		return address;
//	}
//
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}

}
