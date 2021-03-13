package com.im.assignments.weekfourdayfour;

/**
 * Week 1, Day 4 assignment
 * Implement Singleton with double checked locking.
 * @author Isaac Manayath
 */

public class DoubleCheckedLockingSingleton {
	
	private volatile static DoubleCheckedLockingSingleton _instance; 
	
	private DoubleCheckedLockingSingleton() { 
		
	}
		public static DoubleCheckedLockingSingleton getInstance() 
		
		{ 
			if (_instance == null) 
			{ 
				_instance = new DoubleCheckedLockingSingleton(); 
			} 
		
			return _instance; 
			
		}

}
