package com.restApi.project.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restApi.project.Entity.ForgotPasswordEntity;

@Service
public class ForgotPasswordService implements ForgotPasswordServiceInt {
	public static List<ForgotPasswordEntity> fob=new ArrayList<>();
    static {
    	ForgotPasswordEntity fm=new ForgotPasswordEntity("Sri@gmail.com","Sri5678","Sri5678");
    	fob.add(fm);
    }
    @Override
    public List<ForgotPasswordEntity> getForgotPassDetails(){
    	return fob;
    }
}
