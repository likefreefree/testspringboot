package com.mysite.springboottest.service;

import java.util.List;

import com.mysite.springboottest.model.Translation;

public interface TranslationService {
    List<Translation> findAll();
    Translation create(Translation translation);
	Translation update(Translation translation);
	void delete(String key);
	Translation get(String key);
	void init();
}
