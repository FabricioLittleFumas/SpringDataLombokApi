package com.SprinDataLombok.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SprinDataLombok.model.Noticia;

@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Long>{

}
