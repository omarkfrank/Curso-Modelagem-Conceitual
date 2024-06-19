package com.mark.mccurso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.mccurso.domain.Categoria;
import com.mark.mccurso.repositories.CategoriaRepository;
import com.mark.mccurso.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não localizado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
