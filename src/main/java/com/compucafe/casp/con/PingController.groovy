package com.compucafe.casp.con

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {

	@RequestMapping(value='/ping', produces='text/plain')
	public String ok () {
		'Spring OK\n'
	}
}
