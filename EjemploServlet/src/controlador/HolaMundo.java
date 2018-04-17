package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolaMundo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		// http://localhost:8080/EjemploServlet/HolaMundo?nombre=mikel&apellido=Artola
		// Para separar funciones, esto es el controlador
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>LLamada get, Hola que tal? soy," + request.getParameter("nombre")  + request.getParameter("apellido") + "</h1>");
		out.println("</body>");
		out.println("</html>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		// http://localhost:8080/EjemploServlet/HolaMundo
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>LLamada post, Hola que tal? soy," + request.getParameter("nombre")  + request.getParameter("apellido") + "</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}
