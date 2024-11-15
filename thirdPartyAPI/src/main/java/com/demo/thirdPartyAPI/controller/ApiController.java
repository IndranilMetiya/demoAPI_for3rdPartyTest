package com.demo.thirdPartyAPI.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.thirdPartyAPI.cmplexJsonfiller.OrderSetup;
import com.demo.thirdPartyAPI.complexJson.Order;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	
	@GetMapping("/books/{bookId}")
    public ResponseEntity<Map<String, Object>> getBookDetails(@PathVariable String bookId, @RequestParam(required = false) String type) {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> book = new HashMap<>();
        
        book.put("id", 1);
        book.put("name", "phycology on money");
        book.put("author", "Craig Walls");
        
        
        if ("detailed".equals(type)) {
            Map<String, Object> details = new HashMap<>();
            details.put("pages", 400);
            details.put("publisher", "Manning Publications");
            book.put("details", details);
        }
        
        response.put("book", book);
        return ResponseEntity.ok(response);
    }
	
	@GetMapping("/employees/{empId}")
    public ResponseEntity<Map<String, Object>> getEmployeeDetails(@PathVariable String empId, @RequestParam(required = false) String department) {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> employee = new HashMap<>();
        
        employee.put("id", empId);
        employee.put("name", "John Doe");
        employee.put("position", "Software Engineer");
        
        if ("IT".equalsIgnoreCase(department)) {
            Map<String, Object> details = new HashMap<>();
            details.put("skills", Arrays.asList("Java", "Spring Boot", "Microservices"));
            details.put("experience", 5);
            employee.put("details", details);
        }
        
        response.put("employee", employee);
        return ResponseEntity.ok(response);
    }
	
	@GetMapping("/Order")
	public ResponseEntity<Order> getOrderDetails(){
		OrderSetup orderSetup=new OrderSetup();
		return ResponseEntity.ok(orderSetup.createOrder());
	}
	

}
