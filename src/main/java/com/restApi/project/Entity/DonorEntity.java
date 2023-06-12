package com.restApi.project.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="donor")
public class DonorEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@JsonProperty("DonorName")
	 private String fullName;
	@JsonProperty("Address")
    private String address;
	@JsonProperty("City")
    private String city;
	@JsonProperty("Pincode")
    private int pincode;
    @JsonProperty("PhoneNumber")
    private String ph;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("MedicalHistory")
    private String medicalHistory;
    @JsonProperty("Age")
    private int Age;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("DateOfBirth")
    private String DateOfBirth;
    @JsonProperty("BloodGroup")
    private String bloodGrp;
    @JsonProperty("DonatingOrgan")
    private String donOrgan;
    @JsonProperty("Relation")
    private String relation;
    @JsonProperty("RelationPhoneNumber")
    private String familyPh;

	public DonorEntity(int id, String fullName, String address, String city, int pincode, String ph, String email,
			String medicalHistory, int age, String gender, String relation, String familyPh, String bloodGrp,
			String donOrgan, String dateOfBirth) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.ph = ph;
		this.email = email;
		this.medicalHistory = medicalHistory;
		Age = age;
		this.gender = gender;
		this.relation = relation;
		this.familyPh = familyPh;
		this.bloodGrp = bloodGrp;
		this.donOrgan = donOrgan;
		DateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "DonorEntity [id=" + id + ", fullName=" + fullName + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + ", ph=" + ph + ", email=" + email + ", medicalHistory=" + medicalHistory
				+ ", Age=" + Age + ", gender=" + gender + ", relation=" + relation + ", familyPh=" + familyPh
				+ ", bloodGrp=" + bloodGrp + ", donOrgan=" + donOrgan + ", DateOfBirth=" + DateOfBirth + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
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

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getFamilyPh() {
		return familyPh;
	}

	public void setFamilyPh(String familyPh) {
		this.familyPh = familyPh;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public String getDonOrgan() {
		return donOrgan;
	}

	public void setDonOrgan(String donOrgan) {
		this.donOrgan = donOrgan;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public DonorEntity() {
		
	}
   
}