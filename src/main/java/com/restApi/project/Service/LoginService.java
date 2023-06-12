package com.restApi.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.restApi.project.Entity.LoginEntity;
import com.restApi.project.Repository.LoginRepoInt;

@Service
public class LoginService implements LoginServiceInt {
     @Autowired
     private LoginRepoInt lri;
     @Override
     public List<LoginEntity> getLoginDetails()
     {
    	 return lri.findAll();	
     }
     @Override
     public void createData(LoginEntity le)
     {
    	 lri.save(le);
     }
     @Override
     public void updateData(LoginEntity le)
     {
    	 lri.save(le);
     }
     @Override
     public void deleteData(int id)
     {
    	 lri.deleteById(id);
     }
     @Override
     public LoginEntity findByEmail(String email) {
         return lri.findByEmail(email);
     }
     public boolean isValidUser(String email, String pasword) {
 		LoginEntity user = lri.findByEmail(email);
 		System.out.print(user != null && user.getPassword().equals(pasword));
 		return user != null && user.getPassword().equals(pasword);
 	}

     @Override
     public List<LoginEntity> getdetail1(int id,String email){
    	 return lri.findByIdAndEmail(id, email);
     }
	@Override
	public List<LoginEntity> getAllDetails(int pageNo, int pageSize) {
		Pageable page= PageRequest.of(pageNo, pageSize,Direction.ASC,"id");
		return lri.findAll(page).getContent();
	}
     
     
}