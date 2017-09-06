package it.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import it.pkg.model.Departamentos;

@Component
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long>{

}
