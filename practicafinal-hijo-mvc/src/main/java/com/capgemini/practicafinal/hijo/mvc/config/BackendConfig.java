package com.capgemini.practicafinal.hijo.mvc.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

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

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();

		/*
		 * Cargar la unidad de persistencia del fichero persistence.xml
		 * 
		 * jpa-mysql => MySQL
		 * 
		 * jpa-h2 => H2
		 */
		factory.setPersistenceUnitName("jpa-mysql" /* "jpa-h2" */);

		return factory;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager txManager = new JpaTransactionManager();

		txManager.setEntityManagerFactory(entityManagerFactory);

		return txManager;
	}

}
