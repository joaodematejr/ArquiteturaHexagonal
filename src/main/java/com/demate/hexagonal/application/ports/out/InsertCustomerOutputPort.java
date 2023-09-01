package com.demate.hexagonal.application.ports.out;

import com.demate.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}

