package com.restApi.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.restApi.project.Entity.PatientEntity;
import com.restApi.project.Service.PatientService;

@RestController
@RequestMapping(value="/OrganDonation")
public class PatientController {
	@Autowired
	private PatientService os;
	@GetMapping("/getpatient")
    public List<PatientEntity> getPatientDetail()
    {
    	return os.getPatientDetails();
    }
	@PostMapping("/createpatient")
    public void createDetail(@RequestBody PatientEntity pe)
    {
    	os.createPatientData(pe);
    }
    @PutMapping("/updatepatient")
    public void updateDetail(@RequestBody PatientEntity pe,@RequestParam int id)
    {
   pe.setId(id);
   os.updatePatientData(pe);
    }
	@DeleteMapping("/delete")
	public void getPatientDetail(@RequestParam int id)
	{
		 os.delDetail(id);
	}
	}
	
