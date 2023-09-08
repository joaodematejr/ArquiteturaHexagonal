package com.demate.hexagonal.application.ports.out;

import com.demate.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

	Address find(String zipcode);

}
