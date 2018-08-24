package br.com.namastetecnologia.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.namastetecnologia.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Integer> {

}
