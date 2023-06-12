package com.restApi.project.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.restApi.project.Entity.LoginEntity;

public interface LoginRepoPage extends PagingAndSortingRepository<LoginEntity, Integer> {
   
}
