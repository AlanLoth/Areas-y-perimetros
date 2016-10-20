package Servlets;

/**
 *
 * @author Loth
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Rectangulo extends HttpServlet {
    Float alto, largo, Total;
    String opc;
    char revisa;

    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        alto = Float.parseFloat(peticion.getParameter("Altura"));
        largo = Float.parseFloat(peticion.getParameter("Largo"));
        opc = peticion.getParameter("opc");
        revisa = opc.charAt(0);
        if(revisa == 'P' || revisa == 'p'){
            Total = largo + largo + alto + alto;
        }
        if(revisa == 'a' || revisa == 'A'){
            Total = largo * alto;
        }
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Rectangulo</title><link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\"></head>");
        out.println("<body>");
        out.println("<p><h2><center>Rectangulo: "+ opc +"</p>");
        out.println("<p>"+ Total +"</p></center></h2>");
        out.println("<a href=\"Rectangulo.html\"><input type=button value=\"Regresar\" id=\"Regresar\" name=\"Regresar\"/></a>");
        out.println("</body></html>");
        out.close();
    }
}