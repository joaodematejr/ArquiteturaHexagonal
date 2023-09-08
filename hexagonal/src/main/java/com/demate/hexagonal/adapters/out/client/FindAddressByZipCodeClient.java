package com.demate.hexagonal.adapters.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.demate.hexagonal.adapters.out.client.response.AddressResponse;

@FeignClient(name = "FindAddressByZipCodeClient", url = "${demate.client.address.url}")
public interface FindAddressByZipCodeClient {
	
	@GetMapping("/{zipCode}")
	AddressResponse find(String zipCode);
	
	

}
