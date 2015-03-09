package com.geoblink.clientStore.service.impl;

import com.geoblink.clientStore.dao.IClientStoreDAO;
import com.geoblink.clientStore.service.IClientStoreService;

public class ClientStoreService implements IClientStoreService {
	
	private IClientStoreDAO dao;

	public IClientStoreDAO getDao() {
		return dao;
	}

	public void setDao(IClientStoreDAO dao) {
		this.dao = dao;
	}

	@Override
	public String storeClientData(String param) {
		return dao.saveClientStore(param);
	}

}
