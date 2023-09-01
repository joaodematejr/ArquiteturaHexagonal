package com.demate.hexagonal.adapters.out.client.mapper;

import com.demate.hexagonal.adapters.out.client.response.AddressResponse;
import com.demate.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel =  "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
