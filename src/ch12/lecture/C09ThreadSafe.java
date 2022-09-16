package ch12.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C09ThreadSafe {
	public static void main(String[] args) throws InterruptedException {
		AtomicInteger val = new AtomicInteger();
		//아토믹 인티저는 동시성을 보장해주는 변수
		//synchronized보다 효율적이다
		Thread t1 = new Thread(()->{
			for(int i=0;i<100000;i++) {
				val.incrementAndGet();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<100000;i++) {
				val.incrementAndGet();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(val.get());
	}
}
