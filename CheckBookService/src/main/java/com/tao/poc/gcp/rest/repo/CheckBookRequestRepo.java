package com.tao.poc.gcp.rest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tao.poc.gcp.rest.entity.CheckBookRequest;

@RepositoryRestResource(collectionResourceRel = "customerrequest",
path = "customerrequest")
public interface CheckBookRequestRepo extends PagingAndSortingRepository<CheckBookRequest, Integer> {

}
