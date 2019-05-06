<%-- 
    Document   : login
    Created on : Mar 26, 2019, 10:29:58 PM
    Author     : NamAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-3.4.0.min.js"></script>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
        <script src="${pageContext.request.contextPath}/js/login.js"></script>
    </head>
    <body>
        
        <jsp:include page="header.jsp"></jsp:include>
        
        <div class="container">
            <div class="row justify-content-center align-items-center">
                <div class="col-4">
                    <form action="LoginServlet" method="post" class="needs-validation" novalidate>
                        <div class="form-group">
                            <label for="cmnd"><b>CHỨNG MINH NHÂN DÂN</b></label>
                            <input type="text" class="form-control" name="cmnd"
                                   pattern="^(\d{9}|\d{12})$" maxlength="12"
                                   placeholder="Chứng minh nhân dân" required>
                            <div class="invalid-feedback">9 hoặc 12 chữ số</div>
                        </div>
                        <div class="form-group">
                            <label for="mat-khau"><b>MẬT KHẨU</b></label>
                            <input type="password" class="form-control" name="mat-khau"
                                   pattern="^[a-zA-Z0-9]{6,255}$" maxlength="255"
                                   title="Ít nhất 6 ký tự. Không bao gồm ký tự đăc biệt
                                   (!@#$%^&*...). Tối đa 255 ký tự"
                                   placeholder="Mật khẩu" required>
                            <div class="invalid-feedback">Ít nhất 6 ký tự.
                                Không bao gồm ký tự đăc biệt(!@#$%^&*...).
                                Tối đa 255 ký tự</div>
                        </div>
                        <input type="submit" class="btn btn-primary" value="Đăng nhập">
                        <a href="${pageContext.request.contextPath}/register.jsp">Đăng ký tài khoản</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
