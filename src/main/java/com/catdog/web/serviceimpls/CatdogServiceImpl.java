package com.catdog.web.serviceimpls;
import com.catdog.web.domains.EmployeeBean;
import com.catdog.web.services.CatdogService;

public class CatdogServiceImpl implements CatdogService{
	private static CatdogServiceImpl instance =  new CatdogServiceImpl();
	
	public static CatdogServiceImpl getInstance() {
		return instance;
	}
	private CatdogServiceImpl() {}

	@Override
	public boolean join(EmployeeBean param) {
		System.out.println(6);
		return false;
	}

	@Override
	public EmployeeBean login(EmployeeBean param) {
		return null;
	}

}
