package com.restApi.project.Service;

import java.util.List;

import com.restApi.project.Entity.DonorEntity;

public interface DonorServiceInt {
	public List<DonorEntity> getDonorDetails() ;
	 DonorEntity getDonorById(int id);
	 public void createDonorDetails(DonorEntity de);
 public void updateDonorDetails(DonorEntity de);
 public void deleteDonorDetails(int id);
}
