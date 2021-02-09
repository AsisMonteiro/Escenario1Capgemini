package com.capgemini.practicafinal.hijo.mvc.webcontroladores;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.practicafinal.hijo.data.modelo.entidades.Categoria;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class SimpleController {

	private static final String URL = "http://localhost:8080/practicafinal/rest/categorias";

	/*
	 * Método de negocio del controlador
	 * 
	 * Atiende peticiones GET
	 * 
	 * Path relativo de la aplicacion /
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/")
	private ModelAndView mostrar() {

		// Categoria categoria = getCategoria(1);

		ModelAndView mv = new ModelAndView();

		// mv.addObject("nombre_categoria", categoria.getNombre());
		mv.addObject("nombre_categoria", "holi");
		mv.setViewName("index");

		return mv;
	}

	private static Categoria getCategoria(int codigo) {
		// Crear objeto para peticion al servicio
		WebTarget target = getWebTarget();

		String code = String.valueOf(codigo);

		// Recuperar respuesta como Categoria al servicio con la URL base + /code y
		// metodo GET
		Categoria categoria = target.path(code).request().accept(MediaType.APPLICATION_JSON).get(Categoria.class);

		return categoria;
	}

	private static void infoLista() throws JsonParseException, JsonMappingException, IOException {
		// Crear objeto para peticion al servicio
		WebTarget target = getWebTarget();

		// Recuperar respuesta como String al servicio con la URL base y metodo GET
		String response = target.request().accept(MediaType.APPLICATION_JSON).get(String.class);

		// Objeto para convertir cadena JSON en objeto Java
		ObjectMapper mapper = new ObjectMapper();

		List<Categoria> list = Arrays.asList(mapper.readValue(response, Categoria[].class));

		list.forEach(System.out::println);
	}

	private static WebTarget getWebTarget() {
		// Clase para configurar cliente Jersey a Servicio Rest
		ClientConfig config = new ClientConfig();

		// Crear cliente con la URL asociada mediante la configuracion
		Client client = ClientBuilder.newClient(config);

		// Devolver cliente
		return client.target(URL);
	}

}
