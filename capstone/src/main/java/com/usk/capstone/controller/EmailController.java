/*package com.usk.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usk.capstone.dto.EmailDto;
import com.usk.capstone.service.EmailService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendmail")
	public String sendMail(@RequestBody EmailDto emailDto) {
	    String emailSentStatus = emailService.sendMail(emailDto);
	    return emailSentStatus;
	  }
}
*/