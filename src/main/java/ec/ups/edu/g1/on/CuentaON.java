package ec.ups.edu.g1.on;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.metamodel.ListAttribute;

import ec.ups.edu.g1.dao.CuentaDAO;
import ec.ups.edu.g1.modelo.Cuenta;
import ec.ups.edu.g1.modelo.Usuario;



@Stateless
public class CuentaON {
	@Inject
	private CuentaDAO cdao;
	@Inject
	private UsuarioON usuarioOn;
	@Inject
	private TransaccionON transaccionON;
	
	
	public Cuenta BuscarCuenta(String cuenta) {
		return cdao.consultarCuenta(cuenta);
	}
	/**
	 * Metodo para generar el numero de Cuenta aleatoriamente
	 * 
	 * @return retorna el numero de cuenta en cadena de texto
	 */
	public String generarNumeroCuenta() {
		char[] chars = "0123456789".toCharArray();
		int charsLength = chars.length;
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			buffer.append(chars[random.nextInt(charsLength)]);
		}
		System.out.println("cuenta " + buffer.toString());
		return buffer.toString();
	}

	/**
	 * Metodo para crear cuenta, recibe como parametro el objeto cuenta
	 * @param cuenta
	 */
	public void crearCuenta(Cuenta cuenta) {
		cdao.crearCuenta(cuenta);
	}
	
	/**
	 * Metodo para actualizar cuenta, recibe como parametro el objeto cuenta
	 * @param cuenta
	 */
	public void actualizarCuenta(Cuenta cuenta) {
		cdao.actualizarCuenta(cuenta);
	}
	
	
	}
	
	
	

