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
public class cuadrado extends HttpServlet {
    Float lado, Total;
    String opc;
    char revisa;

    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        lado = Float.parseFloat(peticion.getParameter("Lado"));
        opc = peticion.getParameter("opc");
        revisa = opc.charAt(0);
        if(revisa == 'P' || revisa == 'p'){
            Total = lado * 4;
        }
        if(revisa == 'a' || revisa == 'A'){
            Total = lado * lado;
        }
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Rectangulo</title><link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\"></head>");
        out.println("<body>");
        out.println("<p><h2><center>cuadrado: "+ opc +"</p>");
        out.println("<p>"+ Total +"</p></center></h2>");
        out.println("<a href=\"cuadrado.html\"><input type=button value=\"Regresar\" id=\"Regresar\" name=\"Regresar\"/></a>");
        out.println("</body></html>");
        out.close();
    }
}