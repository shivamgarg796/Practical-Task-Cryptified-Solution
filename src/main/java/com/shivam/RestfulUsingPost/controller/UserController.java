package com.shivam.RestfulUsingPost.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.RestfulUsingPost.exception.NullException;
import com.shivam.RestfulUsingPost.services.ResponsePojo;
import com.shivam.RestfulUsingPost.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(path = "/users/{num}/{type}")
	public ResponseEntity<ResponsePojo> getArray(@PathVariable("num") int num, @PathVariable("type") String order){
		
		List<Integer> arrayList=userService.giveArray(num, order);
		
//		if(arrayList==null){
//			
//			throw new NullException("invalid order order must be 'ASC' OR 'DESC' OR SIZE OF ARRAY IS NOT 0" );
//			return new ResponseEntity<>(new ResponsePojo(HttpStatus.NOT_ACCEPTABLE.valueOf(order),"not succes",null),HttpStatus.NOT_ACCEPTABLE);
//		}
		
		
		
		
        return new ResponseEntity<>(new ResponsePojo(HttpStatus.OK.value(), "success", arrayList),HttpStatus.OK);


	}
}
