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
				City: <input type="text" name="city" /> State: <input type="text" name="state" class="stateInbox"/> 
				Zip Code: <input type="text" name="zipCode" /><br>
				<div class="form-check form-check-inline">
				  <input class="form-check-input" type="radio" name="is_international" value="false">
				  <label class="form-check-label" for="inlineRadio1">US address</label>
				</div>
				<div class="form-check form-check-inline">
				  <input class="form-check-input" type="radio" name="is_international" value="true">
				  <label class="form-check-label" for="inlineRadio2">International address</label>
				</div>
				<div class="form-check form-check-inline">
				  <input class="form-check-input" type="radio" name="is_international" value="spy" disabled>
				  <label class="form-check-label" for="inlineRadio3">Can't say im a spy</label>
				</div>
				
				<h5>Location of Hotel:</h5>
				<select id="location">
			    	<option value="none" selected disabled hidden>Select an option</option> 
			    	<option value="hotel1">The Lodge at Torrey Pines (La Jolla, CA)</option>
			    	<option value="hotel2">The Boxhouse Hotel (Brooklyn, NY)</option>
			    	<option value="hotel3">Chateau on the Lake (Branson, MO)</option>
			  	</select><br><br>
				
				<input type="hidden" name="form" value="addUseroperation">
				<input type="submit" value="Add User"/>
			
			</form>
			
		</div>
	</div> 
</div>

<!-- footer -->
<%@include file="include/footer.jsp" %>
<!-- end of footer -->
