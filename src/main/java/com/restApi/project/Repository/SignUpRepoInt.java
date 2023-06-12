package com.restApi.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restApi.project.Entity.SignUpEntity;
@Repository
public interface SignUpRepoInt extends JpaRepository<SignUpEntity, Integer> {

	SignUpEntity findByEmail(String email);

}
