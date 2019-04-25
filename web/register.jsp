<%-- 
    Document   : register
    Created on : Mar 27, 2019, 8:13:23 PM
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

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
        <script src="${pageContext.request.contextPath}/js/register.js"></script>
    </head>
    <body>

        <jsp:include page="header.jsp"></jsp:include>

        <div class="container">
            <div class="row justify-content-center align-items-center">
                <div class="col-4">
                    <form action="RegisterServlet" method="post" class="needs-validation" novalidate>
                        <div class="form-group">
                            <label for="cmnd"><b>CMND</b></label>
                            <input type="text" class="form-control" name="cmnd"
                                   pattern="^(\d{9}|\d{12})$" maxlength="12"
                                   required>
                            <div class="invalid-feedback">9 hoặc 12 chữ số</div>
                        </div>
                        <div class="form-group">
                            <label for="hoTen"><b>Họ và tên</b></label>
                            <input type="text" class="form-control" name="hoTen" 
                                   pattern="^[A-Za-z\s]{0,255}$" maxlength="255"
                                   required>
                            <div class="invalid-feedback">Không chứa số và 
                                các ký tự đặc biệt. Tối đa 255 ký tự</div>
                        </div>
                        <div class="form-group">
                            <label for="ngaySinh"><b>Ngày sinh</b></label>
                            <input type="date" class="form-control" name="ngaySinh" 
                                   pattern="" required>
                            <div class="invalid-feedback"></div>
                        </div>
                        <div class="form-group">
                            <label for="matKhau"><b>Mật khẩu</b></label>
                            <input type="password" id="matKhau" class="form-control"
                                   name="matKhau" pattern="^[a-zA-Z0-9]{6,255}$" 
                                   maxlength="255"
                                   required>
                            <div class="invalid-feedback">Ít nhất 6 ký tự.
                                Không bao gồm ký tự đăc biệt(!@#$%^&*...).
                                Tối đa 255 ký tự</div>
                        </div>
                        <div class="form-group">
                            <label for="nhapLaiMatKhau"><b>Nhập lại mật khẩu</b></label>
                            <input type="password" id="nhapLaiMatKhau" 
                                   class="form-control" name="nhapLaiMatKhau" 
                                   pattern="" maxlength="255" required>
                            <div class="">${wrongConfirmPassword}</div>
                        </div>
                        <input type="submit" class="btn btn-primary" value="Đăng ký">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
