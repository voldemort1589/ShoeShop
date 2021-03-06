<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:master>
  <jsp:attribute name="title">Add Product</jsp:attribute>
  <jsp:body>
      <!-- SELECT2 EXAMPLE -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">เพิ่มสินค้า</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div>
        </div>
        <!-- /.box-header -->
        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/Product?action=add">
          <div class="box-body">
            
            <div class="form-group">
              <label for="Product_name" class="col-sm-2 control-label">Product Name</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="name" id="Product_name" placeholder="Product Name">
              </div>
            </div>
            
            <div class="form-group">
              <label for="Product_color" class="col-sm-2 control-label">color</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="color" id="Product_color" placeholder="red,green,blue,etc...">
              </div>
            </div>
            
            <div class="form-group">
              <label for="Product_size" class="col-sm-2 control-label">Product Size</label>
              <div class="col-sm-10">
                <input type="int" class="form-control" name="size" id="Product_size" placeholder="42,43,44,etc..">
              </div>
            </div>
            
              <div class="form-group">
              <label for="Product_amount" class="col-sm-2 control-label">Product Amount</label>
              <div class="col-sm-10">
                <input type="int" class="form-control" name="amount" id="Product_amount" placeholder="Product Amount">
              </div>
            </div>
            
              <div class="form-group">
              <label for="Product_price" class="col-sm-2 control-label">Product Price</label>
              <div class="col-sm-10">
                <input type="int" class="form-control" name="price" id="Product_price" placeholder="Product Price">
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