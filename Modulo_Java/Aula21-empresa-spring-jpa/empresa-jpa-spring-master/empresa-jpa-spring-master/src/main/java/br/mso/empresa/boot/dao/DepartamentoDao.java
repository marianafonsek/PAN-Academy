package br.mso.empresa.boot.dao;

import br.mso.empresa.boot.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {
  
  void save(Departamento departamento);
  
  void update(Departamento departamento);
  
  void delete(Long id);
  
  Departamento findById(Long id);
  
  List<Departamento> findAll();
}
