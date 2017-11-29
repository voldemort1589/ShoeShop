<%@tag description="Store Page template" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true" %>
<%@attribute name="content" fragment="true" %>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
	<meta charset="utf-8" />
	<title>ShoeShop - <jsp:invoke fragment="title"/></title>
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/favicon.ico" />
	
	<!-- ================== BEGIN BASE CSS STYLE ================== -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/assets/css/style.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/assets/css/style-responsive.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/assets/css/theme/default.css" id="theme" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/assets/css/animate.min.css" rel="stylesheet" />
	<!-- ================== END BASE CSS STYLE ================== -->
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="${pageContext.request.contextPath}/assets/plugins/pace/pace.min.js"></script>
	<!-- ================== END BASE JS ================== -->
</head>
<body>
    <!-- BEGIN #page-container -->
    <div id="page-container" class="fade">
        <!-- BEGIN #top-nav -->
        <div id="top-nav" class="top-nav">
            <!-- BEGIN container -->
            <div class="container">
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="dropdown dropdown-hover">
                            <a href="#" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/assets/img/english.png" class="flag-img" alt="" /> English <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><img src="${pageContext.request.contextPath}/assets/img/english.png" class="flag-img" alt="" /> English</a></li>
                                <li><a href="#"><img src="${pageContext.request.contextPath}/assets/img/german.png" class="flag-img" alt="" /> German</a></li>
                                <li><a href="#"><img src="${pageContext.request.contextPath}/assets/img/spanish.png" class="flag-img" alt="" /> Spanish</a></li>
                                <li><a href="#"><img src="${pageContext.request.contextPath}/assets/img/french.png" class="flag-img" alt="" /> French</a></li>
                                <li><a href="#"><img src="${pageContext.request.contextPath}/assets/img/chinese.png" class="flag-img" alt="" /> Chinese</a></li>
                            </ul>
                        </li>
                        <li><a href="#">Customer Care</a></li>
                        <li><a href="#">Order Tracker</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Career</a></li>
                        <li><a href="#">Our Forum</a></li>
                        <li><a href="#">Newsletter</a></li>
                        <li><a href="#"><i class="fa fa-facebook f-s-14"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter f-s-14"></i></a></li>
                        <li><a href="#"><i class="fa fa-instagram f-s-14"></i></a></li>
                        <li><a href="#"><i class="fa fa-dribbble f-s-14"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus f-s-14"></i></a></li>
                    </ul>
                </div>
            </div>
            <!-- END container -->
        </div>
        <!-- END #top-nav -->
    
        <!-- BEGIN #header -->
        <div id="header" class="header">
            <!-- BEGIN container -->
            <div class="container">
                <!-- BEGIN header-container -->
                <div class="header-container">
                    <!-- BEGIN navbar-header -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <div class="header-logo">
                            <a href="index.html">
                                <img src="${pageContext.request.contextPath}/assets/img/logo.png" style="width:72px; height: 56px" />
                                <span>Shoe</span>Shop
                                <!-- <small>ร้านขายรองเท้าชื่อดัง</small> -->
                            </a>
                        </div>
                    </div>
                    <!-- END navbar-header -->
                    <!-- BEGIN header-nav -->
                    <div class="header-nav">
                        <div class=" collapse navbar-collapse" id="navbar-collapse">
                            <ul class="nav">
                                <li class="active"><a href="${pageContext.request.contextPath}/Store">Home</a></li>
                                <li><a href="index.html">สินค้าลดราคา</a></li>
                                <li><a href="index.html">แจ้งชำระเงิน</a></li>
                                <li><a href="index.html">วิธีชำระเงิน</a></li>
                                <li><a href="index.html">ติดต่อเรา</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- END header-nav -->
                    <!-- BEGIN header-nav -->
                    <div class="header-nav">
                        <ul class="nav pull-right">
                            <li class="dropdown dropdown-hover">
                                <a href="#" class="header-cart" data-toggle="dropdown">
                                    <i class="fa fa-shopping-bag"></i>
                                    <span class="total">2</span>
                                    <span class="arrow top"></span>
                                </a>
                    
                                <div class="dropdown-menu dropdown-menu-cart p-0">
                                    <div class="cart-header">
                                        <h4 class="cart-title">Shopping Bag (1) </h4>
                                    </div>
                                    <div class="cart-body">
                                        <ul class="cart-item">
                                            <li>
                                                <div class="cart-item-image"><img src="${pageContext.request.contextPath}/assets/img/ipad.jpg" alt="" /></div>
                                                <div class="cart-item-info">
                                                    <h4>iPad Pro Wi-Fi 128GB - Silver</h4>
                                                    <p class="price">$699.00</p>
                                                </div>
                                                <div class="cart-item-close">
                                                    <a href="#" data-toggle="tooltip" data-title="Remove">&times;</a>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="cart-item-image"><img src="${pageContext.request.contextPath}/assets/img/imac.jpg" alt="" /></div>
                                                <div class="cart-item-info">
                                                    <h4>21.5-inch iMac</h4>
                                                    <p class="price">$1299.00</p>
                                                </div>
                                                <div class="cart-item-close">
                                                    <a href="#" data-toggle="tooltip" data-title="Remove">&times;</a>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="cart-item-image"><img src="${pageContext.request.contextPath}/assets/img/iphone.png" alt="" /></div>
                                                <div class="cart-item-info">
                                                    <h4>iPhone 6s 16GB - Silver</h4>
                                                    <p class="price">$649.00</p>
                                                </div>
                                                <div class="cart-item-close">
                                                    <a href="#" data-toggle="tooltip" data-title="Remove">&times;</a>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="cart-footer">
                                        <div class="row row-space-10">
                                            <div class="col-xs-6">
                                                <a href="checkout_cart.html" class="btn btn-default btn-block">View Cart</a>
                                            </div>
                                            <div class="col-xs-6">
                                                <a href="checkout_cart.html" class="btn btn-inverse btn-block">Checkout</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="${pageContext.request.contextPath}/Login">
                                    <img src="${pageContext.request.contextPath}/assets/img/user-1.jpg" class="user-img" alt="" /> 
                                    <span class="hidden-md hidden-sm hidden-xs">Login / Register</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <!-- END header-nav -->
                </div>
                <!-- END header-container -->
            </div>
            <!-- END container -->
        </div>
        <!-- END #header -->
        
        <jsp:doBody/>
    
        <!-- BEGIN #footer -->
        <div id="footer" class="footer">
            <!-- BEGIN container -->
            <div class="container">
                <!-- BEGIN row -->
                <div class="row">
                    <!-- BEGIN col-3 -->
                    <div class="col-md-3">
                        <h4 class="footer-header">ABOUT US</h4>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nec tristique dolor, ac efficitur velit. Nulla lobortis tempus convallis. Nulla aliquam lectus eu porta pulvinar. Mauris semper justo erat. 
                        </p>
                        <p>
                            Vestibulum porttitor lorem et vestibulum pharetra. Phasellus sit amet mi congue, hendrerit mi ut, dignissim eros.
                        </p>
                    </div>
                    <!-- END col-3 -->
                    <!-- BEGIN col-3 -->
                    <div class="col-md-3">
                        <h4 class="footer-header">RELATED LINKS</h4>
                        <ul class="fa-ul">
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Shopping Help</a></li>
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Terms of Use</a></li>
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Contact Us</a></li>
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Careers</a></li>
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Payment Method</a></li>
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Sales & Refund</a></li>
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Sitemap</a></li>
                            <li><i class="fa fa-li fa-angle-right"></i> <a href="#">Privacy & Policy</a></li>
                        </ul>
                    </div>
                    <!-- END col-3 -->
                    <!-- BEGIN col-3 -->
                    <div class="col-md-3">
                        <h4 class="footer-header">LATEST PRODUCT</h4>
                        <ul class="list-unstyled list-product">
                            <li>
                                <div class="image">
                                    <img src="${pageContext.request.contextPath}/assets/img/iphone-6s.jpg" alt="" />
                                </div>
                                <div class="info">
                                    <h4 class="info-title">Iphone 6s</h4>
                                    <div class="price">$1200.00</div>
                                </div>
                            </li>
                            <li>
                                <div class="image">
                                    <img src="${pageContext.request.contextPath}/assets/img/galaxy-s6.jpg" alt="" />
                                </div>
                                <div class="info">
                                    <h4 class="info-title">Samsung Galaxy s7</h4>
                                    <div class="price">$850.00</div>
                                </div>
                            </li>
                        
                            <li>
                                <div class="image">
                                    <img src="${pageContext.request.contextPath}/assets/img/ipad-pro.jpg" alt="" />
                                </div>
                                <div class="info">
                                    <h4 class="info-title">Ipad Pro</h4>
                                    <div class="price">$800.00</div>
                                </div>
                            </li>
                            <li>
                                <div class="image">
                                    <img src="${pageContext.request.contextPath}/assets/img/galaxy-note5.jpg" alt="" />
                                </div>
                                <div class="info">
                                    <h4 class="info-title">Samsung Galaxy Note 5</h4>
                                    <div class="price">$1200.00</div>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <!-- END col-3 -->
                    <!-- BEGIN col-3 -->
                    <div class="col-md-3">
                        <h4 class="footer-header">OUR CONTACT</h4>
                        <address>
                            <strong>Twitter, Inc.</strong><br />
                            1355 Market Street, Suite 900<br />
                            San Francisco, CA 94103<br /><br />
                            <abbr title="Phone">Phone:</abbr> (123) 456-7890<br />
                            <abbr title="Fax">Fax:</abbr> (123) 456-7891<br />
                            <abbr title="Email">Email:</abbr> <a href="mailto:sales@myshop.com">sales@myshop.com</a><br />
                            <abbr title="Skype">Skype:</abbr> <a href="skype:myshop">myshop</a>
                        </address>
                    </div>
                    <!-- END col-3 -->
                </div>
                <!-- END row -->
            </div>
            <!-- END container -->
        </div>
        <!-- END #footer -->
    
        <!-- BEGIN #footer-copyright -->
        <div id="footer-copyright" class="footer-copyright">
            <!-- BEGIN container -->
            <div class="container">
                <div class="payment-method">
                    <img src="${pageContext.request.contextPath}/assets/img/payment_method.png" alt="" />
                </div>
                <div class="copyright">
                    Copyright &copy; 2016 SeanTheme. All rights reserved.
                </div>
            </div>
            <!-- END container -->
        </div>
        <!-- END #footer-copyright -->
    </div>
    <!-- END #page-container -->
    
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-1.9.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-migrate-1.1.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!--[if lt IE 9]>
		<script src="${pageContext.request.contextPath}/assets/crossbrowserjs/html5shiv.js"></script>
		<script src="${pageContext.request.contextPath}/assets/crossbrowserjs/respond.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/crossbrowserjs/excanvas.min.js"></script>
	<![endif]-->
	<script src="${pageContext.request.contextPath}/assets/plugins/jquery-cookie/jquery.cookie.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/apps.min.js"></script>
	<!-- ================== END BASE JS ================== -->
	
	<script>
	    $(document).ready(function() {
	        App.init();
	    });
	</script>
</body>
</html>
