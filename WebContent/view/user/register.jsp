<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
    <t:guess>
      <jsp:attribute name="title">สมัครสมาชิก</jsp:attribute>
      <jsp:body>
        <div class="login-box">
          <div class="login-logo">
            <a href="">
              <b>ShoeShop</b>
            </a>
          </div>
          <!-- /.login-logo -->
          <div class="login-box-body">
            <p class="login-box-msg">สมัครสมาชิก</p>

            <form action="${pageContext.request.contextPath}/Customer?action=register" method="post">
              <div class="form-group has-feedback">
                <input type="text" class="form-control" name="name" placeholder="Full name">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
              </div>
              <div class="form-group has-feedback">
                <input type="text" class="form-control" name="username" placeholder="Username">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
              </div>
              <div class="form-group has-feedback">
                <input type="password" class="form-control" name="password" placeholder="Password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
              </div>
              <div class="form-group has-feedback">
                <input type="password" class="form-control" name="passcon" placeholder="Retype password">
                <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
              </div>
              <div class="row">
                <div class="col-xs-8">
                  <div class="checkbox icheck">
                    <label>
                      <input type="checkbox"> I agree to the
                      <a href="#">terms</a>
                    </label>
                  </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                  <button type="submit" class="btn btn-primary btn-block btn-flat">Register</button>
                </div>
                <!-- /.col -->
              </div>
            </form>


          </div>
          <!-- /.login-box-body -->
        </div>
        <!-- /.login-box -->
      </jsp:body>
    </t:guess>