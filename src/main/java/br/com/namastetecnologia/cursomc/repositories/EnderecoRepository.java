package br.com.namastetecnologia.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.namastetecnologia.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Integer> {

}
