package com.ihg.nativeapp.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadFromDatabase {
	
	private final String jdbcDriverStr;
    private final String jdbcURL;
    private final String query;
 
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public static ArrayList<String> resultValues;
    public static String memberId;
    public static String pin;
    
    
    public ReadFromDatabase(String jdbcDriverStr, String jdbcURL, String query){
        this.jdbcDriverStr = jdbcDriverStr;
        this.jdbcURL = jdbcURL;
		this.query = query;
    }
 
    public ArrayList<String> readData() throws Exception {
        try {
        	String user = "Tosca";
    		String pass = "ACN123!";
            Class.forName(jdbcDriverStr);
            connection = DriverManager.getConnection(jdbcURL, user, pass);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            resultValues = new ArrayList<>();
			while (resultSet.next()) {
				int i = 1;
				while (i <= columnCount) {
					resultValues.add(resultSet.getString(i++));
				}
			}
            return resultValues;
        }finally{
            close();
        }
    }
 
    public void updateTable() throws Exception {
    	try {
        	String user = "Tosca";
    		String pass = "ACN123!";
            Class.forName(jdbcDriverStr);
            connection = DriverManager.getConnection(jdbcURL, user, pass);
            statement = connection.createStatement();
            statement.executeUpdate(query);
        }finally{
            close();
        }
    }
 
    private void close(){
        try {
            if(resultSet!=null) resultSet.close();
            if(statement!=null) statement.close();
            if(connection!=null) connection.close();
        } catch(Exception e){}
    }
	
}