<%@ include file="/init.jsp" %>


<div id="fullpage" style="height: 100%;position: relative;margin-left: -30px;margin-top: -76px;margin-right: -15px;">
	
	<!-- Fixed navbar -->
		<nav class="navbar navbar-default">
		  <div class="container">
			<div class="pull-right" style="margin-right:15px; font-size:22px; color:#0288cf; font-weight:bold;"><img src="<%=request.getContextPath()%>/images/phone-top-icon.png" style="float:left; margin-right:14px;" />1800-208-2525</div>
			<div class="clear"></div>
			<div class="navbar-header">
			  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			  </button>
			  <div id="logo">
				<a class="navbar-brand" href="/web/leykart/welcome"><img class="img-responsive" src="<%=request.getContextPath()%>/images/leykart-logo.png" alt="Leykart Ashok Leyland" /></a>
			  </div>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
			  <ul class="nav navbar-nav navbar-right">
				<li><a href="/web/leykart/welcome">HOME</a></li>
				<li><a href="/web/leykart/return-and-cancellation-policy">RETURN &amp; CANCELLATION POLICY</a></li>
				<li><a href="/web/leykart/faq">FAQ'S</a></li>
				<li class="active"><a href="enquiry">ENQUIRY</a></li>
			  </ul>
			</div><!--/.nav-collapse -->
		  </div>
		</nav>
		<!-- Fixed navbar end-->
		
		<!-- inner banner strat-->
		<div class="header-container enquiry-banners">
			<div class="container">
				<div class="txt-container">
				<h1>Enquiry</h1>
				</div>
			</div>
		</div>
		<!-- inner banner end-->
		
		<!-- Content start-->
		<div class="container">
				
				<div class="row mtmb30">
					<div class="col-md-8">
						<!-- Form Area -->
						<div class="contact-form">
							<!-- Form -->
							<div class="col-md-12 mb30"><h5 style="color:#757575; font-size:20px;">Please fill the below Enquiry form!</h5></div>
							
							<form id="contact-us" method="post" action="#">
								<!-- Left Inputs -->
								<div class="col-md-6">
									<!-- Name -->
									<input type="text" name="firstName" id="firstName" required="required" class="form" placeholder="First Name" />
									<!-- Lastname -->
									<input type="text" name="lastName" id="lastName" required="required" class="form" placeholder="Last Name" />
									<!-- Email -->
									<input type="email" name="mail" id="mail" required="required" class="form" placeholder="Email" />
								</div><!-- End Left Inputs -->
								<!-- Right Inputs -->
								<div class="col-md-6">
									<!-- Contact -->
									<input type="text" name="contactNumber" id="contactNumber" required="required" class="form" placeholder="Contact Number" />
									<!-- PartName -->
									<input type="text" name="partName" id="partName" required="required" class="form" placeholder="Part Name" />
									<!-- PartNumber -->
									<input type="text" name="partNumber" id="partNumber" required="required" class="form" placeholder="Part Number" />
								</div><!-- End Right Inputs -->
								<!-- Bottom Submit -->
								
								<div class="relative fullwidth col-md-12">
									<!-- Message -->
									<textarea name="message" id="message" class="form textarea"  placeholder="Message"></textarea>
								</div>
								
								<div class="relative fullwidth col-md-12">
									<!-- Send Button -->
									<div class="pull-left" style="margin-right:20px;"><button type="submit" id="submit" name="submit" class="btn btn-orange">SUBMIT</button></div>
									<div class="pull-left"><button id="cancel" name="cancel" class="btn btn-gray">CANCEL</button> </div>
								</div><!-- End Bottom Submit -->
								<!-- Clear -->
								
								<div class="clear"></div>
							</form>

							<!-- Your Mail Message -->
							<div class="mail-message-area">
								<!-- Message -->
								<div class="alert gray-bg mail-message not-visible-message">
									<strong>Thank You !</strong> Your email has been delivered.
								</div>
							</div>

						</div><!-- End Contact Form Area -->
					</div>
					
					<div class="col-md-1">
						<div class="verical-border"></div>
					</div>
					
					<div class="col-md-3">
						<img src="<%=request.getContextPath()%>/images/Address-logo.jpg" class="mb15" alt="Leykart logo" />
							<p>Lorem ipsum dolor sit amet,
							consectetur adipiscing elit. Integer varius tellus non nisl
							sodales semper.</p>
							
							<p class="phone-email"><img src="<%=request.getContextPath()%>/images/phone-icon.png" style="margin-right:14px;">1800-208-2525</p>
							<p class="phone-email"><img src="<%=request.getContextPath()%>/images/email-icon.png" style="margin-right:14px;"><a href="mailto:sales@leykart.com">sales@leykart.com</a></p>
					</div>
						
				</div>
				
		</div>
		<!-- Content end-->
		
		<!-- Footer Start-->
		<footer class="footer">
		  <div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="col-md-6 col-xs-12">
						© 2018 Ashok Leyland Limited, All Rights Reserved.
					</div>
					<div class="col-md-5 col-xs-12 privacy">
						<a href="/web/leykart/privacy-policy">Privacy Policy</a>&nbsp; &nbsp; | &nbsp; &nbsp;
						<a href="/web/leykart/terms-and-conditions">Terms &amp; Conditions</a>
					</div>
				</div>
			</div>
		  </div>
		</footer>
	<!-- Footer End-->
</div><!-- fullPageDiv End-->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/showup.js"></script>
	<script src="js/wow.js"></script>
	
	<script>
	  new WOW().init();
	  </script>
	<script>
		$('.carousel').carousel({
			interval: 3000
		})
		
	</script>
	<script>
		$(document).ready(function() {
		  $('#media').carousel({
			pause: true,
			interval: false,
		  });
		});
	</script>
<!-- <script type="text/javascript">
    var ismobile = (/iphone|ipad|ipod|android|blackberry|mini|windows\sce|palm/i.test(navigator.userAgent.toLowerCase()));

    if(!ismobile) document.write('<script src="/scrolloverflow.js"></script>');

</script> -->
</body>
</html>