<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:master>
  <jsp:attribute name="title">List Customer</jsp:attribute>
  <jsp:body>
      <!-- SELECT2 EXAMPLE -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">ตารางรายชื่อสมาชิก</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div>
        </div>
        <!-- /.box-header -->
        <div class="box-body">
          <table class="table table-bordered">
          	<thead>
          		<tr>
          			<th>#</th>
          			<th>ชื่อ</th>
          			<th>ที่อยู่</th>
          			<th>Email</th>
          			<th>เบอร์โทร</th>
          			<th>Actions</th>
          		</tr>
          	</thead>
          	<tbody>
          		<c:forEach var="user" items="${listUsers}">
          		<tr>
          			<td>1</td>
          			<td>${user.name}</td>
          			<td>${user.address}</td>
          			<td>${user.email}</td>
          			<td>${user.phone}</td>
          			<td><a href="#">Edit</a> <a href="#">Delete</a></td>
          		</tr>
          		</c:forEach>
          	</tbody>
          </table>
        </div>
        <!-- /.box-body -->
      </div>
      <!-- /.box -->
   </jsp:body>
</t:master>