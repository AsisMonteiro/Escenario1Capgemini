package com.capgemini.practicafinal.hijo.mvc.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.practicafinal.hijo.data.modelo.entidades.Categoria;
import com.capgemini.practicafinal.hijo.data.modelo.repositories.CategoriaRepository;

@Service
//@Transactional
public class CategoriaServiceImpl implements CategoriaService {

	// INYECTO mi repositorio CategoriaRepository que tengo en el modulo de data
	@Autowired
	private CategoriaRepository repository;

	@Override
	public List<Categoria> getAll() {
		return repository.findAll();
	}

	/*
	 * @Override public Categoria add(Categoria categoria) { return
	 * repository.save(categoria); }
	 * 
	 * @Override public Categoria edit(Categoria categoria) { return
	 * repository.saveAndFlush(categoria); }
	 * 
	 * @Override public void remove(Categoria categoria) {
	 * repository.delete(categoria); }
	 * 
	 * @Override public Optional<Categoria> getById(int idCategoria) { return
	 * repository.findById(idCategoria); }
	 */

}
