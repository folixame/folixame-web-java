/**
 * 
 */
package me.folixa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import me.folixa.model.ProductsList;
import me.folixa.ws.merchandise.Category;
import me.folixa.ws.merchandise.Image;
import me.folixa.ws.merchandise.Product;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.mail.iap.Response;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/tienda")
public class StoreServlet extends HttpServlet {
	private Client client = null;
	private WebResource webResource = null;
	private ClientResponse response = null;
	private ObjectMapper mapper = null;

	/**
	 * 
	 */
	public StoreServlet() {
		client = Client.create();
		webResource = client.resource("http://156.35.95.51:8080/wsfolixametienda/rest/tienda");
		mapper = new ObjectMapper();
	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		response = webResource.path("/get").accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		String jsonProducts = response.getEntity(String.class);
		List<Product> lstProducts = mapper.readValue(jsonProducts,TypeFactory.defaultInstance().constructCollectionType(List.class,Product.class));
		
		response = webResource.path("/get/categories").accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		String jsonCategories = response.getEntity(String.class);
		List<Category> lstCategories = mapper.readValue(jsonCategories,TypeFactory.defaultInstance().constructCollectionType(List.class,Category.class));
		
		response = webResource.path("/get/images").accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		String jsonImages = response.getEntity(String.class);
		List<Image> lstImages = mapper.readValue(jsonImages,TypeFactory.defaultInstance().constructCollectionType(List.class,Image.class));
		
		req.setAttribute("products", lstProducts);
		req.setAttribute("categories", lstCategories);
		req.setAttribute("images", lstImages);
		req.getRequestDispatcher("tienda.jsp").forward(req, resp);
	}
	


}
