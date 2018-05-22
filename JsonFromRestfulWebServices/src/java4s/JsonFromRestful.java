package java4s;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/customers")
public class JsonFromRestful {
	
	@POST
	@Path("/pick")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response produceCustomerDetailsinJSON(Customer c) {

		Response dt = new Response();
		int result1 = c.getId()+ c.getId1();
		System.out.println(result1);
		
		dt.setResult(result1);
		
		
		return dt;
		
	}
}