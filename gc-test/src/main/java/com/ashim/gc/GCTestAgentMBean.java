package com.ashim.gc;

public interface GCTestAgentMBean {

	void newThread(String threadName);

	void newCollectibleObject(int size);

	void newLeakedObject1(int size);

	void newLeakedObject2(int size);

	void clearLeaked1();

	void clearLeaked2();

	void cpuIntensiveOperation(int iterations);
}