package com.restApi.project.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.project.Entity.DonorEntity;
import com.restApi.project.Repository.DonorRepoInt;
import com.restApi.project.Service.DonorService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value="/OrganDonation")
public class DonorController {
 @Autowired
 private DonorService ds;
 @Autowired
 private DonorRepoInt dri;
 @GetMapping("/getdonor")
 public List<DonorEntity> getDonorDetail()
 {
 	return ds.getDonorDetails();
 }
 @PostMapping("/createdonor")
 public void createDonorDetail(@RequestBody DonorEntity de)
 {
 	ds.createDonorDetails(de);
 }
 @PutMapping("/updatedonor/{id}")
 public ResponseEntity<DonorEntity> updateDonor(@PathVariable("id") int id, @RequestBody DonorEntity donor) {
     Optional<DonorEntity> optionalDonor = dri.findById(id);
     if (optionalDonor.isPresent()) {
         DonorEntity existingDonor = optionalDonor.get();
         existingDonor.setFullName(donor.getFullName());
         existingDonor.setPh(donor.getPh());
         existingDonor.setAge(donor.getAge());
         existingDonor.setDateOfBirth(donor.getDateOfBirth());
         existingDonor.setEmail(donor.getEmail());
         existingDonor.setAddress(donor.getAddress());
         existingDonor.setCity(donor.getCity());
         existingDonor.setPincode(donor.getPincode());
         existingDonor.setBloodGrp(donor.getBloodGrp());
         existingDonor.setDonOrgan(donor.getDonOrgan());
         existingDonor.setRelation(donor.getRelation());
         existingDonor.setFamilyPh(donor.getFamilyPh());
         existingDonor.setGender(donor.getGender());
         existingDonor.setMedicalHistory(donor.getMedicalHistory());
         donor.setId(id);
         DonorEntity updatedDonor = dri.save(existingDonor);
         return ResponseEntity.ok(updatedDonor);
     } else {
         return ResponseEntity.notFound().build();
     }
 }



 @DeleteMapping("/deletedonor/{id}")
 public void deleteData(@PathVariable int id)
 {
 	ds.deleteDonorDetails(id);
 }
}
 

