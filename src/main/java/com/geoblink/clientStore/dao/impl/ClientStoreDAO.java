package com.geoblink.clientStore.dao.impl;

import org.hibernate.Session;

import com.geoblink.clientStore.service.IClientStoreService;
import com.geoblink.clientStore.dao.IClientStoreDAO;
import com.geoblink.clientStore.pojo.ClientStore;
import com.geoblink.util.hibernate.HibernateSessionManager;

public class ClientStoreDAO implements IClientStoreDAO {

	@Override
	public String saveClientStore(String param) {
		
		Session session = HibernateSessionManager.getSessionFactory().getCurrentSession();
		
		try {
	        session.beginTransaction();
			
	        ClientStore cs = new ClientStore();
	        cs.setName(param);
	        cs.setIdBrand(1);
	        cs.setIdCompany(1);
	        session.save(cs);
	        
	        session.getTransaction().commit();
	        return "Guardado desde DAO";
		}
		
		catch (Exception e) {
			session.getTransaction().rollback();
			throw e;
		}
	}

}
