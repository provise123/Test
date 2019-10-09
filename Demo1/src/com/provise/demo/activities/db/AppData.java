package com.provise.demo.activities.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.sql.executor.OResultSet;

import com.provise.demo.model.EmployeeModel;



public class AppData {

	/*public static List<EmployeeModel> getAllEmployeeData(ODatabaseSession db)
	{
		
			final String getAllData = "select * from v where @class = 'Employee'";		
			
			List<EmployeeModel> attrList = new ArrayList<EmployeeModel>();
			JSONObject json = new JSONObject();
		
			OResultSet rs = db.query(getAllData);

			if(rs!=null){
				while (rs.hasNext()) 
				{
					String jsonStr = rs.next().toJSON();
					
					JSONParser parser = new JSONParser();
					try {
						json = (JSONObject) parser.parse(jsonStr); //parse the json string using json parser
					} catch (ParseException e){
						e.printStackTrace(); 
					}
					EmployeeModel attr = new EmployeeModel(json.get("firstName").toString(), json.get("lastName").toString(),json.get("emailAddress").toString(),json.get("DOB").toString());

					attrList.add(attr); 
				}
			}
		
			return attrList;
	}*/
	
	
	public static ODatabaseSession getClientConnection() {
		OrientDB orientDB = new OrientDB("remote:localhost", OrientDBConfig.defaultConfig());
		ODatabaseSession databaseSession = orientDB.open("doc_DB", "root", "root");
		
		System.out.println("$$$$$$$"+databaseSession);
		return databaseSession;
	}
	public static EmployeeModel getAllEmployeeData() {
		EmployeeModel model =new EmployeeModel();
		
		String DOB = "2019-10-10";
		ODatabaseSession db =AppData.getClientConnection();
		OResultSet rs=null;
		ObjectMapper objectMapper=new ObjectMapper();
		try{			
			String queryStr="select * from `v` where DOB = '"+DOB+"'";
			System.out.println("executing query ::"+queryStr);
			rs=db.query(queryStr);
			
			if(rs!=null)
			{
				while(rs.hasNext())
				{
					String jsonStr = rs.next().toJSON();
					Map<String,Object>  mapData = objectMapper.readValue(jsonStr, Map.class);					
					System.out.println("map::"+mapData);
					model=new  EmployeeModel(mapData.get("firstName").toString(), mapData.get("lastName").toString(),mapData.get("emailAddress").toString(),mapData.get("DOB").toString());
				}//while ends
				return model;
				
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally{
			if(rs!=null)
				rs.close(); //closing resultset
		}
		return model;		
	}
	
}
