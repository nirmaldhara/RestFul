package com.codewale.example.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;





public class AccessFilter implements ContainerResponseFilter {


	@Override
	public void filter(ContainerRequestContext arg0,
			ContainerResponseContext arg1) throws IOException {
		// TODO Auto-generated method stub
		arg1.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
		arg1.getHeaders().putSingle("Access-Control-Allow-Credentials", "true");
		arg1.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
		arg1.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");

		
	}
}