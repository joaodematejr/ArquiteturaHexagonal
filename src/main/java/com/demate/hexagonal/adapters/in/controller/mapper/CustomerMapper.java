package com.demate.hexagonal.adapters.in.controller.mapper;

import com.demate.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.demate.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    default Customer toCustomer(CustomerRequest customerRequest) {
        return null;
    }

}
