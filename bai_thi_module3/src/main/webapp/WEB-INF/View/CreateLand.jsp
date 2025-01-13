<%--
  Created by IntelliJ IDEA.
  User: macintosh
  Date: 13/01/2025 A
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<body>

<div class="container">
  <h1>Thêm mới mặt bằng cho thuê</h1>
  <form action="/land?action=create" method="post">
    <div class="mb-3">
      <label for="id_land" class="form-label">Mã mặt bằng (*)</label>
      <input type="text" pattern="[A-Z0-9]{3}-[A-Z0-9]{2}-[A-Z0-9]{2}" title="Định dạng phải là XXX-XX-XX với chữ hoa và số" required class="form-control" id="id_land" name="id_land">
    </div>
    <div class="mb-3">
      <label for="area" class="form-label">Diện tích (*)</label>
      <input type="text" class="form-control" id="area" name="area" required>
    </div>
    <div class="mb-3">
      <label for="status">Trạng thái (*)</label>
      <select class="form-select" id="status" name="status" required>
        <option value="Trống">Trống</option>
        <option value="Hạ Tầng">Hạ Tầng</option>
        <option value="Đầy đủ">Đầy đủ</option>
      </select>
    </div>
    <div class="mb-3">
      <label for="floor" class="form-label">Tầng (*)</label>
      <input type="text" class="form-control" id="floor" name="floor" required>
    </div>
    <div class="mb-3">
      <label for="type">Loại văn phòng (*)</label>
      <select class="form-select" id="type" name="type" required>
        <option value="Văn phòng chia sẻ">Văn phòng chia sẻ</option>
        <option value="Văn phòng trọn gói">Văn phòng trọn gói</option>
      </select>
    </div>
    <div>
      <textarea name="description" id="description" cols="30" rows="10"></textarea>
    </div>
    <div class="mb-3">
      <label for="price" class="form-label">Giá cho thuê (*)</label>
      <input type="number" class="form-control" id="price" name="price" min="1000000" title="Giá tiền phải lớn hơn 1000000"required>
    </div>
    <div class="mb-3">
      <label for="start_date" class="form-label">Ngày bắt đầu (*)</label>
      <input pattern="^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/\d{4}$" placeholder="dd/mm/yyyy" type="text" class="form-control" id="start_date" name="start_date" required>
    </div>
    <div class="mb-3">
      <label for="end_date" class="form-label">Ngày kết thúc (*)</label>
      <input pattern="^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/\d{4}$" placeholder="dd/mm/yyyy" type="text" class="form-control" id="end_date" name="end_date" required>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
