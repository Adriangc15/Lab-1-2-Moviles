package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Entidades.Ciclo;
import java.util.ArrayList;

public final class Ciclos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.7/dist/css/bootstrap-select.min.css\">\n");
      out.write("        \n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.7/dist/js/bootstrap-select.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"../test/favicon.ico\"/>\n");
      out.write("    <a ></a>\n");
      out.write("        <style>\n");
      out.write("            .col1{\n");
      out.write("                text-align: center;\n");
      out.write("                width: 225px\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Mantenimiento de Ciclos</title>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <a class=\"navbar-brand\">Sistema de Matrícula</a>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"ingresarEstudiante.jsp\">Alumnos <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Profesores.jsp\">Profesores</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"carreras.jsp\">Carreras</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"cursos.jsp\">Cursos</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Ciclos.jsp\">Ciclos</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"ofertaAcademica.jsp\">Oferta Académica</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mav-item\">\n");
      out.write("                    <a class=\"nav-link bordered\" href=\"index.html\" style=\"\n");
      out.write("                       margin-left: 430px;\">Principal</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      Controller.Ciclos cn = null;
      synchronized (_jspx_page_context) {
        cn = (Controller.Ciclos) _jspx_page_context.getAttribute("cn", PageContext.PAGE_SCOPE);
        if (cn == null){
          cn = new Controller.Ciclos();
          _jspx_page_context.setAttribute("cn", cn, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            <h1>Mantenimiento Ciclos</h1>\n");
      out.write("        </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("            <div class=\"col-6\">\n");
      out.write("                <form style=\"margin-left:25px\" class=\"form-inline my-2 my-lg-0\" action=\"Ciclos\" method=\"POST\">\n");
      out.write("                    <br>\n");
      out.write("                        <br>\n");
      out.write("                            <select class=\"selectpicker\" title=\"Seleccione una opción.\" name=\"options\">\n");
      out.write("                                <option value=\"Codigo\">Codigo</option>\n");
      out.write("                                <option value=\"Numero\">Numero</option>\n");
      out.write("                                <option value=\"FechaInicio\">Fecha Inicio</option>\n");
      out.write("                                <option value=\"FechFinal\">Fech Final</option>\n");
      out.write("                                <option value=\"Estado\">Estado</option>\n");
      out.write("                                <option value=\"Ano\">Ano</option>\n");
      out.write("                            </select>\n");
      out.write("                        <br>\n");
      out.write("                    <br>\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" name=\"idBusqueda\" placeholder=\"Search\" aria-label=\"Search\" autocomplete=\"off\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" value=\"buscar\" name=\"action\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">  \n");
      out.write("            <div class=\"col\">\n");
      out.write("                <br>\n");
      out.write("                <table class=\"table table-striped table-hover table-condensed\">\n");
      out.write("                    <thead class=\"thead-light\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Codigo</td>\n");
      out.write("                            <td>Numero</td>\n");
      out.write("                            <td>FechaInicio</td>\n");
      out.write("                            <td>FechFinal</td>\n");
      out.write("                            <td>Estado</td>\n");
      out.write("                            <td>Ano</td>\n");
      out.write("                            <td>Opciones</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    ");
 
                        if (request.getAttribute("cicloListar") != null) {
                        
                        List<Ciclo> cicloLista = (List<Ciclo>) request.getAttribute("cicloListar");
                        
                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            ");

                               for (Ciclo c : cicloLista) {
                                   
                            
      out.write("\n");
      out.write("                           <td id='cicloCodigo'>");
  out.println(c.getCodigo()); 
      out.write(" </td>\n");
      out.write("                            <td id='cicloNumero'>");
 out.println(c.getNumero()); 
      out.write("</td>\n");
      out.write("                            <td id='cicloFechaInicio'>");
 out.println(c.getFecha_inicio()); 
      out.write("</td>\n");
      out.write("                            <td id='cicloFechaFinal'>");
 out.println(c.getFecha_finalizacion()); 
      out.write("</td>\n");
      out.write("                            <td id='cicloEstado'>");
 out.println(c.getEstado()); 
      out.write("</td>\n");
      out.write("                            <td id='cicloAno'>");
 out.println(c.getAno()); 
      out.write("</td>\n");
      out.write("                            <td> \n");
      out.write("                                <form action=\"Ciclos\" method=\"POST\">\n");
      out.write("                                    <input hidden=\"true\"  value=\"");
 out.println(c.getCodigo());
      out.write("\" id=\"deleteValue\" name=\"codigo\" type=\"text\"/>\n");
      out.write("                                    <button class=\"btn btn-danger\" id=\"btneliminar\"type=\"button\" onclick=\"clickDeleteButton('");
      out.print(c.getAno());
      out.write("','");
      out.print(c.getCodigo());
      out.write("')\">Eliminar</button>\n");
      out.write("                                    <input hidden=\"true\"  value=\"");
out.println(c.getCodigo());
      out.write("\" name=\"codigo\" type=\"text\" />\n");
      out.write("                                    <button class=\"btn btn-info\" value=\"editar\" name=\"action\" type=\"submit\" data-toggle=\"model\" data-target=\"#mEditar\">Editar</button>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");
 
                            }
                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br> \n");
      out.write("                <button type=\"button\" class=\"btn btn-info btn-lg\"  data-toggle=\"modal\" data-target=\"#mIngresar\">Ingresar </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"text-center\" style=\"display:none;\">\n");
      out.write("            <button id=\"failedButton\" href=\"#failedModal\" class=\"trigger-btn\" data-toggle=\"modal\">FailedModal</button>\n");
      out.write("            <button id=\"deleteButton\" href=\"#deleteModal\" class=\"trigger-btn\" data-toggle=\"modal\">DeleteModal</button>\n");
      out.write("            <button id=\"successButton\" href=\"#succesModal\" class=\"trigger-btn\" data-toggle=\"modal\">SuccessModal</button>\n");
      out.write("            <button id=\"editButton\" href=\"#mEditar\" class=\"trigger-btn\" data-toggle=\"modal\">EditarModal</button>\n");
      out.write("        </div>\n");
      out.write("        <br>   \n");
      out.write("        <!--Modal Ingresar -->\n");
      out.write("        <div id=\"mIngresar\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4>Agregar profesor</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"Ciclo\" method=\"POST\">\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Codigo</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input class=\"form-control\" type=\"text\" name=\"nombre\" placeholder=\"Codigo del ciclo\" required=\"true\"autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El codigo es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Numero</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input pattern=\".{1,}\" required title=\"Minimo 1 caracter.\" class=\"form-control\" type=\"text\" name=\"cedula\" \n");
      out.write("                                         placeholder=\"Numero del ciclo\" required=\"true\" autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El numero es necesaria.')\" oninput=\"setCustomValidity('')\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Fecha Inicio</label>\n");
      out.write("                                <div class=\"col-md-10\">\n");
      out.write("                                  <input class=\"form-control col1\" type=\"text\" name=\"f_inicio\"  placeholder=\"dd/mm/aaaa\" required=\"true\" >\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Fecha Final</label>\n");
      out.write("                                <div class=\"col-sm-10\">                                 \n");
      out.write("                                  <input class=\"form-control col1\" type=\"text\" name=\"f_final\" placeholder=\"dd/mm/aaaa\" required=\"true\" >\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Estado</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input pattern=\".{1,}\" required title=\"Minimo 1 caracteres.\" class=\"form-control\" type=\"number\" name=\"telefono\" \n");
      out.write("                                         placeholder=\"Estado del ciclo\" required=\"true\" autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El estado de ciclo es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Ano</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input pattern=\".{8,}\" required title=\"Minimo 4 caracteres.\" class=\"form-control\" type=\"number\" name=\"telefono\" \n");
      out.write("                                         placeholder=\"Ano del ciclo\" required=\"true\" autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El ano del ciclo es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-primary\" value=\"crear\" name=\"action\" type=\"submit\">Ingresar</button>\n");
      out.write("                        </form>\n");
      out.write("                        <button class=\"btn btn-danger\" data-dismiss=\"modal\" type=\"button\" >Cerrar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("        </div>  \n");
      out.write("        <!-- Modal success -->\n");
      out.write("        <div id=\"succesModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog modal-confirm\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                                <div class=\"modal-header\">\n");
      out.write("                                        <div class=\"icon-box\">\n");
      out.write("                                        </div>\n");
      out.write("                                         <h4 class=\"modal-title\">¡Bien hecho!</h4>\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>  \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-body text-center\">\n");
      out.write("                                        <p id=\"labelSuccess\"><big>El Ciclo<strong id=\"codigoCiclo\">DEFAULT</strong> ha sido agregado con exito.</big></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                        <button class=\"btn btn-success\" data-dismiss=\"modal\"><span>Continuar</span> </button>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("        </div>   \n");
      out.write("        <!-- Modal failed -->\n");
      out.write("        <div id=\"failedModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog modal-confirm\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                                <div class=\"modal-header\">\n");
      out.write("                                        <div class=\"icon-box\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <h4 class=\"modal-title\">¡Oops!</h4>\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-body text-center\">\t\n");
      out.write("                                        <p id=\"labelFailed\"><big>Ha ocurrido un <strong>error.</strong> Intentelo de nuevo.</big></p>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                        <button class=\"btn btn-success\" data-dismiss=\"modal\"><span>Continuar</span> </button>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Modal delete -->\n");
      out.write("        <div id=\"deleteModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog modal-confirm\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                                <div class=\"modal-header\">\n");
      out.write("                                        <div class=\"icon-box\">\n");
      out.write("                                        </div>\t\t\t\t\n");
      out.write("                                        <h4 class=\"modal-title\">¿Esta seguro?</h4>\t\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-body\">\n");
      out.write("                                    <p><big>¿Desea eliminar a <strong id='cicloCod'></strong>?</big></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <form action=\"Ciclos\" method=\"POST\">\n");
      out.write("                                        <input hidden=\"true\" id=\"valueDelete\" name=\"cedula\" type=\"text\"/>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-info\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-danger\" value=\"eliminar\" name=\"action\">Eliminar</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Modal editar -->\n");
      out.write("        <div id=\"mEditar\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">Editar profesor</h4>\n");
      out.write("                    </div>\n");
      out.write("                    ");
   
                        if (request.getAttribute("cicloEditar") != null) 
                        {
                            Ciclo c = (Ciclo)request.getAttribute("cicloEditar");
                    
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"Ciclos\" method=\"POST\">\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Codigo</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input class=\"form-control\" type=\"text\" value=\"");
 out.println(c.getCodigo()); 
      out.write("\" name=\"codigo\" placeholder=\"Codigo del curso\" \n");
      out.write("                                         required=\"true\"autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El codigo es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                                                                 \n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Numero</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input class=\"form-control\" type=\"text\" value=\"");
 out.println(c.getNumero()); 
      out.write("\" name=\"numero\" placeholder=\"Numero del curso\" \n");
      out.write("                                         required=\"true\"autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El numero es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Fecha Inicio</label>\n");
      out.write("                                <div class=\"col-md-10\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" value=\"");
 out.println(c.getFecha_inicio()); 
      out.write("\" name=\"FechaInicio\" placeholder=\"dd/mm/aaaa\" \n");
      out.write("                                         required=\"true\"autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El codigo es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Fecha Final</label>\n");
      out.write("                                <div class=\"col-sm-10\">                                 \n");
      out.write("                                    <input class=\"form-control\" type=\"text\" value=\"");
 out.println(c.getFecha_finalizacion()); 
      out.write("\" name=\"FechaFinal\" placeholder=\"dd/mm/aaaa\" \n");
      out.write("                                         required=\"true\"autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El codigo es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Estado</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input class=\"form-control\" type=\"text\" value=\"");
 out.println(c.getEstado()); 
      out.write("\" name=\"Estado\" placeholder=\"Estado del curso\" \n");
      out.write("                                         required=\"true\"autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El estado es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label  class=\"col-sm-2 col-form-label\">Ano</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                  <input class=\"form-control\" type=\"text\" value=\"");
 out.println(c.getAno()); 
      out.write("\" name=\"ano\" placeholder=\"Ano del curso\" \n");
      out.write("                                         required=\"true\"autocomplete=\"off\"\n");
      out.write("                                         oninvalid=\"this.setCustomValidity('El Ano es necesario.')\" oninput=\"setCustomValidity('')\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-primary\" value=\"editar\" name=\"action\" type=\"submit\">Editar</button>\n");
      out.write("                        </form>\n");
      out.write("                        <button class=\"btn btn-danger\" data-dismiss=\"modal\" type=\"button\" >Cerrar</button>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        ");
  
            if (request.getAttribute("cicloEditar") != null)
            {
        
      out.write("\n");
      out.write("        <script> \n");
      out.write("                $(\"#editButton\").click();\n");
      out.write("        </script>\n");
      out.write("        ");

                
            }
            String result = "default";
            if (request.getAttribute("result") != null)
            { 
                result = (String)request.getAttribute("result");
                if(result == "ExitoCrear"){
                    String variable = ((String)request.getAttribute("value")).replace("\n", "");
                    
        
      out.write("\n");
      out.write("         <script> \n");
      out.write("                        \n");
      out.write("                    var codigoProfesor = \"Ciclo(a) <strong>\"+\"");
      out.print(variable);
      out.write("\"+\"</strong> creado con exito.\";\n");
      out.write("                    $('#labelSuccess').text(\"\");\n");
      out.write("                    $('#labelSuccess').append(codigoProfesor);\n");
      out.write("                    $(\"#successButton\").click();\n");
      out.write("        </script>\n");
      out.write("        ");

                }
                else if(result == "ErrorCrear"){
                    String variable = "Error al crear el profesor"; 

      out.write("\n");
      out.write("        <script> \n");
      out.write("                    var Ano = \"");
      out.print(variable);
      out.write("\";\n");
      out.write("                    $('#labelFailed').text(\"\");\n");
      out.write("                    $('#labelFailed').append(Ano);           \n");
      out.write("                    $(\"#failedButton\").click();\n");
      out.write("        </script>\n");

                }
                else if(result == "ExitoEliminar"){
                    String variable = "Exito al eliminar el ciclo"; 

      out.write("\n");
      out.write(" <script> \n");
      out.write("                    var codigoCiclo = \"");
      out.print(variable);
      out.write("\";\n");
      out.write("                    $('#labelSuccess').text(codigoCiclo);\n");
      out.write("                    $(\"#successButton\").click();\n");
      out.write("</script>\n");

                }
                else if(result == "ErrorEliminar"){
                    String variable = "Error al elimnar el ciclo"; 

      out.write("\n");
      out.write(" <script> \n");
      out.write("                    var codigoCiclo = \"");
      out.print(variable);
      out.write("\";\n");
      out.write("                    $('#labelFailed').text(\"\");\n");
      out.write("                    $('#labelFailed').append(codigoCiclo);           \n");
      out.write("                    $(\"#failedButton\").click();\n");
      out.write("</script>\n");

                }
                else if(result == "ExitoEditar"){
                    String variable = ((String)request.getAttribute("value")).replace("\n", "");

      out.write("\n");
      out.write(" <script> \n");
      out.write("                    var codigoCiclo = \"Ciclo(a) <strong>\"+\"");
      out.print(variable);
      out.write("\"+\"</strong> editado con exito.\";\n");
      out.write("                    $('#labelSuccess').text(\"\");\n");
      out.write("                    $('#labelSuccess').append(codigoCiclo);           \n");
      out.write("                    $(\"#successButton\").click();\n");
      out.write("</script>\n");

                }
                else if(result == "ErrorEditar"){
                    String variable = "Error al editar el profesor"; 

      out.write("\n");
      out.write(" <script> \n");
      out.write("                    var codigoCiclo = \"");
      out.print(variable);
      out.write("\";\n");
      out.write("                    $('#labelFailed').text(\"\");\n");
      out.write("                    $('#labelFailed').append(codigoCiclo);           \n");
      out.write("                    $(\"#failedButton\").click();\n");
      out.write("</script>\n");

                }
                else{
                }
            }

      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("    function clickDeleteButton(codigo){\n");
      out.write("        document.getElementById('valueDelete').value = codigo;\n");
      out.write("        $('#cicloCod').text(codigo);\n");
      out.write("        $('#deleteButton').click();\n");
      out.write("    }\n");
      out.write("</script>");
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
