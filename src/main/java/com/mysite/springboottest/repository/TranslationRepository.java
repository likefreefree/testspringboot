package com.mysite.springboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.springboottest.model.Translation;

public interface TranslationRepository extends JpaRepository<Translation, String> {

}
