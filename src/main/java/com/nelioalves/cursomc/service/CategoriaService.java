package com.nelioalves.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repository.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	CategoriaRepository repo;
	

	public Categoria buscar(Integer id)  {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
				
	}


	}



