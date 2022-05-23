package co.edu.iudigital.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.edu.iudigital.dominio.Vehiculo;
import co.edu.iudigital.servicios.VehiculoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;


@RestController
@RequestMapping("/vehiculo")
@Api(value="/vehiculo", tags= {"Vehiculo"})
@SwaggerDefinition(tags = {
		@Tag(name = "Vehiculo", description = "Gestion API parqueadero")
})

public class VehiculoController {

	@Autowired
	VehiculoService vehiculoService; 
	
	@PostMapping 
	public void regisVehiculo(@RequestBody Vehiculo vehiculo) {
	vehiculoService.regisVehiculo(vehiculo);	
	}
	
	@ApiOperation(value = "Lista los vehiculos",
			produces = "application/json",
			httpMethod = "GET")
	@GetMapping	
	public List<Vehiculo> listarVehiculos(){
		return vehiculoService.listarVehiculos();
		
	}

	
}


