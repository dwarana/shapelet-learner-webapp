/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-01-06 13:47:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class graph_005fvisualizer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- META SECTION -->\n");
      out.write("    <title>Shaplet-Learner</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("\n");
      out.write("    <link rel=\"icon\" href=\"../../resources/img/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("    <!-- END META SECTION -->\n");
      out.write("\n");
      out.write("    <!-- CSS INCLUDE -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" id=\"theme\" href=\"../../resources/css/theme-default.css\"/>\n");
      out.write("    <!-- EOF CSS INCLUDE -->\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <link href=\"../../resources/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"../../resources/js/Chart.min.js\"></script>\n");
      out.write("    ");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- START PAGE CONTAINER -->\n");
      out.write("<div class=\"page-container\">\n");
      out.write("\n");
      out.write("    <!-- START PAGE SIDEBAR -->\n");
      out.write("    <div class=\"page-sidebar\">\n");
      out.write("        <!-- START X-NAVIGATION -->\n");
      out.write("        <ul class=\"x-navigation\">\n");
      out.write("            <li class=\"xn-logo\">\n");
      out.write("                <a href=\"dashboard\">Artisan Admin</a>\n");
      out.write("                <a href=\"#\" class=\"x-navigation-control\"></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"xn-profile\">\n");
      out.write("                <a href=\"#\" class=\"profile-mini\">\n");
      out.write("                    <img src=\"../../resources/assets/images/users/pp.jpg\" alt=\"Artisan\"/>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"profile\">\n");
      out.write("                    <div class=\"profile-image\">\n");
      out.write("                        <img src=\"../../resources/assets/images/users/pp.jpg\" alt=\"Artisan\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"profile-data\">\n");
      out.write("                        <div class=\"profile-data-name\">Team Artisan</div>\n");
      out.write("                        <div class=\"profile-data-title\">Shaplet-Learner-Developers</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"xn-title\">Navigation</li>\n");
      out.write("            <li><a href=\"dashboard\"><span class=\"fa fa-desktop\"></span> <span class=\"xn-text\">Dashboard</span></a></li>\n");
      out.write("            <li class=\"xn-openable\">\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-files-o\"></span> <span class=\"xn-text\">Pages</span></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"graph_visualizer\"><span class=\"fa fa-users\"></span> Shapelet Visualizer</a></li>\n");
      out.write("                    <li class=\"xn-openable\">\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-clock-o\"></span> Timeline</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"pages-timeline.html\"><span class=\"fa fa-align-center\"></span> Default</a></li>\n");
      out.write("                            <li><a href=\"pages-timeline-simple.html\"><span class=\"fa fa-align-justify\"></span> Full\n");
      out.write("                                Width</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"xn-openable\">\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-envelope\"></span> Mailbox</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"pages-mailbox-inbox.html\"><span class=\"fa fa-inbox\"></span> Inbox</a></li>\n");
      out.write("                            <li><a href=\"pages-mailbox-message.html\"><span class=\"fa fa-file-text\"></span> Message</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"pages-mailbox-compose.html\"><span class=\"fa fa-pencil\"></span> Compose</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"pages-messages.html\"><span class=\"fa fa-comments\"></span> Messages</a></li>\n");
      out.write("                    <li><a href=\"pages-calendar.html\"><span class=\"fa fa-calendar\"></span> Calendar</a></li>\n");
      out.write("                    <li><a href=\"pages-tasks.html\"><span class=\"fa fa-edit\"></span> Tasks</a></li>\n");
      out.write("                    <li><a href=\"pages-content-table.html\"><span class=\"fa fa-columns\"></span> Content Table</a></li>\n");
      out.write("                    <li><a href=\"pages-faq.html\"><span class=\"fa fa-question-circle\"></span> FAQ</a></li>\n");
      out.write("                    <li><a href=\"pages-search.html\"><span class=\"fa fa-search\"></span> Search</a></li>\n");
      out.write("                    <li class=\"xn-openable\">\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-file\"></span> Blog</a>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"pages-blog-list.html\"><span class=\"fa fa-copy\"></span> List of Posts</a></li>\n");
      out.write("                            <li><a href=\"pages-blog-post.html\"><span class=\"fa fa-file-o\"></span>Single Post</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"xn-openable\">\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-sign-in\"></span> Login</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"pages-login.html\">App Login</a></li>\n");
      out.write("                            <li><a href=\"pages-login-website.html\">Website Login</a></li>\n");
      out.write("                            <li><a href=\"pages-login-website-light.html\"> Website Login Light</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"xn-openable\">\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-warning\"></span> Error Pages</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"pages-error-404.html\">Error 404 Sample 1</a></li>\n");
      out.write("                            <li><a href=\"pages-error-404-2.html\">Error 404 Sample 2</a></li>\n");
      out.write("                            <li><a href=\"pages-error-500.html\"> Error 500</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- END X-NAVIGATION -->\n");
      out.write("    </div>\n");
      out.write("    <!-- END PAGE SIDEBAR -->\n");
      out.write("\n");
      out.write("    <!-- PAGE CONTENT -->\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("\n");
      out.write("        <!-- START X-NAVIGATION VERTICAL -->\n");
      out.write("        <ul class=\"x-navigation x-navigation-horizontal x-navigation-panel\">\n");
      out.write("            <!-- TOGGLE NAVIGATION -->\n");
      out.write("            <li class=\"xn-icon-button\">\n");
      out.write("                <a href=\"#\" class=\"x-navigation-minimize\"><span class=\"fa fa-dedent\"></span></a>\n");
      out.write("            </li>\n");
      out.write("            <!-- END TOGGLE NAVIGATION -->\n");
      out.write("            <!-- SEARCH -->\n");
      out.write("            <li class=\"xn-search\">\n");
      out.write("                <form role=\"form\">\n");
      out.write("                    <input type=\"text\" name=\"search\" placeholder=\"Search...\"/>\n");
      out.write("                </form>\n");
      out.write("            </li>\n");
      out.write("            <!-- END SEARCH -->\n");
      out.write("            <!-- SIGN OUT -->\n");
      out.write("            <li class=\"xn-icon-button pull-right\">\n");
      out.write("                <a href=\"#\" class=\"mb-control\" data-box=\"#mb-signout\"><span class=\"fa fa-sign-out\"></span></a>\n");
      out.write("            </li>\n");
      out.write("            <!-- END SIGN OUT -->\n");
      out.write("            <!-- MESSAGES -->\n");
      out.write("            <li class=\"xn-icon-button pull-right\">\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-comments\"></span></a>\n");
      out.write("                <div class=\"informer informer-danger\">4</div>\n");
      out.write("                <div class=\"panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\"><span class=\"fa fa-comments\"></span> Messages</h3>\n");
      out.write("                        <div class=\"pull-right\">\n");
      out.write("                            <span class=\"label label-danger\">4 new</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body list-group list-group-contacts scroll\" style=\"height: 200px;\">\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">\n");
      out.write("                            <div class=\"list-group-status status-online\"></div>\n");
      out.write("                            <img src=\"../../resources/assets/images/users/user2.jpg\" class=\"pull-left\" alt=\"John Doe\"/>\n");
      out.write("                            <span class=\"contacts-title\">John Doe</span>\n");
      out.write("                            <p>Praesent placerat tellus id augue condimentum</p>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">\n");
      out.write("                            <div class=\"list-group-status status-away\"></div>\n");
      out.write("                            <img src=\"../../resources/assets/images/users/user.jpg\" class=\"pull-left\"\n");
      out.write("                                 alt=\"Dmitry Ivaniuk\"/>\n");
      out.write("                            <span class=\"contacts-title\">Dmitry Ivaniuk</span>\n");
      out.write("                            <p>Donec risus sapien, sagittis et magna quis</p>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">\n");
      out.write("                            <div class=\"list-group-status status-away\"></div>\n");
      out.write("                            <img src=\"../../resources/assets/images/users/user3.jpg\" class=\"pull-left\" alt=\"Nadia Ali\"/>\n");
      out.write("                            <span class=\"contacts-title\">Nadia Ali</span>\n");
      out.write("                            <p>Mauris vel eros ut nunc rhoncus cursus sed</p>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">\n");
      out.write("                            <div class=\"list-group-status status-offline\"></div>\n");
      out.write("                            <img src=\"../../resources/assets/images/users/user6.jpg\" class=\"pull-left\"\n");
      out.write("                                 alt=\"Darth Vader\"/>\n");
      out.write("                            <span class=\"contacts-title\">Darth Vader</span>\n");
      out.write("                            <p>I want my money back!</p>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-footer text-center\">\n");
      out.write("                        <a href=\"pages-messages.html\">Show all messages</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- END MESSAGES -->\n");
      out.write("            <!-- TASKS -->\n");
      out.write("            <li class=\"xn-icon-button pull-right\">\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-tasks\"></span></a>\n");
      out.write("                <div class=\"informer informer-warning\">3</div>\n");
      out.write("                <div class=\"panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\"><span class=\"fa fa-tasks\"></span> Tasks</h3>\n");
      out.write("                        <div class=\"pull-right\">\n");
      out.write("                            <span class=\"label label-warning\">3 active</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body list-group scroll\" style=\"height: 200px;\">\n");
      out.write("                        <a class=\"list-group-item\" href=\"#\">\n");
      out.write("                            <strong>Phasellus augue arcu, elementum</strong>\n");
      out.write("                            <div class=\"progress progress-small progress-striped active\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"50\"\n");
      out.write("                                     aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 50%;\">50%\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <small class=\"text-muted\">John Doe, 25 Sep 2014 / 50%</small>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"list-group-item\" href=\"#\">\n");
      out.write("                            <strong>Aenean ac cursus</strong>\n");
      out.write("                            <div class=\"progress progress-small progress-striped active\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"80\"\n");
      out.write("                                     aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%;\">80%\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <small class=\"text-muted\">Dmitry Ivaniuk, 24 Sep 2014 / 80%</small>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"list-group-item\" href=\"#\">\n");
      out.write("                            <strong>Lorem ipsum dolor</strong>\n");
      out.write("                            <div class=\"progress progress-small progress-striped active\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"95\"\n");
      out.write("                                     aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 95%;\">95%\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <small class=\"text-muted\">John Doe, 23 Sep 2014 / 95%</small>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"list-group-item\" href=\"#\">\n");
      out.write("                            <strong>Cras suscipit ac quam at tincidunt.</strong>\n");
      out.write("                            <div class=\"progress progress-small\">\n");
      out.write("                                <div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"100\" aria-valuemin=\"0\"\n");
      out.write("                                     aria-valuemax=\"100\" style=\"width: 100%;\">100%\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <small class=\"text-muted\">John Doe, 21 Sep 2014 /</small>\n");
      out.write("                            <small class=\"text-success\"> Done</small>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-footer text-center\">\n");
      out.write("                        <a href=\"pages-tasks.html\">Show all tasks</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- END TASKS -->\n");
      out.write("        </ul>\n");
      out.write("        <!-- END X-NAVIGATION VERTICAL -->\n");
      out.write("\n");
      out.write("        <!-- START BREADCRUMB -->\n");
      out.write("        <ul class=\"breadcrumb\">\n");
      out.write("            <li><a href=\"#\">Home</a></li>\n");
      out.write("            <li class=\"active\">Shapelet Visualizer</li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- END BREADCRUMB -->\n");
      out.write("\n");
      out.write("        <!-- PAGE CONTENT WRAPPER -->\n");
      out.write("        <div class=\"page-content-wrap\">\n");
      out.write("            <!-- START WIDGETS -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <canvas id=\"canvas\"></canvas>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"text-align:center;\">\n");
      out.write("                <a id=\"button\" onclick=\"getChart()\"  class=\"myButton\">Proceed</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- END WIDGETS -->\n");
      out.write("        </div>\n");
      out.write("        <!-- END PAGE CONTENT WRAPPER -->\n");
      out.write("    </div>\n");
      out.write("    <!-- END PAGE CONTENT -->\n");
      out.write("</div>\n");
      out.write("<!-- END PAGE CONTAINER -->\n");
      out.write("\n");
      out.write("<!-- START PRELOADS -->\n");
      out.write("<audio id=\"audio-alert\" src=\"../../resources/audio/alert.mp3\" preload=\"auto\"></audio>\n");
      out.write("<audio id=\"audio-fail\" src=\"../../resources/audio/fail.mp3\" preload=\"auto\"></audio>\n");
      out.write("<!-- END PRELOADS -->\n");
      out.write("\n");
      out.write("<!-- START SCRIPTS -->\n");
      out.write("<!-- START PLUGINS -->\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/jquery/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/jquery/jquery-ui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("<!-- END PLUGINS -->\n");
      out.write("\n");
      out.write("<!-- START THIS PAGE PLUGINS-->\n");
      out.write("<script type='text/javascript' src='../../resources/js/plugins/icheck/icheck.min.js'></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"../../resources/js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/scrolltotop/scrolltopcontrol.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/morris/raphael-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/morris/morris.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/rickshaw/d3.v3.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/rickshaw/rickshaw.min.js\"></script>\n");
      out.write("<script type='text/javascript' src='../../resources/js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js'></script>\n");
      out.write("<script type='text/javascript' src='../../resources/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js'></script>\n");
      out.write("<script type='text/javascript' src='../../resources/js/plugins/bootstrap/bootstrap-datepicker.js'></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/owl/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/moment.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!-- END THIS PAGE PLUGINS-->\n");
      out.write("\n");
      out.write("<!-- START TEMPLATE -->\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/settings.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/plugins.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/actions.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/js/demo_dashboard.js\"></script>\n");
      out.write("<script src=\"../../resources/js/lineChart.js\"></script>\n");
      out.write("<script>\n");
      out.write("    function getChart() {\n");
      out.write("        var button = document.getElementById(\"button\");\n");
      out.write("        var canvas = document.getElementById(\"canvas\");\n");
      out.write("\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<!-- END TEMPLATE -->\n");
      out.write("<!-- END SCRIPTS -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
}
