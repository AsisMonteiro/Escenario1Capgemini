package com.capgemini.practicafinal.hijo.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * Clase de configuracion de Spring
 */
@Configuration
/*
 * Habilitar escaneo de componentes de Spring indicando el paquete base
 */

//AÑADO COMPONENTE DEL MODULO DE REST 
//com.capgemini.practicafinal.hijo.rest

//AÑADO COMPONENTE DEL MODULO DE MVC 
//com.capgemini.practicafinal.hijo.mvc

//AÑADO COMPONENTE DEL MODULO DE DATA
//com.capgemini.practicafinal.hijo.data

@ComponentScan(basePackages = { "com.capgemini.practicafinal.hijo.mvc", "com.capgemini.practicafinal.hijo.rest",
		"com.capgemini.practicafinal.hijo.data" })
public class BackendConfig {

}
