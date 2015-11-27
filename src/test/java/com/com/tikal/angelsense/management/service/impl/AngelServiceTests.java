package com.com.tikal.angelsense.management.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.com.tikal.angelsense.management.Application;
import com.com.tikal.angelsense.management.domain.entity.Angel;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AngelServiceTests {

	@Autowired
	private AngelService angelService;

	@Test
	public void testFindAll() {
		angelService.createAngel(new Angel("Jhon"));
		assertEquals(1,angelService.findAll().size());
	}

}
