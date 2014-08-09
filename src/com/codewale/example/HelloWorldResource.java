package com.codewale.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.codewale.example.bean.MyBean;

@Path("/MyRESTApplication")
public class HelloWorldResource {

	@GET()
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/empDetails")
	public String getDetails() {
		ObjectMapper mapper = new ObjectMapper();
		Map <String,String>empMap=new HashMap<String,String>();
		empMap.put("name", "abc");
		empMap.put("age", "30");
		
		try {
			System.out.println("Response values is ::::;"+mapper.writeValueAsString(empMap));
			//return "{\""+root+"\":{"+mapper.writeValueAsString(data)+"}}";
			return mapper.writeValueAsString(empMap);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
//////////////////////***************************************************************//////////////////////////////////////////////////////////////////////////
/////////////////////*///////////////////@BeanParam Example///////////////////////////////////////////////////
@POST()
@Produces(MediaType.APPLICATION_JSON)
@Path("/addDetailsbean")
public String postDetailsBean(@BeanParam MyBean myBean){


ObjectMapper mapper = new ObjectMapper();
Map <String,String>empMap=new HashMap<String,String>();
empMap.put("data", myBean.getData());
empMap.put("header",  myBean.getHeader());

try {
System.out.println("Response values is ::::;"+mapper.writeValueAsString(empMap));
//return "{\""+root+"\":{"+mapper.writeValueAsString(data)+"}}";
return mapper.writeValueAsString(empMap);
} catch (JsonGenerationException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (JsonMappingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}
	//////////////////////***************************************************************//////////////////////////////////////////////////////////////////////////
	/////////////////////*///////////////////@QueryParam Example///////////////////////////////////////////////////
	@POST()
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addDetails")
	public String postDetails(@QueryParam("name") String name, @QueryParam("age") String age){
		

		ObjectMapper mapper = new ObjectMapper();
		Map <String,String>empMap=new HashMap<String,String>();
		empMap.put("name", name);
		empMap.put("age",  age);
		
		try {
			System.out.println("Response values is ::::;"+mapper.writeValueAsString(empMap));
			//return "{\""+root+"\":{"+mapper.writeValueAsString(data)+"}}";
			return mapper.writeValueAsString(empMap);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
//////////////////////***************************************************************//////////////////////////////////////////////////////////////////////////
/////////////////////*///////////////////@QueryParam Example///////////////////////////////////////////////////
@GET()
@Produces(MediaType.APPLICATION_JSON)
@Path("/getDetailsbyid/{id}")
public String getEmpById(@PathParam("id") String id){


ObjectMapper mapper = new ObjectMapper();
Map <String,String>empMap=new HashMap<String,String>();
empMap.put("name", "abcd");
empMap.put("age",  "30");
empMap.put("id",  id);

try {
System.out.println("Response values is ::::;"+mapper.writeValueAsString(empMap));
//return "{\""+root+"\":{"+mapper.writeValueAsString(data)+"}}";
return mapper.writeValueAsString(empMap);
} catch (JsonGenerationException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (JsonMappingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}
//////////////////////***************************************************************//////////////////////////////////////////////////////////////////////////
/////////////////////*///////////////////@@HeaderParam Example///////////////////////////////////////////////////
@GET()
@Produces(MediaType.APPLICATION_JSON)
@Path("/getDetails/{dept}")
public String getEmpByDEP(@HeaderParam("id") String id){


ObjectMapper mapper = new ObjectMapper();
Map <String,String>empMap=new HashMap<String,String>();
empMap.put("name", "abcd");
empMap.put("age",  "30");
empMap.put("id",  id);

try {
System.out.println("Response values is ::::;"+mapper.writeValueAsString(empMap));
//return "{\""+root+"\":{"+mapper.writeValueAsString(data)+"}}";
return mapper.writeValueAsString(empMap);
} catch (JsonGenerationException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (JsonMappingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}
}
