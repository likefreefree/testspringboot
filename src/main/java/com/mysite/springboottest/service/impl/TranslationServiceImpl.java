package com.mysite.springboottest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.springboottest.model.Translation;
import com.mysite.springboottest.repository.TranslationRepository;
import com.mysite.springboottest.service.TranslationService;
@Service
public class TranslationServiceImpl implements TranslationService {
    @Autowired
	private TranslationRepository translationRepository;
	@Override
	public List<Translation> findAll() {
		return translationRepository.findAll();
	}
	public Translation create(Translation translation){
		translationRepository.save(translation);
		return translation;
	}
	@Override
	public Translation update(Translation translation) {
		return translation;
	}
	@Override
	public void delete(String id) {
		translationRepository.deleteById(id);
		
	}
	@Override
	public Translation get(String id) {
		Optional<Translation> translation=translationRepository.findById(id);
		return translation.isPresent()?translation.get():null;
	}
	public void init(){
		System.out.println("init......begin");
		Translation translation=new Translation("customer","customer_en"," client_fr");
		translationRepository.save(translation);
		System.out.println("init......end");
	}

}
