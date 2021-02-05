package ec.ups.edu.g1.on;

import java.util.List;

import javax.ejb.Local;

import ec.ups.edu.g1.modelo.Cuenta;
import ec.ups.edu.g1.modelo.Transaccion;
import ec.ups.edu.g1.modelo.Usuario;


public interface GestionOperadoraLocal {
	
	public void guardarTransaccion(Cuenta cuenta,double monto,String tipo);
	public void crearCliente(Usuario usuario);
	public List<Transaccion> ListarTipoMovimiento(String tipoMov, String cuenta);
	public void crearCuenta(Cuenta cuenta);

}
