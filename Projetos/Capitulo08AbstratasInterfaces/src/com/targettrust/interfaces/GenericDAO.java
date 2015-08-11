package com.targettrust.interfaces;

import java.util.Collection;

import javax.management.Query;

public interface GenericDAO<T> {
	void persist(T entity);
	 
    void merge(T entity);
 
    void remove(T entity);
 
    Collection<T> findAll();
     
    Query createQuery(String query, Object... parameters);
}
