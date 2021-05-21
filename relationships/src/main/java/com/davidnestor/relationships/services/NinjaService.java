package com.davidnestor.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidnestor.relationships.models.Ninja;
import com.davidnestor.relationships.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	@Autowired
	private DojoService dService;
	
	public List<Ninja> getAllNinjas(){
		return this.nRepo.findAll();
	}
	
	public Ninja getNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	public List<Ninja> findByDojo(Long dojoId){
		return this.nRepo.findByDojo(this.dService.getDojo(dojoId));
	}
}
