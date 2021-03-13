package com.im.assignments.weekfourdayfour;

/**
 * Week 1, Day 4 assignment
 * ProducerConsumerProblem
 * @author Isaac Manayath
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
	
	private static Queue<Integer> buffer = new LinkedList<> ();

	private static class Producer extends Thread {
		private Queue<Integer> queue;
		
		Producer(Queue<Integer> queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			int threadCount = 0;
			System.out.println("Producing");
			while (threadCount < 10) {
				synchronized (queue) {
					if (queue.size() == 2) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Producing");
					}
					threadCount++;
					Random rand = new Random();
					int nextOnList = rand.nextInt();
					System.out.println(nextOnList);
					queue.add(new Integer(nextOnList));
					queue.notifyAll();
				}
			}
			
		}
	}
	
	private static class Consumer extends Thread {
		private Queue<Integer> queue;
		
		Consumer (Queue<Integer> queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			int threadCount = 0;
			while (threadCount < 10) {
				synchronized (queue) {
					if (queue.size() == 0) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Consuming");
					}
					threadCount++;
					System.out.println(queue.remove());
					queue.notifyAll();
				}
			}
		}
	}
	
	public static void main(String[]  args) {
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);
		
		producer.start();
		consumer.start();
	}
}
