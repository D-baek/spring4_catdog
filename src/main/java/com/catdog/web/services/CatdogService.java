package com.catdog.web.services;

import com.catdog.web.domains.EmployeeBean;

public interface CatdogService {
	public boolean join (EmployeeBean param);
	public EmployeeBean login(EmployeeBean param);
}
