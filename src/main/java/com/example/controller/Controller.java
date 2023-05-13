package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Request;
import com.example.dao.Response;

@RestController
public class Controller {

	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	
	@PostMapping("/welcome")
    public ResponseEntity<Response> handleWelcomeRequest(@RequestBody Request request) {
        String username = request.getUsername();
        String action = request.getAction();

        if (action.equalsIgnoreCase("SEND_WELCOME_SMS")) {
            // Logic for sending SMS
            return new ResponseEntity<>(new Response("ok", "SMS Queued for sending"), HttpStatus.OK);
        } else if (action.equalsIgnoreCase("SEND_WELCOME_EMAIL")) {
            // Logic for sending email
            return new ResponseEntity<>(new Response("nok", "Email sending failed"), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
