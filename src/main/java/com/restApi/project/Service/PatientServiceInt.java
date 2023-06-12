package com.restApi.project.Service;

import java.util.List;

import com.restApi.project.Entity.PatientEntity;

public interface PatientServiceInt {
	public List<PatientEntity> getPatientDetails();
	   public void createPatientData(PatientEntity pe);
	   public void updatePatientData(PatientEntity pe);
	   
 public void delDetail(int id);
}
