package edu.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {

	@RequestMapping("/startboot")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "BOOT START");
		mv.setViewName("start");
		
		return mv;
	}
}
