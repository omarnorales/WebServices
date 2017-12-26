package com.empresa.ws.rest.service;

import com.empresa.ws.rest.vo.VOUsuario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class RestClientJR {
	
	public static void main(String[] args) {
		String urlWebService = "http://localhost:8080/RestJR/services/Java/validaUsuario";
		System.out.println("######## Invoke Rest Service:[ " + urlWebService + "]");
		VOUsuario vo = new VOUsuario();
		vo.setUsuario("admin");
		vo.setPassword("admin");
		vo.setUserValido(false);
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(urlWebService);
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, vo);
		vo = response.getEntity(VOUsuario.class);
		System.out.println("######## COMIENZA RESPUESTA ########");
		System.out.println("######## Response: [Usuario: "+vo.getUsuario()+"]");
		System.out.println("######## Response: [Usuario: "+vo.isUserValido()+"]");
				
	}

}
