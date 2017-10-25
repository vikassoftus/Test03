package com.centrica.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class HttpService2 {

	@RequestMapping(value="/httpapp2",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> getGreeting() {
		return new ResponseEntity<String>(new String("Hello from service 2") , HttpStatus.OK);
	}
}
