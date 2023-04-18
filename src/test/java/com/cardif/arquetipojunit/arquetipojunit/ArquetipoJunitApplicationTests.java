package com.cardif.arquetipojunit.arquetipojunit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ArquetipoJunitApplicationTests {

	@Test
	void contextLoads() {
		Assert.isTrue(true);
	}

}
