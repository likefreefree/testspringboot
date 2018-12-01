package com.mysite.springboottest.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysite.springboottest.model.Translation;
import com.mysite.springboottest.service.TranslationService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TranslationServiceTest {
    @Autowired
	private TranslationService translationService;
	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreate() {
		Translation translation=new Translation("customer.test","customer test"," client du tester");
		translationService.create(translation);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

}
