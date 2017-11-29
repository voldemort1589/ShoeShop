<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:store>
  <jsp:attribute name="title">Store</jsp:attribute>
  <jsp:body>
        <!-- BEGIN #slider -->
        <div id="slider" class="section-container p-0 bg-black-darker">
            <!-- BEGIN carousel -->
            <div id="main-carousel" class="carousel slide" data-ride="carousel">
                <!-- BEGIN carousel-inner -->
                <div class="carousel-inner"> 
                    <!-- BEGIN item -->
                    <div class="item active">
                        <img src="${pageContext.request.contextPath}/assets/img/slider-1-cover.jpg" class="bg-cover-img" alt="" />
                        <div class="container">
                            <img src="${pageContext.request.contextPath}/assets/img/slider-1-product.png" class="product-img right bottom fadeInRight animated" alt="" />
                        </div>
                        <div class="carousel-caption carousel-caption-left">
                            <div class="container">
                                <h3 class="title m-b-5 fadeInLeftBig animated">iMac</h3> 
                                <p class="m-b-15 fadeInLeftBig animated">Retina. Now in colossal and ginormous.</p>
                                <div class="price m-b-30 fadeInLeftBig animated"><small>from</small> <span>$649.00</span></div>
                                <a href="#" class="btn btn-outline btn-lg fadeInLeftBig animated">Buy Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- END item -->
                    <!-- BEGIN item -->
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/assets/img/slider-2-cover.jpg" class="bg-cover-img" alt="" />
                        <div class="container">
                            <img src="${pageContext.request.contextPath}/assets/img/slider-2-product.png" class="product-img left bottom fadeInLeft animated" alt="" />
                        </div>
                        <div class="carousel-caption carousel-caption-right">
                            <div class="container">
                                <h3 class="title m-b-5 fadeInRightBig animated">iPhone 6s</h3> 
                                <p class="m-b-15 fadeInRightBig animated">The only thing that’s changed is everything</p>
                                <div class="price m-b-30 fadeInRightBig animated"><small>from</small> <span>$1,299.00</span></div>
                                <a href="#" class="btn btn-outline btn-lg fadeInRightBig animated">Buy Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- END item -->
                    <!-- BEGIN item -->
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/assets/img/slider-3-cover.jpg" class="bg-cover-img" alt="" />
                        <div class="carousel-caption">
                            <div class="container">
                                <h3 class="title m-b-5 fadeInDownBig animated">Macbook Air</h3> 
                                <p class="m-b-15 fadeInDownBig animated">Thin.Light.Powerful.<br />And ready for anything</p>
                                <div class="price fadeInDownBig animated"><small>from</small> <span>$999.00</span></div>
                                <a href="#" class="btn btn-outline btn-lg fadeInUpBig animated">Buy Now</a>
                            </div>
                        </div>
                    </div>
                    <!-- END item -->
                </div>
                <!-- END carousel-inner -->
                <a class="left carousel-control" href="#main-carousel" data-slide="prev"> 
                    <i class="fa fa-angle-left"></i> 
                </a>
                <a class="right carousel-control" href="#main-carousel" data-slide="next"> 
                    <i class="fa fa-angle-right"></i> 
                </a>
            </div>
            <!-- END carousel -->
        </div>
        <!-- END #slider -->
    
        <!-- BEGIN #trending-items -->
        <div id="trending-items" class="section-container bg-silver">
            <!-- BEGIN container -->
            <div class="container">
                <!-- BEGIN section-title -->
                <h4 class="section-title clearfix">
                    สินค้าทั้งหมด
                </h4>
                <!-- END section-title -->
            
                <!-- BEGIN row -->
                <div class="row row-space-10">
                	<c:forEach var="product" items="${listProducts}">
                    <!-- BEGIN col-2 -->
                    <div class="col-md-2 col-sm-4">
                        <!-- BEGIN item -->
                        <div class="item item-thumbnail">
                            <a href="${pageContext.request.contextPath}/Store?action=show" class="item-image">
                                <img src="${pageContext.request.contextPath}/assets/img/shoe.jpg" alt="" />
                                <div class="discount">15% OFF</div>
                            </a>
                            <div class="item-info">
                                <h4 class="item-title">
                                    <a href="${pageContext.request.contextPath}/Store?action=show">${product.name}</a>
                                </h4>
                                <p class="item-desc">สี ${product.color}</p>
                                <div class="item-price">${product.price} บาท</div>
                                <!-- <div class="item-discount-price">$739.00</div> -->
                                <button class="btn btn-theme btn-block">Add to cart</button>
                            </div>
                        </div>
                        <!-- END item -->
                    </div>
                    <!-- END col-2 -->
                    </c:forEach>
                </div>
                <!-- END row -->
            </div>
            <!-- END container -->
        </div>
        <!-- END #trending-items -->
   </jsp:body>
</t:store>