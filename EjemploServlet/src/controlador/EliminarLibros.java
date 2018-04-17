package controlador;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;
import modelo.LibroModelo;

public class EliminarLibros extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response){
		LibroModelo libroModelo= new LibroModelo();
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		Libro libro = libroModelo.select(id);
		libroModelo.delete(id);
	}
}
