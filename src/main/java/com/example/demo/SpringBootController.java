package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringBootController {

	@RequestMapping("/hello")
	public ModelAndView first_boot() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "스프링부트에서 전송한 메시지");
		mav.setViewName("hello_boot");
		return mav;
	}
}
