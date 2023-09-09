package com.demate.hexagonal.application.ports.in;

import com.demate.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

	void insert(Customer customer, String zipCode);

}
