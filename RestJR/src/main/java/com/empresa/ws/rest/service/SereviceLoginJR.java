package com.empresa.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.empresa.ws.rest.vo.VOUsuario;


@Path("/Java")
public final class SereviceLoginJR {
	
	@POST
	@Path("/validaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario vo){
		vo.setUserValido(false);
		if(vo.getUsuario().equals("admin") && vo.getPassword().equals("admin")){
			vo.setUserValido(true);
		}
		
		vo.setPassword("##########################");
		return vo;
	}
	
}
