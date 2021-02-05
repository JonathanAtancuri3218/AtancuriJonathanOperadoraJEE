package ec.ups.edu.g1.servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.ups.edu.g1.modelo.Cuenta;
import ec.ups.edu.g1.modelo.Operadora;
import ec.ups.edu.g1.on.CuentaON;
import ec.ups.edu.g1.on.GestionOperadoraON;


@Path("/operador")
public class ServicioRest {
	
	@Inject
	private GestionOperadoraON goperadora;
	
	@Inject
	private CuentaON gcuenta;



@POST
@Path("/guardar")
@Produces("application/json")
@Consumes("application/json")
public Mensaje GuardarOperadora(Operadora operadora) {
	
	Mensaje m=new Mensaje();
	try {
		goperadora.guardarOperadora(operadora);
		m.setCode("ok");
		m.setMessage("Actualizado correctamente");
		
	}catch(Exception e){
		//e.printStackTrace();
		m.setCode("ERROR");
		m.setMessage("Error al actualizar registro");
	}
	return m;
	
}

@POST
@Path("/crearCuenta")
@Produces("application/json")
@Consumes("application/json")
public Mensaje CrearCuenta(Cuenta c) {
	
	Mensaje m=new Mensaje();
	try {
		gcuenta.crearCuenta(c);
		m.setCode("ok");
		m.setMessage("Guardado correctamente");
		
	}catch(Exception e){
		//e.printStackTrace();
		m.setCode("ERROR");
		m.setMessage("Error al guardar registro");
	}
	return m;
	
}


}
