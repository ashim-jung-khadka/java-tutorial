package com.ashim.gc;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class GCTestMain {

	private GCTestMain() {
	}

	private static void init() throws MalformedObjectNameException, InstanceAlreadyExistsException,
			MBeanRegistrationException, NotCompliantMBeanException {
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

		GCTestAgent agent1 = new GCTestAgent();
		GCTestAgent2 agent2 = new GCTestAgent2();

		ObjectName agentName1 = new ObjectName("GCTests:name=GCTestAgent1");
		ObjectName agentName2 = new ObjectName("GCTests:name=GCTestAgent2");

		mbs.registerMBean(agent1, agentName1);
		mbs.registerMBean(agent2, agentName2);
	}

	public static void main(String[] args) throws Exception {
		init();
		for (; ; ) {
			Thread.sleep(1000);
		}
	}
}