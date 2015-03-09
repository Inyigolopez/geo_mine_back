package com.geoblink.clientStore.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geoblink.clientStore.service.IClientStoreService;

@RestController
@RequestMapping("/clientData")
public class ClientStoreRestService {
	
	private IClientStoreService service;

	public IClientStoreService getService() {
		return service;
	}

	public void setService(IClientStoreService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/store/{param}", method=RequestMethod.GET,produces={"application/json"})
    public @ResponseBody String getAqui(@PathVariable String param) {
        return service.storeClientData(param);
    }


}
