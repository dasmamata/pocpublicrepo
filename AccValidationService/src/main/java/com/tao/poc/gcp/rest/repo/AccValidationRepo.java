package com.tao.poc.gcp.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tao.poc.gcp.rest.entity.CardAccount;

@RepositoryRestResource(collectionResourceRel = "accvalidationrequest",
path = "accvalidationrequest")
public interface AccValidationRepo extends PagingAndSortingRepository<CardAccount, Integer> {

}
