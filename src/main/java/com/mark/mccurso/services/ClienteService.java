package com.mark.mccurso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.mccurso.domain.Cliente;
import com.mark.mccurso.repositories.ClienteRepository;
import com.mark.mccurso.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não localizado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
