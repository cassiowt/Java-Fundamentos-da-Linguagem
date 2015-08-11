package com.targettrust.interfaces;
import java.util.Collection;
import javax.management.Query;
import com.target.dados.Cliente;

public class GenericDAOImplementa implements GenericDAO<Cliente>{
	@Override
	public void persist(Cliente parametroEntity) {
		// TODO Auto-generated method stub
	}
	@Override
	public void merge(Cliente parametroEntity) {
		// TODO Auto-generated method stub
	}
	@Override
	public void remove(Cliente parametroEntity) {
		// TODO Auto-generated method stub
	}
	@Override
	public Collection<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Query createQuery(String parametroQuery,
			Object... parametroParameters) {
		// TODO Auto-generated method stub
		return null;
	}
}
