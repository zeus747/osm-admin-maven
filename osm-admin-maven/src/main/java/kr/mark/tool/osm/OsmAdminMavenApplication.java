package kr.mark.tool.osm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OsmAdminMavenApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OsmAdminMavenApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OsmAdminMavenApplication.class, args);
	}

}
