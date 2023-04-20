package com.sk;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restcore")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		System.out.print("Text");
		return "Hello Boss";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String hello2() {
		System.out.print("HTML");
		return "<h1>Hello Boss</h1>";
	}

}
