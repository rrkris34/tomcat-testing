package com.tomcat.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
	String n[]= {"James","Sharan","Hari","Ramesh","Vijay","Suresh","Raghavendra"};
  @GetMapping("/greet")
  public String greet() {
	  return "Hi!!! Spring boot is running - Jenkin webhook testing";
  }
  
  @GetMapping("/greet2")
  public String greet2() {
	  return "Hi!!! Spring boot2 is running ..New Change";
  }
  @GetMapping("/people")
  public String[] people() {
	  return n;
  }
  
}
