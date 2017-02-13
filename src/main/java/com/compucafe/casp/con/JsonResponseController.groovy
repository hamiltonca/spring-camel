package com.compucafe.casp.con

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import groovy.json.JsonBuilder
/**
 * JsonResponseController <br/>
 * Returns a simple JSON respone using a JsonBuilder using a closure.
 * 
 */
@Controller
class JsonResponseController {

  @Value('${aStrValue:initialized by controller.}')
  String aStrValue
  @Value('${anIntValue:0}')
  Integer anIntValue = -1 
  
	@RequestMapping (value='/json', produces='application/json', method = [RequestMethod.GET,RequestMethod.POST] )
	@ResponseBody String getJsonMessage(){
		JsonBuilder bldr = new JsonBuilder()
		bldr {
			message  'Hello world'
			mapData {
				item  'hello'
        itemDescription aStrValue 
			}
			anotherMap {
				something 'anothervalue'
				somethingelse  'blaghblaghblagh'
				embeddedArray (
					'one',
					'two',
					'three'
					)
			}
			anotherArray (
				'AAA',
				'BBB',
				'CCC'
				)
      'anIntValue' anIntValue
		}
		return bldr.toPrettyString()
	}
}
