package com.mark.mccurso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.mccurso.domain.Pedido;
import com.mark.mccurso.repositories.PedidoRepository;
import com.mark.mccurso.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não localizado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
