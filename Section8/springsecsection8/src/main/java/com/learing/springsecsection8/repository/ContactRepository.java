package com.learing.springsecsection8.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learing.springsecsection8.model.Contact;
@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}
