package com.demate.hexagonal.adapters.out.repository.mapper;

import com.demate.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.demate.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
