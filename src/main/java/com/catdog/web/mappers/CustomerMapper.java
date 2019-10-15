package com.catdog.web.mappers;
import com.catdog.web.domains.CustomerDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
	public boolean insertEmployee(CustomerDTO param);
	public int countCustomer();
	public CustomerDTO selectByEmpnoEname(CustomerDTO param);
}
