package com.mark.mccurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mark.mccurso.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}