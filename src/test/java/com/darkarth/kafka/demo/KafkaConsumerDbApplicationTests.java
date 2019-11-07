package com.darkarth.kafka.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaConsumerDbApplicationTests {

	@Test
	void contextLoads() {

		String mens = "lkaslksalfdasfdsafadsfdsafdasfdskasd applicationId=ASDASD";
		int lastIndex = mens.indexOf("applicationId=")+14;
		System.out.println("applicationId:" + mens.substring(lastIndex, lastIndex+6));
		String applicationId = "";
	}

}
