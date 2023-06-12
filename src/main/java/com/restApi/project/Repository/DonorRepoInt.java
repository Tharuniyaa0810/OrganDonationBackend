package com.restApi.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restApi.project.Entity.DonorEntity;
@Repository
public interface DonorRepoInt extends JpaRepository<DonorEntity, Integer> {

}
