/*
Loth
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class Triangulo extends HttpServlet {
    Float alto, largo, Total, hip;
    String opc;
    char revisa;

    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        alto = Float.parseFloat(peticion.getParameter("Altura"));
        largo = Float.parseFloat(peticion.getParameter("Largo"));
        hip = Float.parseFloat(peticion.getParameter("Hip"));
        opc = peticion.getParameter("opc");
        revisa = opc.charAt(0);
        if(revisa == 'P' || revisa == 'p'){
            Total = alto + largo + hip;
        }
        if(revisa == 'a' || revisa == 'A'){
            Total = (largo * alto)/2;
        }
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Triangulo Rectangulo</title><link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\"></head>");
        out.println("<body>");
        out.println("<p><h2><center>Rectangulo: "+ opc +"</p>");
        out.println("<p>"+ Total +"</p></center></h2>");
        out.println("<a href=\"Triangulo.html\"><input type=button value=\"Regresar\" id=\"Regresar\" name=\"Regresar\"/></a>");
        out.println("</body></html>");
        out.close();
    }
}