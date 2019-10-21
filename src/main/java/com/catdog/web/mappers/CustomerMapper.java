package com.catdog.web.mappers;
import org.springframework.stereotype.Repository;
import com.catdog.web.domains.CustomerDTO;


@Repository
public interface CustomerMapper {
	public CustomerDTO selectCustomerById(CustomerDTO param);
	public int countCustomer();
	public void insertCustomer(CustomerDTO param);
}
