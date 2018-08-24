package br.com.namastetecnologia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.namastetecnologia.cursomc.domain.Categoria;
import br.com.namastetecnologia.cursomc.repositories.CategoriaRepository;
import br.com.namastetecnologia.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {  
		Optional<Categoria> obj = repo.findById(id);  
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Categoria.class.getName())); 
		
	} 
	
}
