package com.capgemini.practicafinal.hijo.mvc.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * Clase de configuracion de DispatcherServlet de Spring MVC y del entorno de la aplicacion 
 * (lo podemos hacer tambin en el fichero web.xml)
 * 
 * A partir de la version 3.1 de Spring MVC tenemos que heredar de
 * AbstractAnnotationConfigDispatcherServletInitializer
 */

@Controller
public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * Devolucion de todas las clases de configuracion de componentes NO web de la
	 * App.
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { BackendConfig.class };
	}

	/*
	 * Devolucion de todas las clases de configuracion de componentes web de la App.
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { FrontendConfig.class };
	}

	/*
	 * Devolucion de todos los patrones de llamada (uno en este caso) asociados a
	 * DispatcherServlet de Spring MVC.
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
