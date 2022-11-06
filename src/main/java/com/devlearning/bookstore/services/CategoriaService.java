package com.devlearning.bookstore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlearning.bookstore.domain.Categoria;
import com.devlearning.bookstore.exceptions.ObjectNotFoundException;
import com.devlearning.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado!" + "id: " + id + ", tipo: " + Categoria.class.getName()));
	}
}
