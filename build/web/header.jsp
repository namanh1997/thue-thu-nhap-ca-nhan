<%-- 
    Document   : header
    Created on : Apr 7, 2019, 7:32:23 PM
    Author     : NamAnh
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<header>
    <div class="text-center" 
         style="color: #fff; background-color: #1f898e; padding: 30px;">
        <h1>Kê khai thuế thu nhập cá nhân</h1>
    </div>
    <nav class="navbar navbar-expand-sm bg-light">
        <div class="container">
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <%
                            User user = (User) request.getSession().getAttribute("user");
                            if (user != null) {
                        %>
                        <a class="nav-link" href="${pageContext.request.contextPath}/declare.jsp">Kê khai thuế</a>
                        <%
                            } else {
                        %>
                        
                        <% 
                            }
                        %>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login.jsp">Đăng nhập</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/LogoutServlet">Đăng xuất</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
