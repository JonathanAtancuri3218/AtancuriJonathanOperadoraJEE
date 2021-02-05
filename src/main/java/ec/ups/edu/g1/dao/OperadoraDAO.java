package ec.ups.edu.g1.dao;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.g1.modelo.Operadora;


@Stateless
public class OperadoraDAO {
	
	@PersistenceContext
	private EntityManager em;

	
	public boolean insert(Operadora operadora) throws SQLException {
		em.persist(operadora);
		
		return true;
	}
	public boolean update(Operadora operadora) throws SQLException {
		em.merge(operadora);
		return true;
	}
	public Operadora read(int id){
		Operadora cliente=em.find(Operadora.class, id);
		return cliente;
	}
	public boolean delete(int id) throws SQLException {
		Operadora cliente= this.read(id);
		em.remove(cliente);
		return true;

	}
	public List<Operadora> getClientes(){
		String jpql="SELECT c FROM Operadora c WHERE numero=?1";
		
		Query q= em.createQuery(jpql, Operadora.class);
		q.setParameter(1,1);

		return (List<Operadora>)q.getResultList();
		
	}
	
}
