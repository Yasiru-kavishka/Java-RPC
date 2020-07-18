package com.yasiru;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloClient {

	public static void main(String[] args) {
		 
		try {
 
			URL url = new URL("http://127.0.0.1:9564/hello?wsdl");
			QName qname = new QName("http://yasiru.com/", "HelloServerImplService");
 
			Service service = Service.create(url, qname);
 
			HelloServer helloServer = service.getPort(HelloServer.class);
			String name = "Yasiru Kavishka";
			System.out.println(helloServer.hello(name));
 
		} catch (Exception e) {
			e.printStackTrace();
		}
 
	}
}
