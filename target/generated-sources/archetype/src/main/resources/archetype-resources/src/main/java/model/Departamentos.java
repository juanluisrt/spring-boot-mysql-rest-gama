#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@ApiModel(description="DEPARTAMENTOS")
public class Departamentos {
	
	@ApiModelProperty(dataType="Numero", value="Identificador del departamento")
	private Long idDepartamento;
	
	@ApiModelProperty(dataType="Nuemero", value="identificador del departamento")
	private Long idEmpleado;
	
	@ApiModelProperty(dataType="Cadena", value="Nombre del departamento")
	private String nombre;
	
	@Id
	@GeneratedValue
	public Long getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	} 
	
	//@Id
	//@GeneratedValue
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

		
}
