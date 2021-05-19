package com.davidnestor.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidnestor.relationships.models.Person;
import com.davidnestor.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository pRepo;

	public PersonService(PersonRepository pRepo) {
		this.pRepo = pRepo;
	}
	
	public Person getPerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public Person createPerson(Person newPerson) {
		return this.pRepo.save(newPerson);
	}
	
	public List<Person> findAllPersons(){
		return this.pRepo.findAll();
	}
}
