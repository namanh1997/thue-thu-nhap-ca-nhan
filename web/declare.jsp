<%-- 
    Document   : declare
    Created on : Mar 26, 2019, 10:35:12 PM
    Author     : NamAnh
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Khai báo thuế</title>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-3.4.0.min.js"></script>
     
        <script src="${pageContext.request.contextPath}/js/declare.js"></script>
    </head>
    <body>
        <%
            User user = (User) request.getSession().getAttribute("user");
            DecimalFormat formatter = new DecimalFormat("###,###,###,###");
            if (user != null) {
        %>
        <jsp:include page="header.jsp"></jsp:include>
        <div class="container">
            <form action="DeclareServlet" method="get" class="needs-validation" novalidate>
                
                <div class="form-group row">
                    <label for="hop-dong-lao-dong" class="col-2 text-right">Hợp đồng lao động</label>
                    <div class="col-3">
                        <select class="form-control" name="hopDong">
                            <option value="tu3Thang">Từ 3 tháng trở lên</option>
                            <option value="duoi3Thang">Dưới 3 tháng</option>
                        </select>
                    </div>
                </div>
                
                <div class="form-group row">
                    <label for="luong" class="col-2 text-right">Lương chính</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="luong" 
                               pattern="^[0-9,]{1,12}$" maxlength="12"
                               value="<%=formatter.format(user.getLuong())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                </div>
                </div>

                <div class="form-group row">
                    <label for="thuong" class="col-2 text-right">Thưởng</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="thuong"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getThuong())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                    
                    <label for="dinhMucThuong" class="col-3 text-right">Định mức thưởng</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="dinhMucThuong" 
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getDinhMucThuong())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="tienLamThemGio" class="col-2 text-right">Tiền làm thêm giờ</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="tienLamThemGio"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getLamThem())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                    
                    <label for="dinhMucTienLamThemGio" class="col-3 text-right">Định mức tiền làm thêm giờ</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="dinhMucTienLamThemGio"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getDinhMucLamThem())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="phuCapTienAn" class="col-2 text-right">Phụ cấp 1 (ăn uống)</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="phuCapTienAn"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getPhuCap1())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="phuCapTrangPhuc" class="col-2 text-right">Phụ cấp 2 (trang phục)</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="phuCapTrangPhuc"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getPhuCap2())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="phuCapDiLai" class="col-2 text-right">Phụ cấp 3 (đi lại)</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="phuCapDiLai"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getPhuCap3())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                    
                    <label for="dinhMucPhuCapDiLai" class="col-3 text-right">Định mức phụ cấp 3</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="dinhMucPhuCapDiLai"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getDinhMucPhuCap3())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="phuCapKhac" class="col-2 text-right">Phụ cấp 4 (khác)</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="phuCapKhac"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getPhuCap4())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                    
                    <label for="dinhMucPhuCapKhac" class="col-3 text-right">Định mức phụ cấp 4</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="dinhMucPhuCapKhac"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getDinhMucPhuCap4())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="soNguoiPhuThuoc" class="col-2 text-right">Số người phụ thuộc</label>
                    <div class="col-3">
                        <input type="text" class="form-control" name="soNguoiPhuThuoc"
                               pattern="^[0-9]{1,12}$" maxlength="12" 
                               title="Tối đa 12 chữ số"
                               value="<%=formatter.format(user.getSoNguoiPhuThuoc())%>">
                        <div class="invalid-feedback">Tối đa 12 chữ số</div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="mx-auto">
                        <input type="submit" class="btn btn-info" value="Tính thuế">
                    </div>
                </div>
            </form>
        </div>
        <% } else { %>
        <jsp:include page="login.jsp"></jsp:include>
        <% }%>
    </body>
</html>
