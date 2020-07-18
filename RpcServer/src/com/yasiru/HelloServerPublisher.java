package com.yasiru;

import javax.xml.ws.Endpoint;

public class HelloServerPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9564/hello", new HelloServerImpl());
	}
}
