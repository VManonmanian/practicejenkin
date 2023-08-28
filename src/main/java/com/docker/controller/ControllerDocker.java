package com.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDocker {
	@RequestMapping("/message")
	public String getMessage() {
		return "hello";
	}
}
