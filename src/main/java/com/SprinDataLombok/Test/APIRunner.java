package com.SprinDataLombok.Test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SprinDataLombok.model.Noticia;
import com.SprinDataLombok.service.repository.NoticiaRepository;

@Component
public class APIRunner implements CommandLineRunner{

	@Autowired
	private NoticiaRepository noticiaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		List<Noticia> noticias = Arrays.asList(
				new Noticia(1L, "Titulo 1"),
				new Noticia(3L, "Titulo 2"),
				new Noticia(4L, "Titulo 3"),
				new Noticia(5L, "Titulo 4"),
				new Noticia(6L, "Titulo 5"),
				new Noticia(7L, "Titulo 6"),
				new Noticia(8L, "Titulo 7")
				);
		List<Noticia> noticiasList =  (List<Noticia>) noticiaRepository.saveAll(noticias);
		
	}

}
