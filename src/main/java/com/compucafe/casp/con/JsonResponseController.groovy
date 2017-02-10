package com.compucafe.casp.con

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import groovy.json.JsonBuilder

@Controller
class JsonResponseController {

	@RequestMapping (value='/json', produces='application/json', method = [RequestMethod.GET,RequestMethod.POST] )
	@ResponseBody String getJsonMessage(){
		JsonBuilder bldr = new JsonBuilder()
		bldr {
			message  'Hello world'
			mapData {
				item  'hello'
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
		}
		//String retVal = '{ "message":"Hello world" }'
		return bldr.toPrettyString()
	}
}
