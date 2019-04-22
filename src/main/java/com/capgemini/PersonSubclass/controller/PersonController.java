package com.capgemini.PersonSubclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonSubclass.entity.Person;
import com.capgemini.PersonSubclass.entity.RegularPerson;
import com.capgemini.PersonSubclass.service.PersonService;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{		
		RegularPerson person = new RegularPerson(152, "Pradnya", 10000, 2000);
		service.addNew(person);
		
		return person;
	}
}
