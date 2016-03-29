package com.rec.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ExampleService implements Service, InitializingBean, DisposableBean {

	private String message = "";

	public String getMessage() {
		return message;
	}

	@PostConstruct
	public void initIt() throws Exception {
		message += "initIt/";
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		message += "cleanUp/";
	}

	public void afterPropertiesSet() throws Exception {
		message += "afterPropertiesSet/";
	}

	public void destroy() throws Exception {
		message += "destroy/";
	}

}
