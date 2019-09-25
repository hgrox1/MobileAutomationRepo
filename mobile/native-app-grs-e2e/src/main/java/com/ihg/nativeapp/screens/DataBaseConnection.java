package com.ihg.nativeapp.screens;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection {

	public static void main(String args[]) {
		Connection conn = null;

		String dbName = "Tosca_Analytics";
		String server_name = "iadd1swtcoap030\\ToscaAnalytics";
		String serverport = "1433";

		String dbURL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName+ "";
		String user = "Tosca";
		String pass = "ACN123!";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		// Query to Execute
		String query = "SELECT ConfNumber, LastName FROM [Tosca_GRS_TDM].[dbo].[GRS_POC_InputTable] WHERE ScenarioName = 'SP05Stage'";

		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(dbURL, user, pass);
			if (conn != null) {
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
			}

			// Create Statement Object
			Statement stmt = conn.createStatement();

			// Execute the SQL Query. Store results in ResultSet
			ResultSet rs = stmt.executeQuery(query);

			// While Loop to iterate through all data and print results
			while (rs.next()) {
				String confirmationNumber = rs.getString(1);
				System.out.println("Confirmation Number is: " + confirmationNumber);
			}

			// closing DB Connection
			conn.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

}