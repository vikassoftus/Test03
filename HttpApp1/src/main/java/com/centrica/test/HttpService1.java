package com.centrica.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/")
public class HttpService1 {

	@RequestMapping(value="/httpapp1",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> callSecondService() {
		RestTemplate client = new RestTemplate();
		String message = client.getForObject("http://localhost:8082/httpapp2", String.class);
		return new ResponseEntity<String>("Service1 called Service2 and get the message:" + message , HttpStatus.OK);
	}
}
