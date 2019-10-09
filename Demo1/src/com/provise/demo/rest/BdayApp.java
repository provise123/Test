package com.provise.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.provise.demo.model.EmployeeModel;
import com.provise.demo.service.AppService;
import com.provise.demo.serviceImpl.AppServiceImpl;
import com.provise.platform.webdist.rest.ServiceResponse;



@Path("/")
public class BdayApp{

	public static AppService appService = new AppServiceImpl();
	
	@GET
	@Path("list")
	public Response getEmployeeList()
	{ 		
		
		System.out.println("ZZZZZZZZZZZZZZZz");
		EmployeeModel bdayEmployeeList = appService.getEmployeeList();
		
		System.out.println("bdayEmployeeList:------"+bdayEmployeeList);
		ResponseBuilder response = null;		
		ServiceResponse<EmployeeModel> serviceResponse = new ServiceResponse<>();
		serviceResponse.setResponseCode(200);	
		serviceResponse.setResponse(bdayEmployeeList);
		response = Response.status(Response.Status.OK).entity(serviceResponse);	
		
		
		return response.build();
	} 
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("AAAAAA"+req+"  BBBBBBBBBBB"+resp);
		List<EmployeeModel> bdayEmployeeList = appService.getEmployeeList();
		
		req.setAttribute("empList", bdayEmployeeList);
		RequestDispatcher rd = req.getRequestDispatcher("EmpList.jsp");
		
		rd.forward(req, resp);
	}*/
	
	
}
