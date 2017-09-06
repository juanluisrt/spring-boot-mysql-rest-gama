package mx.com.gamasoft.demo.springbootmysqlrestgama.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ApiModel(description = "EMPLEADO")
public class Empleado {
    
        @ApiModelProperty(dataType = "Numero", value="Identificador del empleado")
	private Long idEmpleado;
        @ApiModelProperty(dataType = "Cadena", value="Nombre del empleado")
	private String nombre;
        @ApiModelProperty(dataType = "Cadena", value="Apellido paterno del empleado")
	private String apellidoPaterno;
      
	private String apellidoMaterno;
	private String email;
	private String celular;
	
	@Id
	@GeneratedValue
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
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
}
