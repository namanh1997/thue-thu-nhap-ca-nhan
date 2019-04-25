<%-- 
    Document   : tax-calculation
    Created on : Apr 6, 2019, 9:58:10 PM
    Author     : NamAnh
--%>

<%@page import="controller.TaxCalculation"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tính thuế</title>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-3.4.0.min.js"></script>

    </head>
    <body>
        <%
            User user = (User) request.getSession().getAttribute("user");
            DecimalFormat formatter = new DecimalFormat("###,###,###,###");
            if (user != null) {
        %>
        <jsp:include page="header.jsp"></jsp:include>

        <div class="container">
            <div class="form-group row">
                <label for="hop-dong-lao-dong" class="col-2 text-right">Hợp đồng lao động</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="hopDong" 
                           value="<%if (user.getSoThangHopDongLaoDong() == 1) {
                           %>từ 3 tháng trở lên<%} 
                            else {%>dưới 3 tháng<%}%>" 
                    readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="luong" class="col-2 text-right">Lương chính</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="luong" 
                           value="<%=formatter.format(user.getLuong())%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="thuong" class="col-2 text-right">Thưởng</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="thuong" 
                           value="<%=formatter.format(user.getThuong())%>" readonly>
                </div>

                <label for="dinh-muc-thuong" class="col-3 text-right">Định mức thưởng</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="dinh-muc-thuong"
                           value="<%=formatter.format(user.getDinhMucThuong())%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="tien-lam-them-gio" class="col-2 text-right">Tiền làm thêm giờ</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="tien-lam-them-gio"
                           value="<%=formatter.format(user.getLamThem())%>" readonly>
                </div>

                <label for="dinh-muc-tien-lam-them-gio" class="col-3 text-right">Định mức tiền làm thêm giờ</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="dinh-muc-tien-lam-them-gio"
                           value="<%=formatter.format(user.getDinhMucLamThem())%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="phu-cap-tien-an" class="col-2 text-right">Phụ cấp 1 (ăn uống)</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="phu-cap-tien-an"
                           value="<%=formatter.format(user.getPhuCap1())%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="phu-cap-trang-phuc" class="col-2 text-right">Phụ cấp 2 (trang phục)</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="phu-cap-trang-phuc"
                           value="<%=formatter.format(user.getPhuCap2())%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="phu-cap-di-lai" class="col-2 text-right">Phụ cấp 3 (đi lại)</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="phu-cap-di-lai"
                           value="<%=formatter.format(user.getPhuCap3())%>" readonly>
                </div>

                <label for="dinh-muc-phu-cap-di-lai" class="col-3 text-right">Định mức phụ cấp 3</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="dinh-muc-phu-cap-di-lai"
                           value="<%=formatter.format(user.getDinhMucPhuCap3())%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="phu-cap-khac" class="col-2 text-right">Phụ cấp 4 (khác)</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="phu-cap-khac"
                           value="<%=formatter.format(user.getPhuCap4())%>" readonly>
                </div>

                <label for="dinh-muc-phu-cap-khac" class="col-3 text-right">Định mức phụ cấp 4</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="dinh-muc-phu-cap-khac"
                           value="<%=formatter.format(user.getDinhMucPhuCap4())%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="so-nguoi-phu-thuoc" class="col-2 text-right">Số người phụ thuộc</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="so-nguoi-phu-thuoc"
                           value="<%=formatter.format(user.getSoNguoiPhuThuoc())%>" readonly>
                </div>
            </div>

            <hr>

            <div class="form-group row">
                <label for="tong-thu-nhap" class="col-2 text-right">Tổng thu nhập</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="tong-thu-nhap"
                           value="<%=formatter.format(TaxCalculation.tinhTongThuNhap(user))%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="thu-nhap-mien-thue" class="col-2 text-right">Thu nhập miễn thuế</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="thu-nhap-mien-thue"
                           value="<%=formatter.format(TaxCalculation.tinhThuNhapMienThue(user))%>" readonly>
                </div>
            </div> 

            <div class="form-group row">
                <label for="thu-nhap-chiu-thue" class="col-2 text-right">Thu nhập chịu thuế</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="thu-nhap-chiu-thue"
                           value="<%=formatter.format(TaxCalculation.tinhThuNhapChiuThue(user))%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="cac-khoan-giam-tru" class="col-2 text-right">Các khoản giảm trừ</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="cac-khoan-giam-tru"
                           value="<%=formatter.format(TaxCalculation.tinhCacKhoanGiamTru(user))%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="thu-nhap-tinh-thue" class="col-2 text-right">Thu nhập tính thuế</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="thu-nhap-tinh-thue"
                           value="<%=formatter.format(TaxCalculation.tinhThuNhapTinhThue(user))%>" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label for="thue-phai-dong" class="col-2 text-right">Thuế phải đóng</label>
                <div class="col-3">
                    <input type="text" class="form-control" name="thue-phai-dong"
                           value="<%=formatter.format(TaxCalculation.tinhThuePhaiNop(user))%>" readonly>
                </div>
            </div>
        </div>
        <% } else { %>
        <jsp:include page="login.jsp"></jsp:include>
        <% }%>
    </body>
</html>
