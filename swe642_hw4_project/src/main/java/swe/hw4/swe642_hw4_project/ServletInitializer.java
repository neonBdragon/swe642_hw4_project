/*
 * Brandon Mack, Qingyang Dai
 * */

package swe.hw4.swe642_hw4_project;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//Spring Boot Servlet to handle SQL and backend communication

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Swe642Hw4ProjectApplication.class);
	}

}
