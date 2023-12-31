package com.br.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.apirest.entities.Pagamento;


@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
     Pagamento findById(int id);
}
