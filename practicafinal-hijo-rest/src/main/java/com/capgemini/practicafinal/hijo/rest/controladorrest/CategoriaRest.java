package com.capgemini.practicafinal.hijo.rest.controladorrest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.practicafinal.hijo.data.modelo.entidades.Categoria;
import com.capgemini.practicafinal.hijo.mvc.servicios.CategoriaService;

/*
 * URL completa para acceder a este servicio
 * 
 * http://localhost:8585 (Tomcat)
 * /ws-rest (URI Applicacion)
 * /rest Servlet de Jersey
 * /categorias (Servico Rest)
 * 
 * http://localhost:8585/ws-rest/rest/categorias
 */
@Path("/categorias")
public class CategoriaRest {

	@Autowired
	CategoriaService categoriaService;

	// private CategoriaDAO dao = CategoriaDAOImpl.getInstance();

	/*
	 * Peticion GET para http://localhost:8585/practicafinal/rest/categorias
	 * 
	 * Enviamos lista de categorias con formato JSON @Produces
	 * 
	 * Codigo HTTP respuesta 200
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categoria> lista() {
		return categoriaService.getAll();
	}

	/*
	 * Peticion POST para http://localhost:8585/ws-rest/rest/categorias
	 * 
	 * Recibimos categoria en formato JSON @Consumes
	 * 
	 * Devolvemos respuesta con Codigo HTTP respuesta 201 y la URI donde se
	 * encuentra el nuevo elemento para consulta
	 */
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * METODO>>>>>>>
	 * 
	 * 
	 * @POST
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) public Response add(Categoria
	 * categoria) throws URISyntaxException {
	 * 
	 * int nuevoCodigo = categoriaService.add(categoria);
	 * 
	 * URI uri = new URI("/categorias/" + nuevoCodigo);
	 * 
	 * return Response.created(uri).build(); }
	 */

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Peticion PUT para http://localhost:8585/ws-rest/rest/categorias/codigo
	 * 
	 * Recibimos categoria en formato JSON @Consumes
	 * 
	 * Enlazamos de la URL codigo con el primer parametro (code)
	 * 
	 * Devolvemos respuesta con Codigo HTTP respuesta 200 y la URI donde se
	 * encuentra el nuevo elemento para consulta
	 */

	/*
	 * @PUT
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Path("{codigo}") public Response edit(@PathParam("codigo") int code,
	 * Categoria categoria) {
	 * 
	 * categoria.setIdCategoria(code);
	 * 
	 * if (categoriaService.edit(categoria)) { return Response.ok().build(); }
	 * 
	 * return Response.notModified().build(); }
	 */

	/*
	 * Peticion DELETE para http://localhost:8585/ws-rest/rest/categorias/codigo
	 * 
	 * Enlazamos de la URL codigo con el primer parametro (code)
	 * 
	 * Devolvemos respuesta con Codigo HTTP respuesta 200 y la URI donde se
	 * encuentra el nuevo elemento para consulta
	 */

	/*
	 * @DELETE
	 * 
	 * @Path("{codigo}") public Response remove(@PathParam("codigo") int code) {
	 * 
	 * if (categoriaService.delete(code)) { return Response.ok().build(); }
	 * 
	 * return Response.notModified().build(); }
	 */

	/*
	 * Peticion GET para http://localhost:8585/ws-rest/rest/categorias/codigo
	 * 
	 * Enlazamos de la URL codigo con el primer parametro (code)
	 * 
	 * Devolvemos objeto Categoria dentro del cuerpo de la respuesta con Codigo HTTP
	 * respuesta 200
	 */

	/*
	 * @GET
	 * 
	 * @Path("{codigo}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Response
	 * item(@PathParam("codigo") int code) {
	 * 
	 * Categoria categoria = categoriaService.getById(code);
	 * 
	 * if (categoria != null) { return Response.ok(categoria,
	 * MediaType.APPLICATION_JSON).build(); }
	 * 
	 * return Response.status(Response.Status.NOT_FOUND).build(); }
	 */
}
