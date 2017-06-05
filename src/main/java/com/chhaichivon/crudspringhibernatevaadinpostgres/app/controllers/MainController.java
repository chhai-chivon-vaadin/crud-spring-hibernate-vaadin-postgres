package com.chhaichivon.crudspringhibernatevaadinpostgres.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */

@Controller
public class MainController {

	@RequestMapping(value = "/home")
	public String home(){
		System.out.print("Home Work");
		return "index";
	}

}
