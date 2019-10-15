package com.catdog.web.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.catdog.web.domains.CustomerDTO;
import com.catdog.web.mappers.CustomerMapper;
import com.catdog.web.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customerMapper;
	
	@Override
	public boolean join(CustomerDTO param) {
		return false;
	}

	@Override
	public CustomerDTO login(CustomerDTO param) {
		return null;
	}

	@Override
	public int countCustomer() {
		return customerMapper.countCustomer();
	}

}
