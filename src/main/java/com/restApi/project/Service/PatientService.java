package com.restApi.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restApi.project.Entity.PatientEntity;
import com.restApi.project.Repository.PatientRepoInt;
@Service
public class PatientService implements PatientServiceInt {
	    @Autowired
	    private PatientRepoInt pri;
		@Override
		public void delDetail(int id)
		{
			pri.deleteById(id);
		}
		@Override
		public List<PatientEntity> getPatientDetails() {
			
			return pri.findAll();
		}
		@Override
		public void createPatientData(PatientEntity pe) {
			pri.save(pe);
			
		}
		@Override
		public void updatePatientData(PatientEntity pe) {
			pri.save(pe);
		}
	}

