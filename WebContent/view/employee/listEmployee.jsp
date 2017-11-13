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
          			<th>#</th>
          			<th>ชื่อ</th>
          			<th>Email</th>
          			<th>เบอร์โทร</th>
          			<th>เงินเดือน</th>
          			<th>Actions</th>
          		</tr>
          	</thead>
          	<tbody>
          		<tr>
          			<td>1</td>
          			<td>ทดสอบ ทดลอง</td>
          			<td>todsob@gmail.com</td>
          			<td>0864251023</td>
          			<td>68000</td>
          			<td><a href="#">Edit</a> <a href="#">Delete</a></td>
          		</tr>
          	</tbody>
          </table>
        </div>
        <!-- /.box-body -->
      </div>
      <!-- /.box -->
   </jsp:body>
</t:master>