package com.chhaichivon.crudspringhibernatevaadinpostgres;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrudSpringHibernateVaadinPostgresApplication.class);
	}

}
