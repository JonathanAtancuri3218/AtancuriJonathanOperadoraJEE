package ec.ups.edu.g1.on;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.g1.dao.OperadoraDAO;
import ec.ups.edu.g1.modelo.Operadora;


@Stateless
public class GestionOperadoraON {

	
	@Inject
	private OperadoraDAO daoOperadora;
	public boolean guardarOperadora(Operadora operadora ) throws Exception {
		//Validaciones de cliente
		
		try {
			daoOperadora.insert(operadora);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registar cliente ");
		}
		
		return true;
	}
}
