package com.restApi.project.Service;

import java.util.List;

import com.restApi.project.Entity.LoginEntity;

public interface LoginServiceInt {
   public List<LoginEntity> getLoginDetails();
   public void createData(LoginEntity le);
   public void updateData(LoginEntity le);
   public void deleteData(int id);
   LoginEntity findByEmail(String email);
   public List<LoginEntity> getdetail1(int id,String email);
   public List<LoginEntity> getAllDetails(int pageNo,int pageSize);
  
}
