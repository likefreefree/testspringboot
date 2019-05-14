package com.mysite.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
//	@Bean(initMethod="init")
//	public TranslationService getTranslationService(){
//		System.out.println("TestApplication init TranslationService");
//		return new TranslationServiceImpl();
//	}
	@Bean
	public MyApplicationRunner getMyApplicationRunner(){
		return new MyApplicationRunner();
	}
}
