package com.restApi.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restApi.project.Entity.PatientEntity;
@Repository	
public interface PatientRepoInt extends JpaRepository<PatientEntity, Integer> {

}
