<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:store>
  <jsp:attribute name="title">Product Detail</jsp:attribute>
  <jsp:body>
<!-- BEGIN #product -->
      <div id="product" class="section-container p-t-20">
          <!-- BEGIN container -->
          <div class="container">
              <!-- BEGIN breadcrumb -->
              <ul class="breadcrumb m-b-10 f-s-12">
                  <li><a href="#">Home</a></li>
                  <li><a href="#">Mobile Phone</a></li>
                  <li><a href="#">Apple</a></li>
                  <li class="active">iPhone 6S Plus</li>
              </ul>
              <!-- END breadcrumb -->
              
              <!-- BEGIN product -->
              <div class="product">
                  <!-- BEGIN product-detail -->
                  <div class="product-detail">
                      <!-- BEGIN product-image -->
                      <div class="product-image">
                          <!-- BEGIN product-thumbnail -->
                          <div class="product-thumbnail">
                              <ul class="product-thumbnail-list">
                                  <li class="active"><a href="#" data-click="show-main-image" data-url="assets/img/iphone-6s-plus-2.jpg"><img src="assets/img/iphone-6s-plus-2.jpg" alt="" /></a></li>
                                  <li><a href="#" data-click="show-main-image" data-url="assets/img/iphone-6s-plus-3.jpg"><img src="assets/img/iphone-6s-plus-3.jpg" alt="" /></a></li>
                                  <li><a href="#" data-click="show-main-image" data-url="assets/img/iphone-6s-plus-4.jpg"><img src="assets/img/iphone-6s-plus-4.jpg" alt="" /></a></li>
                                  <li><a href="#" data-click="show-main-image" data-url="assets/img/iphone-6s-plus-5.jpg"><img src="assets/img/iphone-6s-plus-5.jpg" alt="" /></a></li>
                                  <li><a href="#" data-click="show-main-image" data-url="assets/img/iphone-6s-plus-6.jpg"><img src="assets/img/iphone-6s-plus-6.jpg" alt="" /></a></li>
                                  <li><a href="#" data-click="show-main-image" data-url="assets/img/iphone-6s-plus-7.jpg"><img src="assets/img/iphone-6s-plus-7.jpg" alt="" /></a></li>
                              </ul>
                          </div>
                          <!-- END product-thumbnail -->
                          <!-- BEGIN product-main-image -->
                          <div class="product-main-image" data-id="main-image">
                              <img src="assets/img/iphone-6s-plus.png" alt="" />
                          </div>
                          <!-- END product-main-image -->
                      </div>
                      <!-- END product-image -->
                      <!-- BEGIN product-info -->
                      <div class="product-info">
                          <!-- BEGIN product-info-header -->
                          <div class="product-info-header">
                              <h1 class="product-title"><span class="label label-success">41% OFF</span> Apple iPhone 6S Plus (16GB) Silver - #89270182 </h1>
                              <ul class="product-category">
                                  <li><a href="#">iPhone</a></li>
                                  <li>/</li>
                                  <li><a href="#">mobile phone</a></li>
                                  <li>/</li>
                                  <li><a href="#">electronics</a></li>
                                  <li>/</li>
                                  <li><a href="#">lifestyle</a></li>
                              </ul>
                          </div>
                          <!-- END product-info-header -->
                          <!-- BEGIN product-warranty -->
                          <div class="product-warranty">
                              <div class="pull-right">Availability: In stock</div>
                              <div><b>1 Year</b> Local Manufacturer Warranty</div>
                          </div>
                          <!-- END product-warranty -->
                          <!-- BEGIN product-info-list -->
                          <ul class="product-info-list">
                              <li><i class="fa fa-circle"></i> 5.5" Retina HD Display with 3D Touch</li>
                              <li><i class="fa fa-circle"></i> Fingerprint-resistant oleophobic coating</li>
                              <li><i class="fa fa-circle"></i> A9 chip with 64-bit</li>
                              <li><i class="fa fa-circle"></i> Ultrafast 4G LTE Advanced wireless</li>
                              <li><i class="fa fa-circle"></i> New 12-megapixel iSight camera</li>
                              <li><i class="fa fa-circle"></i> 4k video recording</li>
                              <li><i class="fa fa-circle"></i> iOS 9 with Touch ID and Apple Pay</li>
                          </ul>
                          <!-- END product-info-list -->
                          <!-- BEGIN product-social -->
                          <div class="product-social">
                              <ul>
                                  <li><a href="javascript:;" class="facebook" data-toggle="tooltip" data-trigger="hover" data-title="Facebook" data-placement="top"><i class="fa fa-facebook"></i></a></li>
                                  <li><a href="javascript:;" class="twitter" data-toggle="tooltip" data-trigger="hover" data-title="Twitter" data-placement="top"><i class="fa fa-twitter"></i></a></li>
                                  <li><a href="javascript:;" class="google-plus" data-toggle="tooltip" data-trigger="hover" data-title="Google Plus" data-placement="top"><i class="fa fa-google-plus"></i></a></li>
                                  <li><a href="javascript:;" class="whatsapp" data-toggle="tooltip" data-trigger="hover" data-title="Whatsapp" data-placement="top"><i class="fa fa-whatsapp"></i></a></li>
                                  <li><a href="javascript:;" class="tumblr" data-toggle="tooltip" data-trigger="hover" data-title="Tumblr" data-placement="top"><i class="fa fa-tumblr"></i></a></li>
                              </ul>
                          </div>
                          <!-- END product-social -->
                          <!-- BEGIN product-purchase-container -->
                          <div class="product-purchase-container">
                              <div class="product-discount">
                                  <span class="discount">$869.00</span>
                              </div>
                              <div class="product-price">
                                  <div class="price">$749.00</div>
                              </div>
                              <button class="btn btn-inverse btn-lg" type="submit">ADD TO CART</button>
                          </div>
                          <!-- END product-purchase-container -->
                      </div>
                      <!-- END product-info -->
                  </div>
                  <!-- END product-detail -->
                  <!-- BEGIN product-tab -->
                  <div class="product-tab">
                      <!-- BEGIN #product-tab -->
                      <ul id="product-tab" class="nav nav-tabs">
                          <li class="active"><a href="#product-desc" data-toggle="tab">Product Description</a></li>
                          <li class=""><a href="#product-info" data-toggle="tab">Additional Information</a></li>
                          <li class=""><a href="#product-reviews" data-toggle="tab">Rating & Reviews (5)</a></li>
                      </ul>
                      <!-- END #product-tab -->
                      <!-- BEGIN #product-tab-content -->
                      <div id="product-tab-content" class="tab-content">
                          <!-- BEGIN #product-desc -->
                          <div class="tab-pane fade active in" id="product-desc">
                              <!-- BEGIN product-desc -->
                              <div class="product-desc">
                                  <div class="image">
                                      <img src="assets/img/product-main.jpg" alt="" />
                                  </div>
                                  <div class="desc">
                                      <h4>iPhone 6s</h4>
                                      <p>
                                          The moment you use iPhone 6s, you know you’ve never felt anything like it. With a single press, 3D Touch lets you do more than ever before. Live Photos bring your memories to life in a powerfully vivid way. And that’s just the beginning. Take a deeper look at iPhone 6s, and you’ll find innovation on every level.
                                      </p>
                                  </div>
                              </div>
                              <!-- END product-desc -->
                              <!-- BEGIN product-desc -->
                              <div class="product-desc right">
                                  <div class="image">
                                      <img src="assets/img/product-3dtouch.jpg" alt="" />
                                  </div>
                                  <div class="desc">
                                      <h4>3D Touch</h4>
                                      <p>
                                          The original iPhone introduced the world to Multi-Touch, forever changing the way people experience technology. With 3D Touch, you can do things that were never possible before. It senses how deeply you press the display, letting you do all kinds of essential things more quickly and simply. And it gives you real-time feedback in the form of subtle taps from the all-new Taptic Engine.
                                      </p>
                                  </div>
                              </div>
                              <!-- END product-desc -->
                              <!-- BEGIN product-desc -->
                              <div class="product-desc">
                                  <div class="image">
                                      <img src="assets/img/product-cameras.jpg" alt="" />
                                  </div>
                                  <div class="desc">
                                      <h4>Cameras</h4>
                                      <p>
                                          The 12-megapixel iSight camera captures sharp, detailed photos. It takes brilliant 4K video, up to four times the resolution of 1080p HD video. iPhone 6s also takes selfies worthy of a self-portrait with the new 5-megapixel FaceTime HD camera. And it introduces Live Photos, a new way to relive your favorite memories. It captures the moments just before and after your picture and sets it in motion with just the press of a finger.
                                      </p>
                                  </div>
                              </div>
                              <!-- END product-desc -->
                              <!-- BEGIN product-desc -->
                              <div class="product-desc right">
                                  <div class="image">
                                      <img src="assets/img/product-technology.jpg" alt="" />
                                  </div>
                                  <div class="desc">
                                      <h4>Technology</h4>
                                      <p>
                                          iPhone 6s is powered by the custom-designed 64-bit A9 chip. It delivers performance once found only in desktop computers. You’ll experience up to 70 percent faster CPU performance, and up to 90 percent faster GPU performance for all your favorite graphics-intensive games and apps.
                                      </p>
                                  </div>
                              </div>
                              <!-- END product-desc -->
                              <!-- BEGIN product-desc -->
                              <div class="product-desc">
                                  <div class="image">
                                      <img src="assets/img/product-design.jpg" alt="" />
                                  </div>
                                  <div class="desc">
                                      <h4>Design</h4>
                                      <p>
                                          Innovation isn’t always obvious to the eye, but look a little closer at iPhone 6s and you’ll find it’s been fundamentally improved. The enclosure is made from a new alloy of 7000 Series aluminum — the same grade used in the aerospace industry. The cover glass is the strongest, most durable glass used in any smartphone. And a new rose gold finish joins space gray, silver, and gold.
                                      </p>
                                  </div>
                              </div>
                              <!-- END product-desc -->
                          </div>
                          <!-- END #product-desc -->
                          <!-- BEGIN #product-info -->
                          <div class="tab-pane fade" id="product-info">
                              <!-- BEGIN table-responsive -->
                              <div class="table-responsive">
                                  <!-- BEGIN table-product -->
                                  <table class="table table-product table-striped">
                                      <thead>
                                          <tr>
                                              <th></th>
                                              <th>iPhone 6s</th>
                                              <th>iPhone 6s Plus</th>
                                          </tr>
                                      </thead>
                                      <tbody>
                                          <tr>
                                              <td class="field">Capacity</td>
                                              <td>
                                                  16GB<br />
                                                  64GB<br />
                                                  128GB
                                              </td>
                                              <td>
                                                  16GB<br />
                                                  64GB<br />
                                                  128GB
                                              </td>
                                          </tr>
                                          <tr>
                                              <td class="field">Weight and Dimensions</td>
                                              <td>
                                                  5.44 inches (138.3 mm) x 2.64 inches (67.1 mm) x 0.28 inch (7.1 mm)<br />
                                                  Weight: 5.04 ounces (143 grams)
                                              </td>
                                              <td>
                                                  6.23 inches (158.2 mm) x 3.07 inches (77.9 mm) x 0.29 inch (7.3 mm)<br />
                                                  Weight: 6.77 ounces (192 grams)
                                              </td>
                                          </tr>
                                          <tr>
                                              <td class="field">Display</td>
                                              <td>
                                                  Retina HD display with 3D Touch<br />
                                                  4.7-inch (diagonal) LED-backlit widescreen<br />
                                                  1334-by-750-pixel resolution at 326 ppi<br />
                                                  1400:1 contrast ratio (typical)<br />
                                                  <br />
                                                  <b>Both models:</b><br />
                                                  500 cd/m2 max brightness (typical)<br />
                                                  Full sRGB standard<br />
                                                  Dual-domain pixels for wide viewing angles<br />
                                                  Fingerprint-resistant oleophobic coating on front<br />
                                                  Support for display of multiple languages and characters simultaneously<br />
                                                  Display Zoom<br />
                                                  Reachability
                                              </td>
                                              <td>
                                                  Retina HD display with 3D Touch<br />
                                                  5.5-inch (diagonal) LED-backlit widescreen<br />
                                                  1920-by-1080-pixel resolution at 401 ppi<br />
                                                  1300:1 contrast ratio (typical)
                                              </td>
                                          </tr>
                                          <tr>
                                              <td class="field">Chip</td>
                                              <td colspan="2">
                                                  A9 chip with 64-bit architecture Embedded M9 motion coprocessor
                                              </td>
                                          </tr>
                                          <tr>
                                              <td class="field">iSight Camera</td>
                                              <td colspan="2">
                                                  New 12-megapixel iSight camera with 1.22µ pixels<br />
                                                  Live Photos<br />
                                                  Autofocus with Focus Pixels<br />
                                                  Optical image stabilization (iPhone 6s Plus only)<br />
                                                  True Tone flash<br />
                                                  Panorama (up to 63 megapixels)<br />
                                                  Auto HDR for photos<br />
                                                  Exposure control<br />
                                                  Burst mode<br />
                                                  Timer mode<br />
                                                  ƒ/2.2 aperture<br />
                                                  Five-element lens<br />
                                                  Hybrid IR filter<br />
                                                  Backside illumination sensor<br />
                                                  Sapphire crystal lens cover<br />
                                                  Auto image stabilization<br />
                                                  Improved local tone mapping<br />
                                                  Improved noise reduction<br />
                                                  Face detection<br />
                                                  Photo geotagging
                                              </td>
                                          </tr>
                                          <tr>
                                              <td class="field">Video Recording</td>
                                              <td colspan="2">
                                                  4K video recording (3840 by 2160) at 30 fps<br />
                                                  1080p HD video recording at 30 fps or 60 fps<br />
                                                  720p HD video recording at 30 fps<br />
                                                  Optical image stabilization for video (iPhone 6s Plus only)<br />
                                                  True Tone flash<br />
                                                  Slo-mo video support for 1080p at 120 fps and 720p at 240 fps<br />
                                                  Time-lapse video with stabilization<br />
                                                  Cinematic video stabilization (1080p and 720p)<br />
                                                  Continuous autofocus video<br />
                                                  Improved noise reduction<br />
                                                  Take 8MP still photos while recording 4K video<br />
                                                  Playback zoom<br />
                                                  3x zoom<br />
                                                  Face detection<br />
                                                  Video geotagging
                                              </td>
                                          </tr>
                                      </tbody>
                                  </table>
                                  <!-- END table-product -->
                              </div>
                              <!-- END table-responsive -->
                          </div>
                          <!-- END #product-info -->
                          <!-- BEGIN #product-reviews -->
                          <div class="tab-pane fade" id="product-reviews">
                              <!-- BEGIN row -->
                              <div class="row row-space-30">
                                  <!-- BEGIN col-7 -->
                                  <div class="col-md-7">
                                      <!-- BEGIN review -->
                                      <div class="review">
                                          <div class="review-info">
                                              <div class="review-icon"><img src="assets/img/user-1.jpg" alt="" /></div>
                                              <div class="review-rate">
                                                  <ul class="review-star">
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class=""><i class="fa fa-star-o"></i></li>
                                                  </ul>
                                                  (4/5)
                                              </div>
                                              <div class="review-name">Terry</div>
                                              <div class="review-date">24/05/2016 7:40am</div>
                                          </div>
                                          <div class="review-title">
                                              What does “SIM-free” mean?
                                          </div>                        
                                          <div class="review-message">
                                              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi in imperdiet augue. Integer non aliquam eros. Cras vehicula nec sapien pretium sagittis. Pellentesque feugiat lectus non malesuada aliquam. Etiam id tortor pretium, dictum leo at, malesuada tortor.
                                          </div>
                                      </div>
                                      <!-- END review -->
                                      <!-- BEGIN review -->
                                      <div class="review">
                                          <div class="review-info">
                                              <div class="review-icon"><img src="assets/img/user-2.jpg" alt="" /></div>
                                              <div class="review-rate">
                                                  <ul class="review-star">
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class=""><i class="fa fa-star-o"></i></li>
                                                      <li class=""><i class="fa fa-star-o"></i></li>
                                                  </ul>
                                                  (3/5)
                                              </div>
                                              <div class="review-name">George</div>
                                              <div class="review-date">24/05/2016 8:40am</div>
                                          </div>                     
                                          <div class="review-title">
                                              When I buy iPhone from apple.com, is it tied to a carrier or does it come “unlocked”?
                                          </div>                
                                          <div class="review-message">
                                              In mauris leo, maximus at pellentesque vel, pharetra vel risus. Aenean in semper velit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Morbi volutpat mattis neque, at molestie tellus ultricies quis. Ut lobortis odio nec nunc ullamcorper, vitae faucibus augue semper. Sed luctus lobortis nulla ac volutpat. Mauris blandit scelerisque sem.
                                          </div>
                                      </div>
                                      <!-- END review -->
                                      <!-- BEGIN review -->
                                      <div class="review">
                                          <div class="review-info">
                                              <div class="review-icon"><img src="assets/img/user-3.jpg" alt="" /></div>
                                              <div class="review-rate">
                                                  <ul class="review-star">
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                  </ul>
                                                  (5/5)
                                              </div>
                                              <div class="review-name">Steve</div>
                                              <div class="review-date">23/05/2016 8:40am</div>
                                          </div>                     
                                          <div class="review-title">
                                              Where is the iPhone Upgrade Program available?
                                          </div>                
                                          <div class="review-message">
                                              Duis ut nunc sem. Integer efficitur, justo sit amet feugiat hendrerit, arcu nisl elementum dui, in ultricies erat quam at mauris. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec nec ultrices tellus. Mauris elementum venenatis volutpat.
                                          </div>
                                      </div>
                                      <!-- END review -->
                                      <!-- BEGIN review -->
                                      <div class="review">
                                          <div class="review-info">
                                              <div class="review-icon"><img src="assets/img/user-4.jpg" alt="" /></div>
                                              <div class="review-rate">
                                                  <ul class="review-star">
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class=""><i class="fa fa-star-o"></i></li>
                                                      <li class=""><i class="fa fa-star-o"></i></li>
                                                      <li class=""><i class="fa fa-star-o"></i></li>
                                                  </ul>
                                                  (2/5)
                                              </div>
                                              <div class="review-name">Alfred</div>
                                              <div class="review-date">23/05/2016 10.02am</div>
                                          </div>                     
                                          <div class="review-title">
                                              Can I keep my current service plan if I choose the iPhone Upgrade Program?
                                          </div>                
                                          <div class="review-message">
                                              Donec vel fermentum quam. Vivamus scelerisque enim eget tristique auctor. Vivamus tempus, turpis iaculis tempus egestas, leo augue hendrerit tellus, et efficitur neque massa at neque. Aenean efficitur eleifend orci at ornare.
                                          </div>
                                      </div>
                                      <!-- END review -->
                                      <!-- BEGIN review -->
                                      <div class="review">
                                          <div class="review-info">
                                              <div class="review-icon"><img src="assets/img/user-5.jpg" alt="" /></div>
                                              <div class="review-rate">
                                                  <ul class="review-star">
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                      <li class="active"><i class="fa fa-star"></i></li>
                                                  </ul>
                                                  (5/5)
                                              </div>
                                              <div class="review-name">Edward</div>
                                              <div class="review-date">22/05/2016 9.30pm</div>
                                          </div>                     
                                          <div class="review-title">
                                              I have an existing carrier contract or installment plan. Can I purchase with the iPhone Upgrade Program
                                          </div>                
                                          <div class="review-message">
                                              Aliquam consequat ut turpis non interdum. Integer blandit erat nec sapien sollicitudin, a fermentum dui venenatis. Nullam consequat at enim et aliquet. Cras mattis turpis quis eros volutpat tristique vel a ligula. Proin aliquet leo mi, et euismod metus placerat sit amet.
                                          </div>
                                      </div>
                                      <!-- END review -->
                                  </div>
                                  <!-- END col-7 -->
                                  <!-- BEGIN col-5 -->
                                  <div class="col-md-5">
                                      <!-- BEGIN review-form -->
                                      <div class="review-form">
                                          <form action="product_detail.html" name="review_form" method="POST">
                                              <h2>Write a review</h2>
                                              <div class="form-group">
                                                  <label for="name">Name <span class="text-danger">*</span></label>
                                                  <input type="text" class="form-control" id="name" />
                                              </div>
                                              <div class="form-group">
                                                  <label for="email">Title <span class="text-danger">*</span></label>
                                                  <input type="text" class="form-control" id="email" />
                                              </div>
                                              <div class="form-group">
                                                  <label for="review">Review <span class="text-danger">*</span></label>
                                                  <textarea class="form-control" rows="8" id="review"></textarea>
                                              </div>
                                              <div class="form-group">
                                                  <label for="email">Rating  <span class="text-danger">*</span></label>
                                                  <div class="rating rating-selection" data-rating="true" data-target="rating">
                                                      <i class="fa fa-star-o" data-value="2"></i>
                                                      <i class="fa fa-star-o" data-value="4"></i>
                                                      <i class="fa fa-star-o" data-value="6"></i>
                                                      <i class="fa fa-star-o" data-value="8"></i>
                                                      <i class="fa fa-star-o" data-value="10"></i>
                                                      <span class="rating-comment">
                                                          <span class="rating-comment-tooltip">Click to rate</span>
                                                      </span>
                                                  </div>
                                                  <select name="rating" class="hide">
                                                      <option value="2">2</option>
                                                      <option value="4">4</option>
                                                      <option value="6">6</option>
                                                      <option value="8">8</option>
                                                      <option value="10">10</option>
                                                  </select>
                                              </div>            
                                              <button type="submit" class="btn btn-inverse btn-lg">Submit Review</button>
                                          </form>
                                      </div>
                                      <!-- END review-form --> 
                                  </div>
                                  <!-- END col-5 -->
                              </div>
                              <!-- END row -->
                          </div>
                          <!-- END #product-reviews -->
                      </div>
                      <!-- END #product-tab-content -->
                  </div>
                  <!-- END product-tab -->
              </div>
              <!-- END product -->
			</div>
            <!-- END container -->
        </div>
        <!-- END #product -->
   </jsp:body>
</t:store>