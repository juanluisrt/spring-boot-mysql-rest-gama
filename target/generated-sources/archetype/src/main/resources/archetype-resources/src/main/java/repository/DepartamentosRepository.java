#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import ${package}.model.Departamentos;

@Component
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long>{

}
