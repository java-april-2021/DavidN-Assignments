package com.davidnestor.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.davidnestor.relationships.models.Dojo;
import com.davidnestor.relationships.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja,Long> {
	List<Ninja> findAll();
	List<Ninja> findByDojo(Dojo dojo);
}
