package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Formulario de Prueba</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Datos de la persona</h1>\n");
      out.write("        \n");
      out.write("         <form action=\"SvPersona\" method= \"POST\"><!--Se llama al Servlet y se usa método post porque es un alta-->\n");
      out.write("            <p><label> Dni:</label><input type=\"text\" name= \"dni\"></p>\n");
      out.write("            <p><label>Nombre:</label><input type=\"text\" name= \"nombre\"></p>\n");
      out.write("            <p><label> Apellido:</label><input type=\"text\" name=\"apellido\"></p>\n");
      out.write("            <p><label> Telefono:</label><input type=\"text\" name= \"telefono\"></p>\n");
      out.write("            <button type=\"submit\"> Enviar</button><!-- Enviar manda una request al Servlet Persona-->\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        <h1> Ver listas de las personas</h1>\n");
      out.write("        <p>Si desea ver todoas las personas haga click en el boton mostrar personas</p>\n");
      out.write("        <form action=\"SvPersona\" method=\"GET\">\n");
      out.write("            \n");
      out.write("            <button type=\"submit\">Mostrar personas</button>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        <h1>Eliminar personas</h1>\n");
      out.write("        <p>Ingrese el ID de la persona a eliminar</p>\n");
      out.write("        <form action=\"SvEliminar\" method=\"POST\">\n");
      out.write("            <p><label>ID:</label><input type=\"text\" name=\"id_eliminar\"></p>\n");
      out.write("            <button type=\"submit\"> Elimiar</button>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        <h1>Modificacion de los datos de la persona</h1>\n");
      out.write("        <p>Ingrese el ID de la persona que desea modificar</p>\n");
      out.write("         <form action=\"SvModificar\" method=\"GET\">\n");
      out.write("             <p><label>ID:</label><input type=\"text\" name=\"id_modificar\"></p>\n");
      out.write("              <button type=\"submit\">Modificar</button>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
