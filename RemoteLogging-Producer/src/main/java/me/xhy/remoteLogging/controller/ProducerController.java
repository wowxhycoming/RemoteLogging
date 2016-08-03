package me.xhy.remoteLogging.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.xhy.remoteLogging.producer.LogProducer;

@Controller
public class ProducerController {
	
	@RequestMapping(value="/launchLogProducer", method=RequestMethod.GET)
	@ResponseBody
	public String launchProducer() {
		
		LogProducer logProducer = new LogProducer();
		logProducer.printLogUseLogger();
		
		return "1";
		
	}

	@RequestMapping(value="/launchLogProducer/{params}", method=RequestMethod.GET)
	@ResponseBody
	public String launchProducer(@PathVariable String params) {
		
		LogProducer logProducer = new LogProducer();
		logProducer.printLogUseLogger(params);
		
		return params;
		
	}
	
}
