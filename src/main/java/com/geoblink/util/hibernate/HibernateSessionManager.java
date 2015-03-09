package com.geoblink.util.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateSessionManager {
	
	private static HibernateSessionManager instance;
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

    static {
        try {
        	Configuration configuration = new Configuration().configure();
        	serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static HibernateSessionManager getHibernateSessionManager() {
    	if (instance == null) {
    		instance = new HibernateSessionManager();
    	}
    	return instance;
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
