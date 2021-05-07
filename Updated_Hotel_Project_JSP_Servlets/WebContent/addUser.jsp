<!-- header -->
<%@include file="include/header.jsp" %>
<!-- end of header -->

<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			
			<form action="${pageContext.request.contextPath}/operation" method="post">
			
				Username: <input type="text" name="username" required="required"/><br>
				Email: <input type="email" name="email" required="required"/><br>
				Name: <input type="text" name="name" required="required"/><br>
				<h5>Address</h5>
				Street: <input type="text" name="street" class="streetInbox"/><br>
				City: <input type="" name="city" /> State: <input type="text" name="state" class="stateInbox"/> 
				Zip Code: <input type="text" name="zipCode" /><br>
				
				<input type="hidden" name="form" value="addUseroperation">
				<input type="submit" value="Add User"/><br>
			
			</form>
			
		</div>
	</div> 
</div>

<!-- footer -->
<%@include file="include/footer.jsp" %>
<!-- end of footer -->
