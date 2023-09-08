package com.demate.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.demate.hexagonal.adapters.out.client.response.AddressResponse;
import com.demate.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
	
	Address toAddress(AddressResponse addressResponse);

}
