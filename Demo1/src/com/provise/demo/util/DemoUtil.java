package com.provise.demo.util;

import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;

public class DemoUtil {

	
	public static ODatabaseSession getClientConnection() {
		OrientDB orientDB = new OrientDB("remote:localhost", OrientDBConfig.defaultConfig());
		ODatabaseSession databaseSession = orientDB.open("doc_DB", "root", "root");
		
		System.out.println("$$$$$$$"+databaseSession);
		return databaseSession;
	}

	
	
	
}
