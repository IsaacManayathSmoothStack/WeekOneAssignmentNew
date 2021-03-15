package com.im.assignments.week1assignment;

/**
 * Week 1, Week 1 Assignment

 * Assignment 6, Singleton
 * @author Isaac Manayath
 */

/*
 * Convert bigdecimal value to int, to be able to calculate the value
 * Make the class non-static, since it is impossible to make a class static
 * You need a constructor for a singleton.
 * For a proper singleton, check if the instance is null
 * Add a try catch for checking error conditions
 */

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleSingleton {

	private static Connection conn = null;

	private static SampleSingleton instance = null;

	private SampleSingleton() {
	};

	public static SampleSingleton getInstance() {
		if (instance == null) {
			return instance;
		}
		return instance;
	}

	public static void databaseQuery(BigDecimal input) {
		try {

			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			int x = 0;
			int y = input.intValue();
			while (rs.next()) {
				x = y * rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
