package com.ms.controllers;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class ClientController {
	HashMap<String,String> map=new HashMap<String,String>();
	

    public ClientController() {
		super();
		map.put("add","+");
		map.put("sub","-");
		map.put("mul","*");
		map.put("div","/");
	}

	@GetMapping("/")
    public String home() {
        return "input";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam int a,
            @RequestParam int b,
            @RequestParam String operation,
            Model model) {

        String url = "http://localhost:8080/api/" + operation + "?a=" + a + "&b=" + b;

        RestTemplate restTemplate = new RestTemplate();
        int result = restTemplate.postForObject(url, null, Integer.class);
        String strres=a+" "+map.get(operation)+" "+b+" = "+result;

        model.addAttribute("result", strres);

        return "input";
    }
}