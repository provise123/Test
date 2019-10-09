package com.provise.demo.serviceImpl;

import java.util.List;

import com.provise.demo.dao.AppDao;
import com.provise.demo.daoImpl.AppDaoImpl;
import com.provise.demo.model.EmployeeModel;
import com.provise.demo.service.AppService;

public class AppServiceImpl implements AppService{

	public static AppDao appDao =  new AppDaoImpl();
	
	@Override
	public EmployeeModel getEmployeeList() {
		
		EmployeeModel employeeModels = appDao.getEmployeeList();
		return employeeModels;
	}

}
