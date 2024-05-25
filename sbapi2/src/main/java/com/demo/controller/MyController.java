package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController ()
public class MyController {
		@RequestMapping(value= "/req1", method=RequestMethod.GET)
		public String m1() {
			System.out.println("we are in m1 method");
			return "hello";
		}
}
