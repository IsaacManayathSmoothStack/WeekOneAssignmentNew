
package com.im.assignments.weekfourdayfour;

/**
 * Week 1, Day 4 assignment
 * Deadlock between two threads
 * @author Isaac Manayath
 */

public class TwoThreadDeadlocking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();
		
		T1.start();
		T2.start();
	}
	
	private static class Thread1 extends Thread {
		@Override
		public void run() {
			synchronized (Thread1.class) {
				 System.out.println("Thread 1: Holding lock 1");
	            try { 
	            	Thread.sleep(10); 
	            }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2");
	   
	            synchronized (Thread1.class) {
	            	  System.out.println("Thread 1: Holding lock 1 & 2");
	            }
	         }
			
		}
	}
	
	private static class Thread2 extends Thread {
		@Override
		public void run() {
			
			synchronized (Thread1.class) {
				System.out.println("Thread 2: Holding lock 2");
	            
	            try { 
	            	Thread.sleep(10); 
	            }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 1");

	            
	            synchronized (Thread2.class) {
	            	System.out.println("Thread 2: Holding lock 1 & 2");
	            }
	         }
		
		}
	}

}
