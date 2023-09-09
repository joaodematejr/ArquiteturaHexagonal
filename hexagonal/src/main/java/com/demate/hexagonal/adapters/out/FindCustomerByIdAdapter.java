package com.demate.hexagonal.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demate.hexagonal.adapters.out.repository.CustomerRepository;
import com.demate.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.demate.hexagonal.application.core.domain.Customer;
import com.demate.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerEntityMapper customerEntityMapper;

	@Override
	public Optional<Customer> find(String id) {
		var customerEntity = customerRepository.findById(id);
		return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
	}

}
