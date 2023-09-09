package com.demate.hexagonal.application.ports.in;

import com.demate.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

	Customer find(String id);

}
