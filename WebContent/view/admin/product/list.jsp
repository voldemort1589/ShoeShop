<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:master>
  <jsp:attribute name="title">List Employee</jsp:attribute>
  <jsp:body>
      <!-- SELECT2 EXAMPLE -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">ตารางรายชื่อสินค้า</h3>

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
          			<th>Product_id</th>
          			<th>name</th>
          			<th>color</th>
          			<th>Size</th>
          			<th>Amount</th>
          			<th>Price</th>
          			<th>Discount</th>
          			<th>Adder</th>
          			<th>Actions</th>
          		</tr>
          	</thead>
          	<tbody>
			<c:forEach var="product" items="${listProducts}">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.color}</td>
					<td>${product.size}</td>
					<td>${product.price}</td>
					<td>${product.amount}</td>
					<td>${product.name}</td>
					<td>${product.name}</td>
					<td>
						<a href="${pageContext.request.contextPath}/Product?action=edit&id=${product.id}">Edit</a> 
						<a href="${pageContext.request.contextPath}/Product?action=delete&id=${product.id}" onclick="return confirm('ยืนยันการลบ');">Delete</a>
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