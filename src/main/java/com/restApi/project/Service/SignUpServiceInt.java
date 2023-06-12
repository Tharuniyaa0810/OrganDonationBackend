package com.restApi.project.Service;



import java.util.List;

import com.restApi.project.Entity.DonorEntity;
import com.restApi.project.Entity.SignUpEntity;

public interface SignUpServiceInt {
	 public List<SignUpEntity> getSignDetails();
	 public boolean isEmailRegistered(String email);
      public void createSignUpDetails(SignUpEntity se);
      public void updateData(SignUpEntity le);
      public void deleteData(int id);
      public SignUpEntity getSignUpByEmail(String email);
}
