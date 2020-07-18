package com.yasiru;

import javax.jws.WebService;

@WebService(endpointInterface = "com.yasiru.HelloServer")
public class HelloServerImpl implements HelloServer {

	@Override
	public String hello(String name) {
		return "Hello " + name + "!, Welcome to RPC.";
	}	
}
