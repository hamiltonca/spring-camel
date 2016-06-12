package com.compucafe.casp.con

import groovy.json.JsonBuilder

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class JsonResponseController {

	@RequestMapping (value="/json", produces="application/json", method = RequestMethod.POST)
	String getJsonMessage(){
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
