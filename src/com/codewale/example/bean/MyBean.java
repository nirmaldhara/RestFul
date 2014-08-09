package com.codewale.example.bean;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;

public class MyBean {
	  @FormParam("myData")
	   private String data;

	   public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@HeaderParam("myHeader")
	   private String header;

	   @PathParam("id")
	   public void setempbyId(String id) {}
}
