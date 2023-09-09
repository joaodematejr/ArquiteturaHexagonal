package com.demate.hexagonal.adapters.in.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

	public String getZipCode() {
		// TODO Auto-generated method stub
		return this.zipCode;
	}

}
