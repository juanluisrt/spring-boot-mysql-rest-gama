package mx.com.gamasoft.demo.springbootmysqlrestgama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import mx.com.gamasoft.demo.springbootmysqlrestgama.model.Departamentos;

@Component
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long>{

}
