package com.restApi.project.Controller;

import java.util.List;

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

import com.restApi.project.Entity.SignUpEntity;
import com.restApi.project.Service.SignUpService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/OrganDonation")
public class SignUpController {

    @Autowired
    private SignUpService ss;

    @GetMapping("/sign")
    public List<SignUpEntity> getSignDetail() {
        return ss.getSignDetails();
    }

    @GetMapping("/signup/{email}")
    public ResponseEntity<?> checkEmailRegistered(@PathVariable String email) {
        boolean isEmailRegistered = ss.isEmailRegistered(email);
        return ResponseEntity.ok().body(isEmailRegistered);
    }
    @PostMapping("/createsign")
    public ResponseEntity<String> createSignUp(@RequestBody SignUpEntity signUpEntity) {
        ss.createSignUpDetails(signUpEntity);
        return ResponseEntity.ok().body("Sign up successful!");
    }

    @PutMapping("/putsign")
    public void createDetail(@RequestBody SignUpEntity se, @RequestParam int id) {
        se.setId(id);
        ss.updateData(se);
    }

    @DeleteMapping("/deletesign")
    public void deleteData(@RequestParam int id) {
        ss.deleteData(id);
    }
}
