<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:master>
  <jsp:attribute name="title">List Employee</jsp:attribute>
  <jsp:body>
      <!-- SELECT2 EXAMPLE -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">ตารางรายชื่อพนักงาน</h3>

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
          			<th>ชื่อ</th>
          			<th>Email</th>
          			<th>เบอร์โทร</th>
          			<th>เงินเดือน</th>
          			<th>Actions</th>
          		</tr>
          	</thead>
          	<tbody>
          		<c:forEach var="user" items="${listUsers}">
          		<tr>
          			<td>${user.name}</td>
          			<td>${user.email}</td>
          			<td>${user.phone}</td>
          			<td>${user.salary}</td>
          			<td>
          				<a href="${pageContext.request.contextPath}/Employee?action=edit&id=${user.id}">Edit</a>
          				<a href="${pageContext.request.contextPath}/Employee?action=delete&id=${user.id}" onclick="return confirm('ยืนยันการลบ');">Delete</a>
          			</td>
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