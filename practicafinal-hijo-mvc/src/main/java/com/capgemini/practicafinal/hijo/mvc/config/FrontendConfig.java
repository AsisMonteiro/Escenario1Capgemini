package com.capgemini.practicafinal.hijo.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
 * Clase de configuracion de Spring
 */
@Configuration
/*
 * Habilitar el modulo Spring MVC (por defecto deshabilitado)
 */
@EnableWebMvc
/*
 * Habilitar escaneo de componentes de Spring indicando el paquete base
 */
@ComponentScan(basePackages = { "com.capgemini.practicafinal.hijo.mvc.webcontroladores" })
public class FrontendConfig {

	/*
	 * Metodo para devolucion de bean/compone destionado por el contenedor de Spring
	 * donde configuramos el objeto ViewResolver para asociar nombre logico de las
	 * vistas con ficheros fisicos
	 */
	@Bean
	public ViewResolver configurarViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		// Prefijo indicando la situacion fisica de las vistas
		resolver.setPrefix("/WEB-INF/vistas/");

		// Sufijo indicando extension del fichero de la vista
		resolver.setSuffix(".jsp");

		return resolver;
	}

}
