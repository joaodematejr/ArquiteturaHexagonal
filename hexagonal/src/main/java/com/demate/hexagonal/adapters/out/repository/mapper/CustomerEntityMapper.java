package com.demate.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.demate.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.demate.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

	CustomerEntity toCustomerEntity(Customer customer);

	Customer toCustomer(CustomerEntity customerEntity);

}
