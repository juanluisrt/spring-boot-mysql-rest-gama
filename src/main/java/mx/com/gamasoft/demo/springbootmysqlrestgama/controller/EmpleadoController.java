package mx.com.gamasoft.demo.springbootmysqlrestgama.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import mx.com.gamasoft.demo.springbootmysqlrestgama.model.Empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gamasoft.demo.springbootmysqlrestgama.repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/rest/empleados")
public class EmpleadoController {

    @Autowired// llenar los campos en automatico
    private EmpleadoRepository empleadoRepository;

    @GetMapping(value = "/consultarEmpleado/{idEmpleado}")
    @ApiOperation(value = "Consulta el detalle de un empleado", notes = "Permite consultar el nombre completo de un empleado, email y celuar.")    
    public Empleado consultarEmpleado(@ApiParam(value = "Identificador del empleado", required=false)
@PathVariable Long idEmpleado) {
        return empleadoRepository.findOne(idEmpleado);
    }

    @PostMapping(value = "/crearEmpleado")
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @PutMapping(value = "/actualizarEmpleado")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado) {
        Empleado empleadoBD = empleadoRepository.findOne(empleado.getIdEmpleado());
        empleadoBD.setNombre(empleado.getNombre());
        empleadoBD.setApellidoPaterno(empleado.getApellidoPaterno());
        empleadoBD.setApellidoMaterno(empleado.getApellidoMaterno());
        empleadoBD.setEmail(empleado.getEmail());
        empleadoBD.setCelular(empleado.getCelular());
        return empleadoRepository.save(empleado);
    }

    @GetMapping(value = "/consultarEmpleados")
    public List<Empleado> consultarEmpleados() {
        return empleadoRepository.findAll();
    }

    @DeleteMapping(value = "/eliminarEmpleado/{idEmpleado}")
    public String eliminarEmpleado(@PathVariable final Long idEmpleado) {
        Empleado empleadoBD = empleadoRepository.findOne(idEmpleado);
        if (empleadoBD != null) {
            empleadoRepository.delete(idEmpleado);
            return "Empleado eliminado";
        } else {
            return "No se encuentra el Empleado con id " + idEmpleado;
        }
    }

}
