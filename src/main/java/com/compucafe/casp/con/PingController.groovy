package com.compucafe.casp.con

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.convert.ConversionService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

import groovy.util.logging.Slf4j

/**
 * PingContoller <br/>
 * A simple Text controller that returns a text string
 * as the HTTP response.
 * 
 * Note that part of this the controllers demonstration is the 
 * property replacement used with the @Value annotations.
 * 
 * Values are replaced using the spring-camel.properties file in src/main/resources.
 * 
 */

@Slf4j
@Controller
class PingController {
	
	@Value('${aStrValue:NOT_SET}')
	String aStrValue
  
  @Value('${anIntValue:-1}')
  private int anIntValue = 0

  @Autowired ConversionService defaultConversionService
  
	@RequestMapping(value='/ping', produces='text/plain')
	public @ResponseBody String ok (Model model) {
		log.debug("ok: we're in. aStrValue: ${aStrValue}, ")
		return "Spring OK, aStrValue: [${aStrValue}], anIntValue: [${anIntValue}] \n".toString()
    
	}
}
