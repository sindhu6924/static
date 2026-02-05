package com.example.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/display")
	public  get() {
		return "hi sindhu | you can do it |last try";
	}

}
