package co.edu.iudigital.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dominio.Vehiculo;
import co.edu.iudigital.repositorios.VehiculoRepository;

@Service
public class VehiculoService {
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	
	public void regisVehiculo(Vehiculo vehiculo) { // colocamos requestBody para enviar en el cuerpo el objeto de tipo vehiculo
		vehiculoRepository.save(vehiculo);
	}
	
	
	public List<Vehiculo> listarVehiculos(){
	List<Vehiculo>  vehiculos = (List<Vehiculo>) vehiculoRepository.findAll();
	return vehiculos;	
	}

}
