package com.demate.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demate.hexagonal.adapters.out.repository.CustomerRepository;
import com.demate.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.demate.hexagonal.application.core.domain.Customer;
import com.demate.hexagonal.application.ports.out.InsertCustomerOutputPort;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerEntityMapper customerEntityMapper;

	@Override
	public void insert(Customer customer) {
		var customerEntity = customerEntityMapper.toCustomerEntity(customer);
		customerRepository.save(customerEntity);

	}

}
