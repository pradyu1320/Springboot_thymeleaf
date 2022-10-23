package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("/")
	public String welcome(Map<String,Object> model) {
		try {
			Map<String,String> sampleDropdownMap = new HashMap<String,String>();
			sampleDropdownMap.put("Java","java");
			sampleDropdownMap.put("PHP","php");
			model.put("dropDownItems",sampleDropdownMap);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "welcome";
	}
}
