package com.example.hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 public class HelloContoroller {
	@RequestMapping(value = "/hello")
	public String index(Model model) {
		String view = "Hello World";
		model.addAttribute("message", view);

			return "index";
	}
}
	


