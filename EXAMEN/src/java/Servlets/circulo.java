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
public class circulo extends HttpServlet {
    Float radio, Total, pi;
    String opc;
    char revisa;
    
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        radio = Float.parseFloat(peticion.getParameter("radio"));
        opc = peticion.getParameter("opc");
        revisa = opc.charAt(0);
        pi = 3.1416f;
        if(revisa == 'P' || revisa == 'p'){
            Total = radio * 2 * pi;
        }
        if(revisa == 'a' || revisa == 'A'){
            Total = radio * radio * pi;
        }
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>circulo</title><link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\"></head>");
        out.println("<body>");
        out.println("<p><h2><center>circulo: "+ opc +"</p>");
        out.println("<p>"+ Total +"</p></center></h2>");
        out.println("<a href=\"circulo.html\"><input type=button value=\"Regresar\" id=\"Regresar\" name=\"Regresar\"/></a>");
        out.println("</body></html>");
        out.close();
    }
}