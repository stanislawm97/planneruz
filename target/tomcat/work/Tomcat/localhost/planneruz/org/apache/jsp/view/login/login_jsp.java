/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-12-06 13:09:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("          integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <title>Log in</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    input[type=\"email\"] {\r\n");
      out.write("        border-bottom-left-radius: 0px;;\r\n");
      out.write("        border-bottom-right-radius: 0px;;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input[type=\"password\"] {\r\n");
      out.write("        border-top-left-radius: 0px;;\r\n");
      out.write("        border-top-right-radius: 0px;;\r\n");
      out.write("        border-top: 0px;;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-grad {\r\n");
      out.write("        background-image: linear-gradient(to right, #2b5876 0%, #4e4376 51%, #2b5876 100%)\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-grad {\r\n");
      out.write("\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        transition: 0.5s;\r\n");
      out.write("        background-size: 200% auto;\r\n");
      out.write("        color: white;\r\n");
      out.write("        box-shadow: 0 0 20px #eee;\r\n");
      out.write("        border-radius: 10px;\r\n");
      out.write("        display: block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-grad:hover {\r\n");
      out.write("        background-position: right center; /* change the direction of the change here */\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"text-center mt-5\">\r\n");
      out.write("    <form style=\"max-width: 350px; margin:auto;\">\r\n");
      out.write("        <img class=\"mt-4 mb-4\" src=\"avatar.png\" height=\"72\" alt=\"Avatar logo\"/>\r\n");
      out.write("        <h1 class=\"h3 mb-3 font-weight-normal\">Zaloguj się</h1>\r\n");
      out.write("        <label for=\"emailAddress\" class=\"sr-only\">Adres email</label>\r\n");
      out.write("        <input type=\"email\" id=\"emailAddress\" class=\"form-control\" placeholder=\"Adres email\" required autofocus>\r\n");
      out.write("        <label for=\"password\" class=\"sr-only\">Hasło</label>\r\n");
      out.write("        <input type=\"passwrod\" id=\"password\" placeholder=\"Hasło\" class=\"form-control\">\r\n");
      out.write("        <div class=\"checkbox mt-2\">\r\n");
      out.write("            <label>\r\n");
      out.write("                <input type=\"checkbox\" value=\"remember-me\"> Zapamiętaj mnie\r\n");
      out.write("            </label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"register.jsp\">Nie masz konta? Zarejestruj się!</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mt-2\" style=\"max-width: 300px; margin: auto;\">\r\n");
      out.write("            <button class=\"btn btn-lg btn-primary btn-block btn-grad\">Zaloguj się</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
