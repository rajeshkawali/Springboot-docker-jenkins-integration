package com.rajeshkawali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.model.DockerModel;
import com.rajeshkawali.service.DockerService;

@RestController
public class DockerController {

	@Autowired
	private DockerService dockerService;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("DockerController.home()");
		return "Hello Docker";
	}

	@GetMapping("/get")
	public DockerModel getDetails() {
		System.out.println("DockerController.getDetails()");		
		return dockerService.getDetails();
	}
}
