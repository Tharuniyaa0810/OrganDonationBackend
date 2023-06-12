package com.restApi.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restApi.project.Entity.SignUpEntity;
import com.restApi.project.Repository.SignUpRepoInt;

@Service
public class SignUpService implements SignUpServiceInt {

    @Autowired
    private SignUpRepoInt sri;

    @Override
    public void createSignUpDetails(SignUpEntity se) {
        sri.save(se);
    }

    @Override
    public List<SignUpEntity> getSignDetails() {
        return sri.findAll();
    }

    @Override
    public void updateData(SignUpEntity se) {
        sri.save(se);
    }

    @Override
    public void deleteData(int id) {
        sri.deleteById(id);
    }

    @Override
    public SignUpEntity getSignUpByEmail(String email) {
        return sri.findByEmail(email);
    }

    @Override
    public boolean isEmailRegistered(String email) {
        SignUpEntity signUpEntity = getSignUpByEmail(email);
        return signUpEntity != null;
    }
}
