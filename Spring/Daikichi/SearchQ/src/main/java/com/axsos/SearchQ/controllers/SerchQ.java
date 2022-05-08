
package com.axsos.SearchQ.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerchQ {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery,@RequestParam(value="l_name", required=false) String lastName ,@RequestParam(value="times", required=false) int times){
		if (searchQuery==null) {
			return "Hello Human";
		}
		else {
		
       String RepName= "Hello Human: " + searchQuery +lastName +"/////////// ";
       return RepName.repeat(times);
    }
	
	}
}
	