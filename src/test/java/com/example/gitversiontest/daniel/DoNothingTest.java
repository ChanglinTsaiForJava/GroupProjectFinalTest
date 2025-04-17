package com.example.gitversiontest.daniel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DoNothingTest {

	@Autowired
	private DoNothing doNothing;
	
	@Test
	void testHahaha() {
		doNothing.hahaha();
	}

}
