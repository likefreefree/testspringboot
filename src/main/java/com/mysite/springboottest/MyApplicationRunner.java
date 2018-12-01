package com.mysite.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.mysite.springboottest.model.Translation;
import com.mysite.springboottest.repository.TranslationRepository;

public class MyApplicationRunner implements ApplicationRunner {
    @Autowired
	private TranslationRepository translationRepository;
    @Override
    public void run(ApplicationArguments var1) throws Exception{
        System.out.println("MyApplicationRunner.... begin");
		Translation translation=new Translation("customer","customer_en","customer_fr");
		translationRepository.save(translation);
		System.out.println("MyApplicationRunner.... end");    
    }

}
