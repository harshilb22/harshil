package com.sapient.beans;

import org.apache.log4j.Logger;

public class helloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Logger log = Logger.getLogger("sapient");
		log.trace("trace1");
		log.debug("debug1");
		log.info("info1");
		log.warn("warn1");
		log.error("error1");
		log.fatal("fatal1");
		log.trace("trace2");
		log.debug("debug2");
		log.info("info2");
		log.warn("warn2");
		log.error("error2");
		log.fatal("fatal2");
	}

}
