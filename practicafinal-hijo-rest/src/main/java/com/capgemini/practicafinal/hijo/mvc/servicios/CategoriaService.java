package com.capgemini.practicafinal.hijo.mvc.servicios;

import java.util.List;

import com.capgemini.practicafinal.hijo.data.modelo.entidades.Categoria;

/*
 * Servicio para entidad Candidato
 */
public interface CategoriaService {

	List<Categoria> getAll();

	/*
	 * int add(Categoria categoria);
	 * 
	 * Categoria getById(int codigo);
	 * 
	 * boolean edit(Categoria categoria);
	 * 
	 * boolean delete(int codigo);
	 */
}
