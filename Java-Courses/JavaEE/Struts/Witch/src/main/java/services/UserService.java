package services;

import dao.implementation.UserDaoImpl;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Context;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import models.User;

@Path("/user")
public class UserService {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response post(@Context HttpHeaders httpHeaders, User user) {
		UserDaoImpl udi = new UserDaoImpl();
		udi.create(user);
		return Response.ok(user).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response put(@Context HttpHeaders httpHeaders, User user) {
		UserDaoImpl udi = new UserDaoImpl();
		udi.update(user);
		return Response.ok(user).build();
	}

}
