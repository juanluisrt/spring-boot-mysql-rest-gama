package mx.com.gamasoft.demo.springbootmysqlrestgama.controller;


import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import mx.com.gamasoft.demo.springbootmysqlrestgama.model.Departamentos;
import mx.com.gamasoft.demo.springbootmysqlrestgama.repository.DepartamentosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="rest/depa/")
public class DepartamentosContraller {
	@Autowired
	private DepartamentosRepository departamentoRepository;
	
	@GetMapping(value = "/consultarDepartamento/{idDepartamento}")
	@ApiOperation(value="Consulta el detalle del deparrtamento", notes="Permite consultar detalles del departamento")
	
	public Departamentos consultarDepartamentos(@ApiParam(value ="identificador del departamento",required=false)@PathVariable Long idDepartamento){
		
		return departamentoRepository.findOne(idDepartamento);
	}
	///asdfhhh
	@PostMapping(value ="/crearDepartamenta")
	public Departamentos55555 crearDepartamento(@RequestBody Departamentos departamento){
		
		return departamentoRepository.save(departamento);
	}
	@PutMapping(value = "/actualizarEmpleado")
    public Departamentos actualizarDepartamento(@RequestBody Departamentos departamento) {
		Departamentos departamentoBD = departamentoRepository.findOne(departamento.getIdDepartamento());
		departamentoBD.setIdEmpleado(departamento.getIdEmpleado());
		departamentoBD.setNombre(departamento.getNombre());
		return departamentoRepository.save(departamento);
    }

    @GetMapping(value = "/consultarDepartamentos")
    public List<Departamentos> consultarDepartamentos() {
        return departamentoRepository.findAll();
    }

    @DeleteMapping(value = "/eliminarDepartamento/{idDepartamento}")
    public String eliminarDepartamento(@PathVariable final Long idDepartamento) {
        Departamentos departamentoBD = departamentoRepository.findOne(idDepartamento);
        if (departamentoBD != null) {
        	departamentoRepository.delete(idDepartamento);
            return "Departamento eliminado";
        } else {
            return "No se encuentra el Departamento con id " + idDepartamento;
        }
    }

}
