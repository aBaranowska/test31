package com.rec.spring;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ExampleServiceTests {

	private ApplicationContext context;
	private Service bean;

	@Before
	public void setUp() {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		bean = context.getBean(Service.class);
	}

	@After
	public void tearDown() {
		((AbstractApplicationContext) context).close();

		assertEquals("initIt/afterPropertiesSet/cleanUp/destroy/", bean.getMessage());
	}

	@Test
	public void getBean() {
		assertEquals("initIt/afterPropertiesSet/", bean.getMessage());
	}

}
