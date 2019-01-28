package com.Recipe.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexcontroller {
	@RequestMapping({"","/","/index"})
public String getindexpage() {
	return "index";
}
}
