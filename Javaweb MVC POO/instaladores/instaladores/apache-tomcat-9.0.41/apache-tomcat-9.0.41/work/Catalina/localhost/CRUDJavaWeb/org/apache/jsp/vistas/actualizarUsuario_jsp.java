/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2023-08-03 03:55:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actualizarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/jose/Desktop/Javaweb%20MVC%20POO-20230802T034113Z-001/Javaweb%20MVC%20POO/CRUDJavaWeb%20OK%2024-Jul-23/CRUDJavaWeb%20OK%2024-Jul-23/build/web/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343837818000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1690172794756L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fdefault_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fdefault_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fdefault_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write('\n');

    if (session.getAttribute("usuario") != null) {

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>CRUD Usuarios| Inicio</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/Ionicons/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"dist/css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!-- AdminLTE Skins. We have chosen the skin-blue for this starter\n");
      out.write("              page. However, you can choose any other skin. Make sure you\n");
      out.write("              apply the skin class to the body tag so the changes take effect. -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/skin-blue.min.css\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Main Header -->\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("                <a href=\"#\" class=\"logo\">\n");
      out.write("                    <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("                    <span class=\"logo-mini\"><b>S</b>BL</span>\n");
      out.write("                    <!-- logo for regular state and mobile devices -->\n");
      out.write("                    <span class=\"logo-lg\"><b>CRUD Usuarios</b></span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Header Navbar -->\n");
      out.write("                <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("                    <!-- Sidebar toggle button-->\n");
      out.write("                    <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"push-menu\" role=\"button\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Navbar Right Menu -->\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <!-- User Account Menu -->\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <!-- Menu Toggle Button -->\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <!-- The user image in the navbar-->\n");
      out.write("                                    <img src=\"dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                                    <!-- hidden-xs hides the username on small devices so only the image appears. -->\n");
      out.write("                                    <span class=\"hidden-xs\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.nombreUsuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <!-- The user image in the menu -->\n");
      out.write("                                    <li class=\"user-header\">\n");
      out.write("                                        <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                                        <p>                    \n");
      out.write("                                            Bienvenido - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.nombreUsuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                            <small>Usted es,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.cargo.nombreCargo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </small>\n");
      out.write("                                        </p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- Menu Footer-->\n");
      out.write("                                    <li class=\"user-footer\">\n");
      out.write("                                        <div class=\"pull-right\">\n");
      out.write("                                            <a href=\"srvUsuario?accion=cerrar\" class=\"btn btn-default btn-flat\">Cerrar Sesión</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"main-sidebar\">\n");
      out.write("\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar user panel (optional) -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>Bienvenido,  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.nombreUsuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("                            <!-- Status -->\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- search form (Optional) -->\n");
      out.write("                    <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- /.search form -->\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Menu -->\n");
      out.write("                    <ul class=\"sidebar-menu\" data-widget=\"tree\">\n");
      out.write("                        <li class=\"header\">INICIO</li>\n");
      out.write("                        <!-- Optionally, you can add icons to the links -->\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-link\"></i> <span>Panel Administrativo</span></a></li>\n");
      out.write("                        <li class=\"treeview active\">\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-th-large\"></i> <span>Registros</span>\n");
      out.write("                                <span class=\"pull-right-container\">\n");
      out.write("                                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                            <!--    <li><a href=\"#\"><i class=\"fa fa-archive\"></i>Categorias</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-tags\"></i>Marcas</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cube\"></i>Productos</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-users\"></i>Clientes</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-truck\"></i>Proveedores</a></li>\n");
      out.write("                                <li><a href=\"\"><i class=\"fa fa-user-plus\"></i>Empleados</a></li> -->\n");
      out.write("                                <li class=\"active\"><a href=\"srvUsuario?accion=listarUsuarios\"><i class=\"fa fa-address-card\"></i>Usuarios</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                 <!--       <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-cart-arrow-down\"></i> <span>Ventas</span>\n");
      out.write("                                <span class=\"pull-right-container\">\n");
      out.write("                                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-cart-arrow-down\"></i>Nueva Venta</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-tags\"></i>Administrar Ventas</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-area-chart\"></i> <span>Reportes</span>\n");
      out.write("                                <span class=\"pull-right-container\">\n");
      out.write("                                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-bar-chart\"></i>Reportes Ventas</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>  -->\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.sidebar-menu -->\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 hidden-xs\"></div>\n");
      out.write("                        <div class=\"col-xs-2 col-md-1\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-10 col-md-5 \">\n");
      out.write("                            <div class=\"btn-group pull-right\">\n");
      out.write("                                <a href=\"srvUsuario?accion=listarUsuarios\" class=\"btn btn-default\">\n");
      out.write("                                    <i class=\"fa fa-align-justify\"></i> Ver listado</a>                                              \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"box-header with-border\">\n");
      out.write("                            <i class=\"fa fa-edit\"></i> <h3 class=\"box-title\">Actualizar Datos Usuario</h3>  \n");
      out.write("                        </div>\n");
      out.write("                        <form class=\"form-horizontal\" action=\"srvUsuario?accion=actualizarUsuario\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"hCodigo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.id_usuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <div class=\"box-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-2 control-label\">Nombre Usuario</label>\n");
      out.write("                                    <div class=\"col-sm-4 input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                                        <input id=\"nombre\" type=\"text\" class=\"form-control\" placeholder=\"Ejem: Alexander\" name=\"txtNombre\" maxlength=\"10\"\n");
      out.write("                                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.nombreUsuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-2 control-label\">Clave</label>\n");
      out.write("                                    <div class=\"col-sm-4 input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                                        <input id=\"nombre\" type=\"password\" class=\"form-control\" placeholder=\"Ejem: $%Ale!**\" name=\"txtClave\" maxlength=\"10\"\n");
      out.write("                                               value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.clave}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-2 control-label\">Cargo</label>\n");
      out.write("                                    <div class=\"col-sm-4 input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"fa fa-tags\"></i></span>\n");
      out.write("                                        <select class=\"form-control\"  name=\"cboCargo\" autofocus=\"\"  required=\"\">\n");
      out.write("                                            <option value=\"0\">Seleccione un cargo</option>\n");
      out.write("                                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>                                  \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"chkEstado\" \n");
      out.write("                                                       ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write(">Activo\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.box-body -->\n");
      out.write("                            <div class=\"box-footer\">\n");
      out.write("                                <a href=\"srvUsuario?accion=listarUsuarios\" class=\"btn btn-danger\"><i class=\"fa fa-close red\"></i> Cancelar</a>\n");
      out.write("                                <button type=\"submit\" id=\"\" name=\"btnRegistrar\" value=\"Registrar\" class=\"btn btn-success\"><i class=\"fa fa-refresh\"></i> Actualizar Usuario</button>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.box-footer -->\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </section> \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Main Footer -->\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <!-- To the right -->\n");
      out.write("                <div class=\"pull-right hidden-xs\">\n");
      out.write("                    “Lo que haces hoy puede mejorar todos tus mañanas.” Ralph Marston\n");
      out.write("                </div>\n");
      out.write("                <!-- Default to the left -->\n");
      out.write("                <strong>Copyright &copy; 2023 <a href=\"#\">Inmasoft</a>.</strong> Todos los derechos reservados.\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <div class=\"control-sidebar-bg\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        <!-- REQUIRED JS SCRIPTS -->\n");
      out.write("\n");
      out.write("        <!-- jQuery 3 -->\n");
      out.write("        <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 3.3.7 -->\n");
      out.write("        <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Optionally, you can add Slimscroll and FastClick plugins.\n");
      out.write("             Both of these plugins are recommended to enhance the\n");
      out.write("             user experience. -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    } else {
        response.sendRedirect("identificar.jsp");
    }

      out.write('\n');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /vistas/actualizarUsuario.jsp(206,44) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/vistas/actualizarUsuario.jsp(206,44) '${cargos}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${cargos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /vistas/actualizarUsuario.jsp(206,44) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("car");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                                <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.codigo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"  \n");
            out.write("                                                        ");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\n");
            out.write("                                                        >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.nombreCargo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\n");
            out.write("                                            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /vistas/actualizarUsuario.jsp(208,56) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.codigo == \n                                                                      usuario.cargo.codigo}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                              selected\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fdefault_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /vistas/actualizarUsuario.jsp(222,55) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.estado == false ?\n                                                                       'unchecked' : 'checked'}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /vistas/actualizarUsuario.jsp(222,55) name = default type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setDefault("");
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fdefault_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
