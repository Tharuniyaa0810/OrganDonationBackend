package com.restApi.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.project.Entity.ForgotPasswordEntity;
import com.restApi.project.Service.ForgotPasswordService;

@RestController
@RequestMapping(value="/OrganDonation")
public class ForgotPasswordContoller {
	@Autowired
	private ForgotPasswordService fs;
	@GetMapping("/forgotpassVal")
	   public String validatePass(@RequestParam String newPass,@RequestParam String confirmPass)
		{
			if(newPass.equals(confirmPass))
			{
				return "Password Verified";
			}
			else {
				return "Enter Same Password";
			}
		}
	   @GetMapping("/forgot")
	   public List<ForgotPasswordEntity> getForgotpassDetail(){
		   return fs.getForgotPassDetails();
	   }

}
