/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-12-05 02:05:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	#attZone {\r\n");
      out.write("		width: 660px;\r\n");
      out.write("		min-height: 150px;\r\n");
      out.write("		padding: 10px;\r\n");
      out.write("		border: 1px dotted #00f;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#attZone:empty:before {\r\n");
      out.write("		content: attr(data-placeholder);\r\n");
      out.write("		color: #999;\r\n");
      out.write("		font-size: 0.9em;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }/header.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("	<div style=\"display: flex; flex-direction: column; justify-content: center; align-items: center;\">\r\n");
      out.write("		<h3>??? ??? ??????</h3>\r\n");
      out.write("		<form id=\"insertForm\" action=\"/board/insertBoard.do\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("			<table border=\"1\" style=\"border-collapse: collapse\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td style=\"background: skyblue; width: 70px;\">\r\n");
      out.write("						??????\r\n");
      out.write("					</td>\r\n");
      out.write("					<td style=\"text-align: left;\">\r\n");
      out.write("						<input type=\"text\" name=\"boardTitle\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td style=\"background: skyblue;\">\r\n");
      out.write("						?????????\r\n");
      out.write("					</td>\r\n");
      out.write("					<td style=\"text-align: left;\">\r\n");
      out.write("						<input type=\"text\" name=\"boardWriter\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td style=\"background: skyblue; width: 70px;\">\r\n");
      out.write("						??????\r\n");
      out.write("					</td>\r\n");
      out.write("					<td style=\"text-align: left;\">\r\n");
      out.write("						<textarea name=\"boardContent\" cols=\"40\" rows=\"10\"></textarea>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td style=\"background: skyblue; width: 70px;\">\r\n");
      out.write("						????????????\r\n");
      out.write("					</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<div id=\"image_preview\">\r\n");
      out.write("							<input type=\"file\" id=\"btnAtt\" name=\"uploadFiles\" multiple=\"multiple\">\r\n");
      out.write("							<div id=\"attZone\"\r\n");
      out.write("								 data-placeholder=\"????????? ??????????????? ???????????? ????????? ????????????.\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"2\" align=\"center\">\r\n");
      out.write("						<button type=\"submit\">??? ??? ??????</button>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("		<hr/>\r\n");
      out.write("		<a href=\"/board/getBoardList.do\">??? ??????</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }/footer.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		//????????? ???????????? ????????? ??????. File????????? ????????? ??????\r\n");
      out.write("		let uploadFiles = [];\r\n");
      out.write("	\r\n");
      out.write("		$(function() {\r\n");
      out.write("			//input type=file??? ???????????? ???????????? ??????\r\n");
      out.write("			$(\"#btnAtt\").on(\"change\", function(e) {\r\n");
      out.write("				//input type=file??? ????????? ???????????? ????????? ?????????\r\n");
      out.write("				const files = e.target.files;\r\n");
      out.write("\r\n");
      out.write("				//????????? ????????? ???????????? ?????? ????????? ??????\r\n");
      out.write("				const fileArr = Array.prototype.slice.call(files);\r\n");
      out.write("				\r\n");
      out.write("				//????????? ?????? ???????????? ????????? ????????? ??????\r\n");
      out.write("				for(f of fileArr) {\r\n");
      out.write("					imageLoader(f);\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			$(\"#insertForm\").on(\"submit\", function() {\r\n");
      out.write("				//??????????????? btnAtt??? uploadFiles??? ?????? ???????????? ????????????.\r\n");
      out.write("				dt = new DataTransfer();\r\n");
      out.write("				\r\n");
      out.write("				for(f in uploadFiles) {\r\n");
      out.write("					const file = uploadFiles[f];\r\n");
      out.write("					dt.items.add(file);\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				$(\"#btnAtt\")[0].files = dt.files;\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//???????????? ????????? ????????? img?????? ?????? ??? ????????? ????????? Base64 ???????????? ????????? ????????? ????????????\r\n");
      out.write("		//??????????????? ???????????? ??????\r\n");
      out.write("		function imageLoader(file) {\r\n");
      out.write("			uploadFiles.push(file);\r\n");
      out.write("			\r\n");
      out.write("			let reader = new FileReader();\r\n");
      out.write("			\r\n");
      out.write("			reader.onload = function(e) {\r\n");
      out.write("				//???????????? ???????????? img?????? ??????\r\n");
      out.write("				let img = document.createElement(\"img\");\r\n");
      out.write("				img.setAttribute(\"style\", \"width: 100%; height: 100%; z-index: none;\");\r\n");
      out.write("				\r\n");
      out.write("				//????????? ???????????? ????????? ??????\r\n");
      out.write("				if(file.name.toLowerCase().match(/(.*?)\\.(jpg|jpeg|png|gif|svg|bmp)$/)) {\r\n");
      out.write("					//????????? ?????? ???????????? ??????\r\n");
      out.write("					img.src = e.target.result;\r\n");
      out.write("				} else {\r\n");
      out.write("					//?????? ?????? ???????????? ??????\r\n");
      out.write("					img.src = \"/images/defaultFileImg.png\";\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				//???????????? ????????? ??????\r\n");
      out.write("				//???????????? ????????? ????????? ?????? ?????? ????????? ???????????? ???????????? p????????? ???????????? div ????????????\r\n");
      out.write("				//???????????? ????????? ??????\r\n");
      out.write("				$(\"#attZone\").append(makeDiv(img, file));\r\n");
      out.write("			};\r\n");
      out.write("			\r\n");
      out.write("			//????????? Base64 ???????????? ???????????? ??????\r\n");
      out.write("			reader.readAsDataURL(file);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		//???????????? ????????? ????????? div(img+button+p)??? ???????????? ??????\r\n");
      out.write("		function makeDiv(img, file) {\r\n");
      out.write("			//div ??????\r\n");
      out.write("			let div = document.createElement(\"div\");\r\n");
      out.write("			div.setAttribute(\"style\", \"display: inline-block; position: relative;\"\r\n");
      out.write("			+ \" width: 150px; height: 120px; margin: 5px; border: 1px solid #00f; z-index: 1;\");\r\n");
      out.write("			\r\n");
      out.write("			//button ??????\r\n");
      out.write("			let btn = document.createElement(\"input\");\r\n");
      out.write("			btn.setAttribute(\"type\", \"button\");\r\n");
      out.write("			btn.setAttribute(\"value\", \"x\");\r\n");
      out.write("			btn.setAttribute(\"delFile\", file.name);\r\n");
      out.write("			btn.setAttribute(\"style\", \"width: 30px; height: 30px; position: absolute;\"\r\n");
      out.write("			+ \" right: 0px; bottom: 0px; z-index: 999; background-color: rgba(255, 255, 255, 0.1);\"\r\n");
      out.write("			+ \" color: #f00;\");\r\n");
      out.write("			\r\n");
      out.write("			//?????? ?????? ?????????\r\n");
      out.write("			//?????? ?????? ??? ?????? ????????? ??????????????? ??????\r\n");
      out.write("			btn.onclick = function(e) {\r\n");
      out.write("				//????????? ??????\r\n");
      out.write("				const ele = e.srcElement;\r\n");
      out.write("				//delFile(????????????) ?????? ????????????: ????????? ?????????\r\n");
      out.write("				const delFile = ele.getAttribute(\"delFile\");\r\n");
      out.write("				\r\n");
      out.write("				for(let i = 0; i < uploadFiles.length; i++) {\r\n");
      out.write("					//????????? ???????????? ??????????????? ?????? ?????? ??????\r\n");
      out.write("					if(delFile == uploadFiles[i].name) {\r\n");
      out.write("						//???????????? i?????? ????????? ??????\r\n");
      out.write("						uploadFiles.splice(i, 1);\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				//?????? ?????? ??? btnAtt??? ????????? ????????? ??????\r\n");
      out.write("				//input type=file??? ????????? ???????????? fileList ????????? ??????\r\n");
      out.write("				//fileList??? ???????????? File????????? ?????? ??? ??????\r\n");
      out.write("				//DataTransfer?????? ???????????? ???????????? ????????? fileList ????????? ????????????\r\n");
      out.write("				//input.files??? ???????????? ??????.\r\n");
      out.write("				dt = new DataTransfer();\r\n");
      out.write("				\r\n");
      out.write("				for(f in uploadFiles) {\r\n");
      out.write("					const file = uploadFiles[f];\r\n");
      out.write("					dt.items.add(file);\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				$(\"#btnAtt\")[0].files = dt.files;\r\n");
      out.write("				\r\n");
      out.write("				//?????? img??? ???????????? ??????????????? div ??????\r\n");
      out.write("				const parentDiv = ele.parentNode;\r\n");
      out.write("				$(parentDiv).remove();\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			//????????? ????????? p?????? ??????\r\n");
      out.write("			const fName = document.createElement(\"p\");\r\n");
      out.write("			fName.setAttribute(\"style\", \"display: inline-block; font-size: 8px;\");\r\n");
      out.write("			fName.textContent = file.name;\r\n");
      out.write("			\r\n");
      out.write("			//div??? ????????? ??????\r\n");
      out.write("			div.appendChild(img);\r\n");
      out.write("			div.appendChild(btn);\r\n");
      out.write("			div.appendChild(fName);\r\n");
      out.write("			\r\n");
      out.write("			//????????? div ??????\r\n");
      out.write("			return div;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
