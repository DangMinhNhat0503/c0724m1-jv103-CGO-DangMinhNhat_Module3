<%--
  Created by IntelliJ IDEA.
  User: macintosh
  Date: 13/01/2025 A
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách mặt bằng cho thuê</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
<div class="container">
  <button class="btn btn-primary" onclick="window.location.href='/land?action=create'">Thêm mới</button>
  <table class="table table-hover">
    <thead>
    <tr>
      <th>Mã mặt bằng (*)</th>
      <th>Diện tích (*)</th>
      <th>Trạng thái (*)</th>
      <th>Tầng (*)</th>
      <th>Loại văn phòng (*)</th>
      <th>Giá cho thuê (*)</th>
      <th>Ngày bắt đầu (*)</th>
      <th>Ngày kết thúc (*)</th>
      <th colspan="2">Chức năng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lands}" var="land" varStatus="temp">
      <tr>
        <td>${land.id_land}</td>
        <td>${land.area}</td>
        <td>${land.status}</td>
        <td>${land.floor}</td>
        <td>${land.type}</td>
        <td>${land.price}</td>
        <td>${land.start_date}</td>
        <td>${land.end_date}</td>
        <td>
          <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#modalDelete${land.id_land}">
            Xóa
          </button>
        </td>
        <div class="modal fade" id="modalDelete${land.id_land}" tabindex="-1"
             aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Xóa dữ liệu</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal"
                        aria-label="Close"></button>
              </div>
              <div class="modal-body">
                Bạn có chắc chắn muốn xóa mặt bằng thuê có ID là ${land.id_land}!!!
                <small style="color:red; font-style: italic">Lưu ý hành động này không thể hoàn tác
                  !</small>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Đóng</button>
                <button type="button" class="btn btn-danger"
                        onclick="window.location.href='/land?action=delete&id=${land.id_land}'"> Xác
                  nhận
                </button>
              </div>
            </div>
          </div>
        </div>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <c:if test="${message != null}">
  <div class="alert alert-success" role="alert" id="message">
      ${message}
  </div>
  </c:if>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
