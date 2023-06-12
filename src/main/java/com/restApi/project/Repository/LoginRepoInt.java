package com.restApi.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restApi.project.Entity.LoginEntity;
@Repository
public interface LoginRepoInt extends JpaRepository<LoginEntity,Integer>{
 
List<LoginEntity> findByIdAndEmail(int id,String email);
LoginEntity findByEmail(String email);

}
