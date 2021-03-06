package com.marv.persistence.core;

public class PersistenceFacade implements Cloneable {

	/**
	 * An instance of PersistenceFacade object.
	 */
	private static PersistenceFacade instance;
	
	private static MapperFactory mapperFactory;
	
	private PersistenceFacade() {
		// private constructor prevents instantiation by untrusted callers
		mapperFactory = new MapperFactory();
	}
	
	/**
	 * Creates and returns PersistenceFacade instance.
	 * 
	 * @return instance of PersistenceFacade.
	 */
	public static synchronized PersistenceFacade getInstance() {
		if(instance == null) {
			instance = new PersistenceFacade();
		}
		return instance;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public Object find(long id, Class<?> domainClassName) {
		return mapperFactory.getMapper(domainClassName).find(id);
	}
	
	/**
	 * Inserts the domain object provided in the parameter into the database.
	 * 
	 * @param domainObject	domain object to be saved.
	 * @return				the id of the last inserted row.
	 */
//	public long insert(Object domainObject) {
//		return mapperFactory.getMapper(domainObject).insert(domainObject);
//	}
	
	/**
	 * Updates the database record corresponding to the domain object provided in the parameter.
	 * 
	 * @param domainObject	domain object to be saved.
	 * @return				quantity of rows updated.
	 */
//	public int update(Object domainObject) {
//		return mapperFactory.getMapper(domainObject).update(domainObject);
//	}
	
	/**
	 * Deletes the domain object provided in the parameter from the database.
	 * 
	 * @param domainObject	domain object to be deleted.
	 * @return				quantity of rows deleted.
	 */
//	public int delete(Object domainObject) {
//		return mapperFactory.getMapper(domainObject).delete(domainObject);
//	}
}
