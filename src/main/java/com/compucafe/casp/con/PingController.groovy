package com.compucafe.casp.con

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import groovy.util.logging.Slf4j
@Slf4j
@RestController
class PingController {
	@Value ('${aValue:NOT_SET}')
	String aValue
	@RequestMapping(value='/ping', produces='text/plain')
	public String ok () {
		log.debug("ok: we're in. aValue: ${aValue}")
		'Spring OK\n'
	}
}
