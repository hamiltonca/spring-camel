package com.compucafe.casp.con

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
/**
 * HtmlController <br/>
 * This controller requires a user id to be supplied on the path.
 * It extracts the userId variable from the path and places it in the Spring
 * MVC Model object and the String 'hello' is returned. This causes the Spring
 * view resolver to lookup the /WEB-INF/jsp/hello.jsp and forward the request to this
 * jsp page for view resolution.
 * 
 */
@Controller
class HtmlController {
	
	@RequestMapping(value='/hello/{user}', method=RequestMethod.GET, produces='text/html') 
	public String sayHello(@PathVariable String user, Model model) {
		model.addAttribute('userId', user)
		return 'hello'
	}
}
