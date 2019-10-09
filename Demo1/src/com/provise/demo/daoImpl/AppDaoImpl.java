package com.provise.demo.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.provise.demo.activities.db.AppData;
import com.provise.demo.dao.AppDao;
import com.provise.demo.model.EmployeeModel;
import com.provise.demo.util.DemoUtil;


public class AppDaoImpl implements AppDao{

	@Override
	public EmployeeModel getEmployeeList() {
		
		EmployeeModel attrList = new EmployeeModel();
		ODatabaseSession db = DemoUtil.getClientConnection();
		
		 
				attrList = AppData.getAllEmployeeData();
			
			
		return attrList; 
		
		
	
	}

}
