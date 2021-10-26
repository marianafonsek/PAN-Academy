package com.mariana.microtabela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mariana.microtabela.model.Tabela;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
