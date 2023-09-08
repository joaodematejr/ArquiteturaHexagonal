package com.demate.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demate.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.demate.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.demate.hexagonal.application.core.domain.Address;
import com.demate.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

	@Autowired
	private FindAddressByZipCodeClient findAddressByZipCodeClient;

	@Autowired
	private AddressResponseMapper addressResponseMapper;

	@Override
	public Address find(String zipcode) {
		var addressResponse = findAddressByZipCodeClient.find(zipcode);
		return addressResponseMapper.toAddress(addressResponse);
	}

}
