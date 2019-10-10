package com.catdog.web.daos;
import com.catdog.web.domains.EmployeeBean;

public interface CompanyDao {
	public boolean insertEmployee(EmployeeBean param);
	public EmployeeBean selectByEmpnoEname(EmployeeBean param);
}
