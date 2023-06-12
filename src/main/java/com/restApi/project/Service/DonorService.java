package com.restApi.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restApi.project.Entity.DonorEntity;
import com.restApi.project.Repository.DonorRepoInt;
@Service
public class DonorService implements DonorServiceInt {
	@Autowired
	private DonorRepoInt dri;

	  public void updateDonorDetails(DonorEntity donor) {
	    Optional<DonorEntity> optionalDonor = dri.findById(donor.getId());
	    if (optionalDonor.isPresent()) {
	      DonorEntity existingDonor = optionalDonor.get();
	      existingDonor.setFullName(donor.getFullName());
	      existingDonor.setAddress(donor.getAddress());
	      existingDonor.setCity(donor.getCity());
	      existingDonor.setPincode(donor.getPincode());
	      existingDonor.setPh(donor.getPh());
	      existingDonor.setEmail(donor.getEmail());
	      existingDonor.setMedicalHistory(donor.getMedicalHistory());
	      existingDonor.setAge(donor.getAge());
	      existingDonor.setGender(donor.getGender());
	      existingDonor.setRelation(donor.getRelation());
	      existingDonor.setFamilyPh(donor.getFamilyPh());
	      existingDonor.setBloodGrp(donor.getBloodGrp());
	      existingDonor.setDonOrgan(donor.getDonOrgan());
	      existingDonor.setDateOfBirth(donor.getDateOfBirth());
	      dri.save(existingDonor);
	    }
	  }
	public List<DonorEntity> getDonorDetails() {
		return dri.findAll();
	}
	@Override
	public void createDonorDetails(DonorEntity de) {
		dri.save(de);
		
	}
	@Override
	public void deleteDonorDetails(int id) {
		dri.deleteById(id);
		
	}
	@Override
	public DonorEntity getDonorById(int id) {
        return dri.findById(id).orElse(null);
    }
}
