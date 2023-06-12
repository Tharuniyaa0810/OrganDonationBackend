package com.restApi.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.project.Entity.LoginEntity;
import com.restApi.project.Entity.SignUpEntity;
import com.restApi.project.Service.LoginService;
import com.restApi.project.Service.SignUpService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/OrganDonation")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        SignUpEntity existingUser = signUpService.getSignUpByEmail(email);
        if (existingUser == null) {
            return "User not found";
        }

        // Compare the provided password with the stored password
        if (!password.equals(existingUser.getPassword())) {
            return "Invalid password";
        }

        // Successful login
        return "Login successful";
    }

    @GetMapping("/login")
    public List<LoginEntity> getLoginDetail() {
        return loginService.getLoginDetails();
    }

    @GetMapping("/page")
    public List<LoginEntity> getAllDetail(@RequestParam int pageNo, @RequestParam int pageSize) {
        return loginService.getAllDetails(pageNo, pageSize);
    }

    @GetMapping("/byemail")
    public LoginEntity getEmaildetails(@RequestParam String email) {
        return loginService.findByEmail(email);
    }

    @GetMapping("/byidemail")
    public List<LoginEntity> getIdEmaildetails(@RequestParam int id, @RequestParam String email) {
        return loginService.getdetail1(id, email);
    }

    @PostMapping("/postlogin")
    public void createDetail(@RequestBody LoginEntity loginEntity) {
        loginService.createData(loginEntity);
    }

    @PutMapping("/putlogin")
    public void updateDetail(@RequestBody LoginEntity loginEntity, @RequestParam int id) {
        loginEntity.setId(id);
        loginService.updateData(loginEntity);
    }

    @DeleteMapping("/deletelogin")
    public void deleteData(@RequestParam int id) {
        loginService.deleteData(id);
    }

    static class UserLoginRequest {
        private String email;
        private String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
