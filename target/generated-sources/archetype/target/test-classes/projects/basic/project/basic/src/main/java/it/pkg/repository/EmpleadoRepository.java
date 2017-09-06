package it.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import it.pkg.model.Empleado;

@Component
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
