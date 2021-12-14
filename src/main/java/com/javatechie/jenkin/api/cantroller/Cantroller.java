package com.javatechie.jenkin.api.cantroller;

import javax.annotation.PostConstruct;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cantroller {
	
	@PostMapping(value="hello",produces = "application/json")
	public String testing() {
		
		JSONObject jsonobject=new JSONObject();
	
		
		jsonobject.put("status", "Ok");
		jsonobject.put("message", "printed");
		
		return jsonobject.toString() ;
	}
	
}