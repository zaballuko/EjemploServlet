<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="modelo.*"%>
<%@page import="java.util.ArrayList"%>
<%ArrayList<Libro> libros =(ArrayList<Libro>)request.getAttribute("libros");%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>listado libro</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">

				<%
		Iterator<Libro> i = libros.iterator();
		
		while(i.hasNext()){
			Libro libro = (Libro) i.next();
			out.print(libro.getTitulo());
			out.print("<br>");
		}
		
		%>

			</div>
		</div>
	</div>

</body>
</html>