package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value="/req1/{a}/{b}", method=RequestMethod.GET)
	public String m1(@Pathvariable String a,@Pathvariable String b) {
			return "hello req1"+a1+"  "+b1;
	}
	
	@RequestMapping(value="/req2", method=RequestMethod.GET)
	public String m2() {
			return "hello req2";
	}
	
	@RequestMapping(value="/req3", method=RequestMethod.GET)
	public String m3() {
			return "hello req3";
	}
}
