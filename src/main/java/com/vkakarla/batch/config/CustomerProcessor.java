package com.vkakarla.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.vkakarla.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
    public Customer process(Customer customer) throws Exception {
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }
        return customer;
    }

	
}
