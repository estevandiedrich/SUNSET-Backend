package com.api.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.rest.entities.Prospect;

@RepositoryRestResource(itemResourceRel = "prospect",collectionResourceRel = "prospects",path = "prospects", exported = true)
public interface ProspectRepository extends CrudRepository<Prospect, Long>{

	@Override
	default void delete(Prospect prosp) {
		prosp.setExcluido(Boolean.TRUE);
		this.save(prosp);
	}
}
