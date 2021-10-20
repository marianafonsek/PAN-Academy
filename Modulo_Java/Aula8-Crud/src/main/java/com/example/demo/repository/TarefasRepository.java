package com.example.demo.repository;


import java.util.List;

//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.TarefasModel;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {
	
//	lista
	public List<TarefasModel> findAllByTarefaContainingIgnoreCase(String tarefa);
	
    public List<TarefasModel> findByTarefaAndId(String tarefa, Long id);

    public List<TarefasModel> findByTarefaOrId(String tarefa, Long id);

	@Query(value = "Select  * FROM TAREFA_MODEL",
		nativeQuery = true)
	List<TarefasModel> procuraTodos();

}
