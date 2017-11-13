<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:master>
  <jsp:attribute name="title">Add Discount</jsp:attribute>
  <jsp:body>
      <!-- SELECT2 EXAMPLE -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">เพิ่มโปรโมชั่น</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div>
        </div>
        <!-- /.box-header -->
        <form class="form-horizontal" method="post">
          <div class="box-body">
          
          
            <div class="form-group">
              <label for="Product_id" class="col-sm-2 control-label">Product Id</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name" placeholder="Product Id">
              </div>
            </div>
            
            <div class="form-group">
              <label for="Topic" class="col-sm-2 control-label">Topic</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="usernmae" name="usernmae" placeholder="Topic">
              </div>
            </div>
            
            <div class="form-group">
              <label for="password" class="col-sm-2 control-label">Product</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="password" name="password" placeholder="Password">
              </div>
            </div>
            
            <div class="form-group">
              <label for="Discount" class="col-sm-2 control-label">discount</label>
              <div class="col-sm-10">
                <input type="int" class="form-control" id="email" name="email" placeholder="discount">
              </div>
            </div>
            
            <div class="form-group">
              <label for="StartDate" class="col-sm-2 control-label">startDate</label>
              <div class="col-sm-10">
                <input type="datetime" class="form-control" id="phone" name="phone" placeholder="14/11/2560">
              </div>
            </div>
            
            <div class="form-group">
              <label for="EndDate" class="col-sm-2 control-label">endDate</label>
              <div class="col-sm-10">
                <input type="datetime" class="form-control" id="address" name="address" placeholder="14/11/2560">
              </div>
            </div>
            
            
            
          </div>
          <!-- /.box-body -->
          <div class="box-footer">
            <button type="reset" class="btn btn-default">Cancel</button>
            <button type="submit" class="btn btn-info pull-right">บันทึก</button>
          </div>
          <!-- /.box-footer -->
        </form>
      </div>
      <!-- /.box -->
   </jsp:body>
</t:master>