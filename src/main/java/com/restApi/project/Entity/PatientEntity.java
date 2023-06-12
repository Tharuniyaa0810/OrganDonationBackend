package com.restApi.project.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="patient")
public class PatientEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	@Column(name="PatientName")
	@JsonProperty("PatientName")
	 private String fullName;
	@Column(name="Address")
	@JsonProperty("Address")
     private String address;
	@JsonProperty("City")
	@Column(name="City")
     private String city;
	@Column(name="Pincode")
     private int pincode;
     @JsonProperty("Phone Number")
     @Column(name="PhoneNumber")
     private long ph;
     @JsonProperty("Email Id")
     @Column(name="Email")
     private String email;
     @Column(name="MedicalHistory")
     @JsonProperty("Medical History")
     private String medicalHistory;
     @Column(name="Age")
     private int Age;
     @Column(name="Gender")
     private String gender;
     @Column(name="bloodGroup")
     private String bloodGroup;
     @Column(name="reqOrgan")
     @JsonProperty("Required Organ")
     private String reqOrgan;
	
     public int getId() {
    	 return Id;
     }
     public void setId(int Id) {
    	 this.Id = Id;
     }
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getReqOrgan() {
		return reqOrgan;
	}
	public void setReqOrgan(String reqOrgan) {
		this.reqOrgan = reqOrgan;
	}
	@Override
	public String toString() {
		return "PatientModel [id=" + Id + ", fullName=" + fullName + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + ", ph=" + ph + ", email=" + email + ", medicalHistory=" + medicalHistory
				+ ", Age=" + Age + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", reqOrgan=" + reqOrgan + "]";
	}
	
	public PatientEntity(int Id, String fullName, String address, String city, int pincode, long ph, String email,
			String medicalHistory, int age, String gender, String bloodGroup, String reqOrgan) {
		super();
		this.Id = Id;
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.ph = ph;
		this.email = email;
		this.medicalHistory = medicalHistory;
		Age = age;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.reqOrgan = reqOrgan;
	}
	public PatientEntity() {
		
	}
	
}
